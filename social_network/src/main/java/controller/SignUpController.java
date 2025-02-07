package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import view.SignUp;
import view.LoginAndRegister;
import common.Check;
import common.PasswordEncryptor;

public class SignUpController {

private SignUp signUpView;
private static Service serviced;

public SignUpController(SignUp view) {
    this.signUpView = view;

    this.signUpView.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.serviced = new Service();

    this.signUpView.getCreateAccount().addActionListener(evt -> CreateAccountActionPerformed(evt));
    this.signUpView.setVisible(true);

}

private void backActionPerformed(ActionEvent evt) {
    signUpView.setVisible(false);

    LoginAndRegister loginView = new LoginAndRegister();
    loginView.setVisible(true);

    signUpView.dispose();
}

private void CreateAccountActionPerformed(ActionEvent evt) {
    String username = signUpView.getUsernameText().getText().trim();
    String password = signUpView.getPassText().getText().trim();
    String email = signUpView.getEmailText().getText().trim();
    String passwordRecoveryQuestion = signUpView.getQuestionText().getText().trim();
    String passwordRecoveryAnswer = signUpView.getAnswer().getText().trim();

    if (username.isEmpty() || password.isEmpty() || email.isEmpty() || passwordRecoveryQuestion.isEmpty() || passwordRecoveryAnswer.isEmpty()) {
        JOptionPane.showMessageDialog(signUpView, "Please fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!signUpView.getAgreeCheckBox().isSelected()) {
        JOptionPane.showMessageDialog(signUpView, "You must agree with the license terms!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra email hợp lệ
    if (!Check.checkValidEmail(email)) {
        JOptionPane.showMessageDialog(signUpView, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra mật khẩu hợp lệ
    if (!Check.checkValidPassword(password)) {
        JOptionPane.showMessageDialog(signUpView, "Password must be at least 6 characters and include both letters and numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String hashedPassword = PasswordEncryptor.hashPassword(password);
    String hashedRecoveryAnswer = PasswordEncryptor.hashPassword(passwordRecoveryAnswer);

    int isUserAdded = serviced.addUser(username, hashedPassword, email, passwordRecoveryQuestion, hashedRecoveryAnswer);

    if (isUserAdded == 0) {
        JOptionPane.showMessageDialog(signUpView, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else if (isUserAdded == -1) {
        JOptionPane.showMessageDialog(signUpView, "Failed to create account.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(signUpView, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);

    }
}
}
