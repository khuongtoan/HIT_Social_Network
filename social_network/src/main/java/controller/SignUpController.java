package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import view.SignUp;
import view.LoginAndRegister;

public class SignUpController {

    private SignUp signUpView;
    private static Service serviced;

    public SignUpController(SignUp view) {
        this.signUpView = view;
        this.signUpView.setVisible(true);
        
        this.signUpView.getBack().addActionListener(evt -> backActionPerformed(evt));
        this.serviced = new Service();

        this.signUpView.getCreateAccount().addActionListener(evt -> CreateAccountActionPerformed(evt));
        
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
        String passwordRecovery = signUpView.getQuestionText().getText().trim();

        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || passwordRecovery.isEmpty()) {
            JOptionPane.showMessageDialog(signUpView, "Please fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean isUserAdded = serviced.addUser(username, password, email, passwordRecovery);

        if (isUserAdded) {
            JOptionPane.showMessageDialog(signUpView, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(signUpView, "Failed to create account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     
    
}
