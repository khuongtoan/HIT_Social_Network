package common;

import jakarta.persistence.EntityManager;
import model.Role;
import model.User;
import service.EntityManagerUtil;

public class Trash {
    public static void main(String[] args) {

        EntityManagerUtil.getEntityManager();

        String userName = "admin";
        String password = "123456a";
        String email = "admineSetting@gmail.com";
        String passwordRecovery = "code";
        String passwordRecoveryAnswer = "java";

        String hashedPassword = PasswordEncryptor.hashPassword(password);
        String hashedRecoveryAnswer = PasswordEncryptor.hashPassword(passwordRecoveryAnswer);

        // Tạo User mới
        User admin = new User(userName, hashedPassword, email, passwordRecovery, hashedRecoveryAnswer);
        admin.setRole(Role.ADMIN); 

        try {
            EntityManager entityManager = EntityManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(admin);
            entityManager.getTransaction().commit();
            System.out.println("Admin created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
