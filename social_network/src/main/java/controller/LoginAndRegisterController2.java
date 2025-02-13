package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Status;
import model.User;
import service.Service;
import service.ServiceInterfaces;
import view.ForgotPassword2;
import view.LoginAndRegister2;
import view.PersonalView2;
import view.SignUp2;

public class LoginAndRegisterController2 {

private final LoginAndRegister2 view;
private final ServiceInterfaces serviced;

public LoginAndRegisterController2(LoginAndRegister2 view) {
    this.view = view;
    this.serviced = new Service();
    this.view.getForgot().addActionListener(evt -> forgotActionPerformed(evt));
    this.view.getSignUp().addActionListener(evt -> signUptActionPerformed(evt));
    this.view.getLogin().addActionListener(evt -> logintActionPerformed(evt));

    this.view.setVisible(true);
}

private void forgotActionPerformed(ActionEvent evt) {
    view.setVisible(false);
    ForgotPassword2 forgotPassword = new ForgotPassword2();
    forgotPassword.setVisible(true);
    view.dispose();
}

private void signUptActionPerformed(ActionEvent evt) {
    view.setVisible(false);
    SignUp2 signUp2 = new SignUp2();
    signUp2.setVisible(true);
    view.dispose();
}

private void logintActionPerformed(ActionEvent evt) {
    String userName = this.view.getUserNameText().getText().trim();
    String password = new String(this.view.getPasswordText().getPassword()).trim();

    User loginUserEnter = this.serviced.authUser(userName, password);
    if (loginUserEnter == null) {
        JOptionPane.showMessageDialog(this.view, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    } else if (loginUserEnter.getStatus() == Status.BAN) {
        JOptionPane.showMessageDialog(this.view, "Your account has been banned. Please contact support.", "Account Banned", JOptionPane.WARNING_MESSAGE);
    } else {
        UserSession.setCurrentUser(loginUserEnter);
        this.view.setVisible(false);
        PersonalView2 mainview = new PersonalView2();
        mainview.setVisible(true);
        this.view.dispose();
    }
}

}
