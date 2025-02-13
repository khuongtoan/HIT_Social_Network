package view2;

import controller2.SettingController2;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import view.component.ButtonCustom;
import view.component.ExitButton;

public class SettingView2 extends javax.swing.JFrame {

private SettingController2 controll;

public SettingView2() {
    initComponents();
    setSize(500, 500);
    this.setLocationRelativeTo(null);
    setShape(new RoundRectangle2D.Double(0, 0, 500, 500, 40, 40));
    setCommon();
    controll = new SettingController2(this);
}

private void setCommon() {

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPopupMenu = new javax.swing.JPopupMenu();
        changePass = new javax.swing.JMenuItem();
        changeUserName = new javax.swing.JMenuItem();
        changeEmail = new javax.swing.JMenuItem();
        changeQuestion = new javax.swing.JMenuItem();
        changeRole = new javax.swing.JMenuItem();
        changeStatus = new javax.swing.JMenuItem();
        panelCustom1 = new view.component.PanelCustom();
        exitButton2 = new view.component.ExitButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        optionButton = new view.component.ButtonCustom();
        mainArea = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();

        adminPopupMenu.setPreferredSize(new java.awt.Dimension(200, 180));

        changePass.setText("Change password");
        adminPopupMenu.add(changePass);

        changeUserName.setText("Change userName");
        adminPopupMenu.add(changeUserName);

        changeEmail.setText("Change email");
        adminPopupMenu.add(changeEmail);

        changeQuestion.setText("change Question recovery");
        adminPopupMenu.add(changeQuestion);

        changeRole.setText("Change role user");
        adminPopupMenu.add(changeRole);

        changeStatus.setText("Change status user");
        adminPopupMenu.add(changeStatus);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCustom1.setColorDark("#78ffd6");
        panelCustom1.setColorLight("#a8ff78");
        panelCustom1.add(exitButton2);
        exitButton2.setBounds(460, 0, 35, 35);

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Back");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        panelCustom1.add(back);
        back.setBounds(0, 20, 72, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Setting");
        panelCustom1.add(jLabel1);
        jLabel1.setBounds(120, 20, 260, 50);
        panelCustom1.add(jSeparator1);
        jSeparator1.setBounds(0, 70, 500, 10);

        optionButton.setBackground(new java.awt.Color(0, 0, 0));
        optionButton.setForeground(new java.awt.Color(255, 255, 255));
        optionButton.setText("Option");
        panelCustom1.add(optionButton);
        optionButton.setBounds(10, 80, 100, 30);

        mainArea.setLayout(new javax.swing.BoxLayout(mainArea, javax.swing.BoxLayout.Y_AXIS));
        panelCustom1.add(mainArea);
        mainArea.setBounds(10, 130, 480, 340);

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (2).png"))); // NOI18N
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setFocusPainted(false);
        panelCustom1.add(logoutButton);
        logoutButton.setBounds(460, 80, 25, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {
    SettingView2 a = new SettingView2();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu adminPopupMenu;
    private javax.swing.JButton back;
    private javax.swing.JMenuItem changeEmail;
    private javax.swing.JMenuItem changePass;
    private javax.swing.JMenuItem changeQuestion;
    private javax.swing.JMenuItem changeRole;
    private javax.swing.JMenuItem changeStatus;
    private javax.swing.JMenuItem changeUserName;
    private view.component.ExitButton exitButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainArea;
    private view.component.ButtonCustom optionButton;
    private view.component.PanelCustom panelCustom1;
    // End of variables declaration//GEN-END:variables

    public JPopupMenu getAdminPopupMenu() {
        return adminPopupMenu;
    }

    public void setAdminPopupMenu(JPopupMenu adminPopupMenu) {
        this.adminPopupMenu = adminPopupMenu;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JMenuItem getChangeEmail() {
        return changeEmail;
    }

    public void setChangeEmail(JMenuItem changeEmail) {
        this.changeEmail = changeEmail;
    }

    public JMenuItem getChangePass() {
        return changePass;
    }

    public void setChangePass(JMenuItem changePass) {
        this.changePass = changePass;
    }

    public JMenuItem getChangeQuestion() {
        return changeQuestion;
    }

    public void setChangeQuestion(JMenuItem changeQuestion) {
        this.changeQuestion = changeQuestion;
    }

    public JMenuItem getChangeRole() {
        return changeRole;
    }

    public void setChangeRole(JMenuItem changeRole) {
        this.changeRole = changeRole;
    }

    public JMenuItem getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(JMenuItem changeStatus) {
        this.changeStatus = changeStatus;
    }

    public JMenuItem getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(JMenuItem changeUserName) {
        this.changeUserName = changeUserName;
    }

    public ExitButton getExitButton2() {
        return exitButton2;
    }

    public void setExitButton2(ExitButton exitButton2) {
        this.exitButton2 = exitButton2;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(JButton logoutButton) {
        this.logoutButton = logoutButton;
    }

    public JPanel getMainArea() {
        return mainArea;
    }

    public void setMainArea(JPanel mainArea) {
        this.mainArea = mainArea;
    }

    public ButtonCustom getOptionButton() {
        return optionButton;
    }

    public void setOptionButton(ButtonCustom optionButton) {
        this.optionButton = optionButton;
    }

}
