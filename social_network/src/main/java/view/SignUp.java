package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignUp extends javax.swing.JFrame {


public SignUp() {
    initComponents();
    setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    setTitle("Lifebook-WATO");
    
}


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        agreeCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createAccText = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE AN ACCOUNT");

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo (2).png"))); // NOI18N
        back.setText("back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel2.setText("Username :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 20));

        usernameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        jPanel3.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 360, 30));

        passText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });
        jPanel3.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 360, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pass.png"))); // NOI18N
        jLabel3.setText("Password :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, 20));

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel3.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 360, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail.png"))); // NOI18N
        jLabel4.setText("Email :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Question Recovery :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 20));

        questionText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });
        jPanel3.add(questionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 360, 30));

        agreeCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agreeCheckBox.setForeground(new java.awt.Color(56, 181, 234));
        agreeCheckBox.setText("I agree with license");
        jPanel3.add(agreeCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 170, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html> Make sure your password is at  least 8 characters long<br>and contains both letters  and  numbers.</html> ");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 230, 130));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Good");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 60, 30));

        createAccText.setBackground(new java.awt.Color(0, 102, 102));
        createAccText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createAccText.setForeground(new java.awt.Color(255, 255, 255));
        createAccText.setText("Create an Account");
        createAccText.setOpaque(true);
        jPanel3.add(createAccText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 200, 50));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextActionPerformed


public static void main(String args[]) {
   java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        try {
            // Thiết lập Look and Feel cho ứng dụng, đây là Nimbus Look and Feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            // Khởi tạo giao diện của ứng dụng sau khi thiết lập Look and Feel
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
            });
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JButton back;
    private javax.swing.JButton createAccText;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField passText;
    private javax.swing.JTextField questionText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
