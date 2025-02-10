package view2;

import java.awt.geom.RoundRectangle2D;

public class LoginAndRegister2 extends javax.swing.JFrame {

public LoginAndRegister2() {
    initComponents();
    setSize(400, 470);
    this.setLocationRelativeTo(null);
    setShape(new RoundRectangle2D.Double(0, 0, 400, 470, 40, 40));
    userNamePanel.setTitle("User name");
    passwordPanel.setTitle("Your password");
    userNamePanel.setUrl("user.png");
    passwordPanel.setUrl("pass.png");
    panelCustom1.setColorDark("#99f2c8");
    panelCustom1.setColorLight("#1f4037");
    
    this.setVisible(true);
    
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
        passwordPanel = new view.component.TextFieldCustom();
        userNamePanel = new view.component.TextFieldCustom();

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
        panelCustom1.add(passwordPanel);
        passwordPanel.setBounds(20, 160, 340, 60);
        panelCustom1.add(userNamePanel);
        userNamePanel.setBounds(20, 90, 340, 60);

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

public static void main(String args[]) {
    LoginAndRegister2 a = new LoginAndRegister2();
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.component.ExitButton exitButton1;
    private view.component.ButtonCustom forgot;
    private javax.swing.JLabel jLabel1;
    private view.component.ButtonCustom login;
    private view.component.PanelCustom panelCustom1;
    private view.component.TextFieldCustom passwordPanel;
    private view.component.ButtonCustom signUp;
    private view.component.TextFieldCustom userNamePanel;
    // End of variables declaration//GEN-END:variables
}
