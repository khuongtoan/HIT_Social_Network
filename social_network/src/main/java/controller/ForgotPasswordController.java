package controller;

import static common.Check.checkValidPassword;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import service.ServiceInterfaces;
import view.ForgotPassword;
import view.LoginAndRegister;

public class ForgotPasswordController {

private ForgotPassword view;
private static ServiceInterfaces serviced;

public ForgotPasswordController(ForgotPassword forgotPassword) {
    this.view = forgotPassword;
    this.serviced = new Service();
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.view.getChangePass().addActionListener(evt -> changePasswordActionPerformed(evt));
    this.view.getGetQuestion().addActionListener(evt -> getQuestionActionPerformed(evt));

    this.view.setVisible(true);
}

private void backActionPerformed(ActionEvent evt) {
    view.setVisible(false);
    LoginAndRegister loginAndRegister = new LoginAndRegister();
    loginAndRegister.setVisible(true);
    view.dispose();
}

private void getQuestionActionPerformed(ActionEvent evt) {
    String userName = view.getUserNameText().getText().trim();
    this.view.getQuestionLabel().setText(serviced.getPasswordRecoveryQuestion(userName));
}

private void changePasswordActionPerformed(ActionEvent evt) {
    
    String userName = view.getUserNameText().getText().trim();
    String answer = view.getAnswerText().getText().trim();
    String newPassword = new String(view.getNewPassText().getPassword()).trim();

    if (newPassword.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!checkValidPassword(newPassword)) {
        JOptionPane.showMessageDialog(view, "Password must be at least 6 characters long and contain both letters and numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean auth = serviced.verifyRecoveryInfo(userName, answer);

    if (auth) {
        boolean isPasswordChanged = serviced.changePasswordByUserName(userName, newPassword);
        if (isPasswordChanged) {
            JOptionPane.showMessageDialog(view, "Password changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to change password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(view, "Incorrect recovery information.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}
