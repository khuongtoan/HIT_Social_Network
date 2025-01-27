package view;

import java.awt.Toolkit;
import static view.component.RoundedTextField.textF;


public class AdminSettingView extends javax.swing.JFrame {

public AdminSettingView() {
    initComponents();
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    textF(searchTF,jPanel1);
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
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(searchTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        changePass.setPreferredSize(new java.awt.Dimension(220, 27));
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
        changeUserName.setPreferredSize(new java.awt.Dimension(220, 27));
        jPanel4.add(changeUserName);

        jPanel2.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(390, 50));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        changeEmail.setBackground(new java.awt.Color(0, 105, 105));
        changeEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeEmail.setForeground(new java.awt.Color(255, 255, 255));
        changeEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeEmail.setText("change email");
        changeEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changeEmail.setPreferredSize(new java.awt.Dimension(220, 27));
        jPanel6.add(changeEmail);

        jPanel2.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(390, 50));

        changeQuestion.setBackground(new java.awt.Color(0, 105, 105));
        changeQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeQuestion.setForeground(new java.awt.Color(255, 255, 255));
        changeQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        changeQuestion.setText("change Question recovery");
        changeQuestion.setPreferredSize(new java.awt.Dimension(220, 27));
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
        changeRole.setPreferredSize(new java.awt.Dimension(220, 27));
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
        changeStatus.setPreferredSize(new java.awt.Dimension(220, 27));
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

public static void main(String args[]) {
   
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new AdminSettingView().setVisible(true);
    }
    });
}



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
    private javax.swing.JPanel mainArea;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables
}
