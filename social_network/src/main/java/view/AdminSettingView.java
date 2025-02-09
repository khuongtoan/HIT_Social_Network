package view;

import controller.AdminSettingController;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import static view.component.RoundedTextField.textF;


public class AdminSettingView extends javax.swing.JFrame {

private AdminSettingController adminSettingController;

public AdminSettingView() {
    initComponents();
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    textF(searchTF,jPanel1);
    this.adminSettingController = new AdminSettingController(this);
    
}

public static void main(String []args){
    AdminSettingView a = new AdminSettingView();
    
}



@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        home = new javax.swing.JLabel();
        game = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        changePass = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        changeUserName = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        changeEmail = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        changeQuestion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        changeRole = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        changeStatus = new javax.swing.JButton();
        mainArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 10));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel7.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo (2).png"))); // NOI18N
        back.setText("back");

        searchTF.setBackground(new java.awt.Color(240, 240, 240));
        searchTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTF.setText("search");
        searchTF.setOpaque(true);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home (3).png"))); // NOI18N

        game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game (2).png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(game)
                .addGap(127, 127, 127)
                .addComponent(logoutButton)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(game, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(searchTF)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        jPanel2.setBackground(new java.awt.Color(0, 105, 105));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(390, 50));

        changePass.setBackground(new java.awt.Color(0, 105, 105));
        changePass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changePass.setForeground(new java.awt.Color(255, 255, 255));
        changePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changePass.setText("change password");
        changePass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changePass.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel3.add(changePass);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(390, 50));

        changeUserName.setBackground(new java.awt.Color(0, 105, 105));
        changeUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeUserName.setForeground(new java.awt.Color(255, 255, 255));
        changeUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeUserName.setText("change username");
        changeUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeUserName.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel4.add(changeUserName);

        jPanel2.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(390, 50));

        changeEmail.setBackground(new java.awt.Color(0, 105, 105));
        changeEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeEmail.setForeground(new java.awt.Color(255, 255, 255));
        changeEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeEmail.setText("change email");
        changeEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeEmail.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel6.add(changeEmail);

        jPanel2.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(390, 50));

        changeQuestion.setBackground(new java.awt.Color(0, 105, 105));
        changeQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeQuestion.setForeground(new java.awt.Color(255, 255, 255));
        changeQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeQuestion.setText("change Question recovery");
        changeQuestion.setMaximumSize(new java.awt.Dimension(220, 27));
        changeQuestion.setPreferredSize(new java.awt.Dimension(225, 40));
        jPanel5.add(changeQuestion);

        jPanel2.add(jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(390, 50));

        changeRole.setBackground(new java.awt.Color(0, 105, 105));
        changeRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeRole.setForeground(new java.awt.Color(255, 255, 255));
        changeRole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeRole.setText("change Role user");
        changeRole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeRole.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel8.add(changeRole);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(390, 50));

        changeStatus.setBackground(new java.awt.Color(0, 105, 105));
        changeStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeStatus.setForeground(new java.awt.Color(255, 255, 255));
        changeStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeStatus.setText("change status user");
        changeStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeStatus.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel9.add(changeStatus);

        jPanel2.add(jPanel9);

        mainArea.setBackground(new java.awt.Color(0, 105, 105));
        mainArea.setPreferredSize(new java.awt.Dimension(790, 200));
        mainArea.setLayout(new javax.swing.BoxLayout(mainArea, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(mainArea);

        jPanel7.add(jPanel2);
        jPanel2.setBounds(0, 50, 800, 450);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton changeEmail;
    private javax.swing.JButton changePass;
    private javax.swing.JButton changeQuestion;
    private javax.swing.JButton changeRole;
    private javax.swing.JButton changeStatus;
    private javax.swing.JButton changeUserName;
    private javax.swing.JLabel game;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainArea;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JButton getChangeEmail() {
        return changeEmail;
    }

    public void setChangeEmail(JButton changeEmail) {
        this.changeEmail = changeEmail;
    }

    public JButton getChangePass() {
        return changePass;
    }

    public void setChangePass(JButton changePass) {
        this.changePass = changePass;
    }

    public JButton getChangeQuestion() {
        return changeQuestion;
    }

    public void setChangeQuestion(JButton changeQuestion) {
        this.changeQuestion = changeQuestion;
    }

    public JButton getChangeRole() {
        return changeRole;
    }

    public void setChangeRole(JButton changeRole) {
        this.changeRole = changeRole;
    }

    public JButton getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(JButton changeStatus) {
        this.changeStatus = changeStatus;
    }

    public JButton getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(JButton changeUserName) {
        this.changeUserName = changeUserName;
    }

    public JLabel getGame() {
        return game;
    }

    public void setGame(JLabel game) {
        this.game = game;
    }

    public JLabel getHome() {
        return home;
    }

    public void setHome(JLabel home) {
        this.home = home;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JPanel getMainArea() {
        return mainArea;
    }

    public void setMainArea(JPanel mainArea) {
        this.mainArea = mainArea;
    }

    public JTextField getSearchTF() {
        return searchTF;
    }

    public void setSearchTF(JTextField searchTF) {
        this.searchTF = searchTF;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(JButton logoutButton) {
        this.logoutButton = logoutButton;
    }




}
