package dao;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import common.PasswordEncryptor;
import common.Check;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Role;
import model.Status;
import model.User;
import service.EntityManagerUtil;

public class UserDao {
	static EntityManager entityManager = EntityManagerUtil.getEntityManager();

	public UserDao() {
	}

	public static boolean addUser(String userName, String password, String email, String passwordRecovery, String passwordRecoveryAnswer) {
		try {
			User user = new User(userName, password, email, passwordRecovery, passwordRecoveryAnswer );
			entityManager.getTransaction().begin();
			entityManager.persist(user);
			entityManager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean deleteUser(int UserId) {
		try {
			User user = entityManager.find(User.class, UserId);
			if (user != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(user);
				entityManager.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updatePassword(int userId, String oldPassword, String newPassword) {
		try {
			User user = entityManager.find(User.class, userId);

			if (user != null) {
				if (BCrypt.checkpw(oldPassword, user.getPassword())) {

					String hashedNewPassword = PasswordEncryptor.hashPassword(newPassword);

					user.setPassword(hashedNewPassword);

					entityManager.getTransaction().begin();
					entityManager.merge(user);
					entityManager.getTransaction().commit();
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updateEmail(int userId, String newEmail) {
		try {
			if (!Check.checkValidEmail(newEmail)) {
				return false;
			}
			User user = entityManager.find(User.class, userId);

			if (user != null) {
				user.setEmail(newEmail);

				entityManager.getTransaction().begin();
				entityManager.merge(user);
				entityManager.getTransaction().commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updatePasswordRecovery(int userId, String newPasswordRecovery) {
		try {
			User user = entityManager.find(User.class, userId);

			if (user != null) {
				user.setPasswordRecovery(newPasswordRecovery);

				entityManager.getTransaction().begin();
				entityManager.merge(user);
				entityManager.getTransaction().commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updateRole(int userId, Role newRole) {
		try {
			User user = entityManager.find(User.class, userId);

			if (user != null) {
				user.setRole(newRole);

				entityManager.getTransaction().begin();
				entityManager.merge(user);
				entityManager.getTransaction().commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updateStatus(int userId, Status newStatus) {
		try {
			User user = entityManager.find(User.class, userId);

			if (user != null) {
				user.setStatus(newStatus);

				entityManager.getTransaction().begin();
				entityManager.merge(user);
				entityManager.getTransaction().commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static List<User> searchByUsername(String keyword) {
		try {
			String queryStr = "SELECT u FROM User u WHERE u.username LIKE :keyword";
			TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);

			query.setParameter("keyword", "%" + keyword.trim() + "%");

			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
        
        public static boolean verifyRecoveryInfo(String email, String question, String answer) {
        try {
            // Truy vấn người dùng theo email
            String queryStr = "SELECT u FROM User u WHERE u.email = :email";
            TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
            query.setParameter("email", email);

            User user = query.getSingleResult();

            // Kiểm tra câu hỏi và câu trả lời khôi phục
            if (user != null && user.getPasswordRecovery().equals(question) && user.getPasswordRecoveryAnswer().equals(answer)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false; 
        }
    }

    // Thay đổi mật khẩu theo email
    public static boolean changePasswordByEmail(String email, String newPassword) {
        try {
            // Kiểm tra nếu mật khẩu mới hợp lệ
            String hashedNewPassword = PasswordEncryptor.hashPassword(newPassword);

            // Truy vấn người dùng theo email
            String queryStr = "SELECT u FROM User u WHERE u.email = :email";
            TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
            query.setParameter("email", email);

            User user = query.getSingleResult();

            if (user != null) {
                user.setPassword(hashedNewPassword);

                entityManager.getTransaction().begin();
                entityManager.merge(user);
                entityManager.getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            return false;
        }
    }

}
