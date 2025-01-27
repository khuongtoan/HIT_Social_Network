package controller;

import view.ForgotPassword;
import view.LoginAndRegister;

public class LoginAndRegisterController {

    private LoginAndRegister loginAndRegister;

    public LoginAndRegisterController(LoginAndRegister loginAndRegister) {
        this.loginAndRegister = loginAndRegister;

        this.loginAndRegister.getForgot().addActionListener(evt -> forgotActionPerformed(evt));
    }

    private void forgotActionPerformed(java.awt.event.ActionEvent evt) {
        loginAndRegister.setVisible(false);
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.setVisible(true);
        loginAndRegister.dispose();
    }  
}
