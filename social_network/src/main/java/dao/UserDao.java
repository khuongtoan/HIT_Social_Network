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

public static int addUser(String userName, String password, String email, String passwordRecovery, String passwordRecoveryAnswer) {
    try {
        String query = "SELECT u FROM User u WHERE u.userName = :userName";
        List<User> existingUsers = entityManager.createQuery(query, User.class)
                .setParameter("userName", userName)
                .getResultList();

        if (!existingUsers.isEmpty()) {
            return 1;
        }

        User user = new User(userName, password, email, passwordRecovery, passwordRecoveryAnswer);
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        return 0;
    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        e.printStackTrace();

        return -1;
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
        e.printStackTrace();

        return false;
    }
}

public static boolean updateUserName(int userId, String newUserName) {
    try {
        // Kiểm tra xem username mới có tồn tại hay không
        String queryStr = "SELECT u FROM User u WHERE u.userName = :userName";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("userName", newUserName);
        List<User> existingUsers = query.getResultList();

        if (!existingUsers.isEmpty()) {
            return false; // Username đã tồn tại
        }

        User user = entityManager.find(User.class, userId);
        if (user != null) {
            user.setUserName(newUserName);

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
        e.printStackTrace();
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
        e.printStackTrace();

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
        e.printStackTrace();

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
        e.printStackTrace();

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
        e.printStackTrace();

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
        e.printStackTrace();

        return false;
    }
}

public static List<User> searchByUsername(String keyword) {
    try {
        String queryStr = "SELECT u FROM User u WHERE u.userName LIKE :keyword";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);

        query.setParameter("keyword", "%" + keyword.trim() + "%");

        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();

        return null;
    }
}

// kiểm tra câu hỏi khôi phục có đúng ko 1
public static boolean verifyRecoveryInfo(String userName, String answer) {
    try {
        String queryStr = "SELECT u FROM User u WHERE u.userName = :name";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("name", userName);

        User user = query.getSingleResult();

        return user != null && BCrypt.checkpw(answer, user.getPasswordRecoveryAnswer());
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

// thay đổi mật khẩu bằng user name 1
public static boolean changePasswordByUserName(String userName, String newPassword) {
    try {
        String hashedNewPassword = PasswordEncryptor.hashPassword(newPassword);
        String queryStr = "SELECT u FROM User u WHERE u.userName = :name";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("name", userName);

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
        e.printStackTrace();

        return false;
    }
}

// đăng nhập 1
public static User authUser(String username, String password) {
    try {
        String queryStr = "SELECT u FROM User u WHERE u.userName = :username";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("username", username);

        List<User> users = query.getResultList();

        if (users.isEmpty()) {
            return null;
        }
        User user = users.get(0);

        if (BCrypt.checkpw(password, user.getPassword())) {
            return user;
        } else {
            return null;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

public static boolean checkPasswordCurrentUser (String username, String password) {
    try {
        String queryStr = "SELECT u FROM User u WHERE u.userName = :username";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("username", username);

        List<User> users = query.getResultList();

        if (users.isEmpty()) {
            return false;
        }
        User user = users.get(0);

        if (BCrypt.checkpw(password, user.getPassword())) {
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

// lấy câu hỏi khôi phục bằng user name 1
public static String getPasswordRecoveryQuestion(String userName) {
    try {
        String queryStr = "SELECT u FROM User u WHERE u.userName = :name";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("name", userName);

        User user = query.getSingleResult();
        return user != null ? user.getPasswordRecovery() : null;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

}
