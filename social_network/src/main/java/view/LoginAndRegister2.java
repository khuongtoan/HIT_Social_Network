package view;

import controller.LoginAndRegisterController2;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import view.component.ButtonCustom;
import view.component.ExitButton;
import view.component.PasswordFieldCustom;
import view.component.TextFieldCustom;

public class LoginAndRegister2 extends javax.swing.JFrame {

private LoginAndRegisterController2 controll;

public LoginAndRegister2() {
    initComponents();
    setSize(400, 470);
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));

    this.setLocationRelativeTo(null);
    setShape(new RoundRectangle2D.Double(0, 0, 400, 470, 40, 40));
    setCommon();
    controll = new LoginAndRegisterController2(this);
}

public void setCommon() {
    userNameText.setTitle("User name");
    PasswordText.setTitle("Your password");
    userNameText.setUrl("user.png");
    PasswordText.setUrl("pass.png");
    panelCustom1.setColorDark("#99f2c8");
    panelCustom1.setColorLight("#1f4037");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new view.component.PanelCustom();
        jLabel1 = new javax.swing.JLabel();
        exitButton1 = new view.component.ExitButton();
        forgot = new view.component.ButtonCustom();
        login = new view.component.ButtonCustom();
        signUp = new view.component.ButtonCustom();
        userNameText = new view.component.TextFieldCustom();
        PasswordText = new view.component.PasswordFieldCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome back");
        panelCustom1.add(jLabel1);
        jLabel1.setBounds(50, 30, 260, 50);
        panelCustom1.add(exitButton1);
        exitButton1.setBounds(360, 0, 35, 35);

        forgot.setBackground(new java.awt.Color(51, 51, 51));
        forgot.setForeground(new java.awt.Color(255, 255, 255));
        forgot.setText("Forgot yout password ?");
        panelCustom1.add(forgot);
        forgot.setBounds(190, 370, 180, 30);

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        panelCustom1.add(login);
        login.setBounds(120, 260, 140, 40);

        signUp.setBackground(new java.awt.Color(51, 51, 51));
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign up");
        panelCustom1.add(signUp);
        signUp.setBounds(40, 370, 130, 30);
        panelCustom1.add(userNameText);
        userNameText.setBounds(20, 90, 340, 60);
        panelCustom1.add(PasswordText);
        PasswordText.setBounds(20, 160, 340, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//public static void main(String args[]) {
//    LoginAndRegister2 a = new LoginAndRegister2();
//
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.component.PasswordFieldCustom PasswordText;
    private view.component.ExitButton exitButton1;
    private view.component.ButtonCustom forgot;
    private javax.swing.JLabel jLabel1;
    private view.component.ButtonCustom login;
    private view.component.PanelCustom panelCustom1;
    private view.component.ButtonCustom signUp;
    private view.component.TextFieldCustom userNameText;
    // End of variables declaration//GEN-END:variables

public PasswordFieldCustom getPasswordText() {
    return PasswordText;
}

public void setPasswordText(PasswordFieldCustom PasswordText) {
    this.PasswordText = PasswordText;
}

public ExitButton getExitButton1() {
    return exitButton1;
}

public void setExitButton1(ExitButton exitButton1) {
    this.exitButton1 = exitButton1;
}

public ButtonCustom getForgot() {
    return forgot;
}

public void setForgot(ButtonCustom forgot) {
    this.forgot = forgot;
}

public ButtonCustom getLogin() {
    return login;
}

public void setLogin(ButtonCustom login) {
    this.login = login;
}

public ButtonCustom getSignUp() {
    return signUp;
}

public void setSignUp(ButtonCustom signUp) {
    this.signUp = signUp;
}

public TextFieldCustom getUserNameText() {
    return userNameText;
}

public void setUserNameText(TextFieldCustom userNameText) {
    this.userNameText = userNameText;
}

}
