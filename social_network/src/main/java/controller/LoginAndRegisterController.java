package controller;

import java.awt.event.ActionEvent;
import view.ForgotPassword;
import view.LoginAndRegister;
import view.SignUp;

public class LoginAndRegisterController {

    private LoginAndRegister loginAndRegister;

    public LoginAndRegisterController(LoginAndRegister view) {
        this.loginAndRegister = view;
        this.loginAndRegister.getForgot().addActionListener(evt -> forgotActionPerformed(evt));
        this.loginAndRegister.getSignUp().addActionListener(evt -> signUptActionPerformed(evt));
        this.loginAndRegister.setVisible(true);
    }

    private void forgotActionPerformed(java.awt.event.ActionEvent evt) {
        loginAndRegister.setVisible(false);
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.setVisible(true);
        loginAndRegister.dispose();
    }  

    private void signUptActionPerformed(ActionEvent evt) {
        loginAndRegister.setVisible(false);
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        loginAndRegister.dispose();
    }
    
    
    
}
