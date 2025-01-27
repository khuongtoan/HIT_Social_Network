package controller;

import java.awt.event.ActionEvent;
import view.ForgotPassword;
import view.LoginAndRegister;

public class ForgotPasswordController {

private ForgotPassword forgotPassword;

public ForgotPasswordController(ForgotPassword forgotPassword) {
    this.forgotPassword = forgotPassword;
    this.forgotPassword.getBack().addActionListener(evt -> backActionPerformed(evt));
}

private void backActionPerformed(ActionEvent evt) {
    forgotPassword.setVisible(false);
    LoginAndRegister loginAndRegister = new LoginAndRegister();
    loginAndRegister.setVisible(true);
    forgotPassword.dispose();
}

}
