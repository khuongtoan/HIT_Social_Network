package controller2;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import common.Check;
import common.PasswordEncryptor;
import service.ServiceInterfaces;
import view2.LoginAndRegister2;
import view2.SignUp2;

public class SignUpController2 {

private final SignUp2 view;
private static ServiceInterfaces serviced;

public SignUpController2(SignUp2 view) {
    this.view = view;

    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.serviced = new Service();

    this.view.getCreateAccount().addActionListener(evt -> CreateAccountActionPerformed(evt));
    this.view.setVisible(true);

}

private void backActionPerformed(ActionEvent evt) {
    view.setVisible(false);

    LoginAndRegister2 loginView = new LoginAndRegister2();
    loginView.setVisible(true);

    view.dispose();
}

private void CreateAccountActionPerformed(ActionEvent evt) {
    String username = view.getUsernameText().getText().trim();
    String password = view.getPassText().getText().trim();
    String email = view.getEmailText().getText().trim();
    String passwordRecoveryQuestion = view.getQuestionText().getText().trim();
    String passwordRecoveryAnswer = view.getAnswer().getText().trim();

    if (username.isEmpty() || password.isEmpty() || email.isEmpty() || passwordRecoveryQuestion.isEmpty() || passwordRecoveryAnswer.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!view.getAgreeCheckBox().isSelected()) {
        JOptionPane.showMessageDialog(view, "You must agree with the license terms!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra email hợp lệ
    if (!Check.checkValidEmail(email)) {
        JOptionPane.showMessageDialog(view, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra mật khẩu hợp lệ
    if (!Check.checkValidPassword(password)) {
        JOptionPane.showMessageDialog(view, "Password must be at least 6 characters and include both letters and numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String hashedPassword = PasswordEncryptor.hashPassword(password);
    String hashedRecoveryAnswer = PasswordEncryptor.hashPassword(passwordRecoveryAnswer);

    int isUserAdded = serviced.addUser(username, hashedPassword, email, passwordRecoveryQuestion, hashedRecoveryAnswer);

    if (isUserAdded == 0) {
        JOptionPane.showMessageDialog(view, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else if (isUserAdded == -1) {
        JOptionPane.showMessageDialog(view, "Failed to create account.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(view, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);

    }
}
}
