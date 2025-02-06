package view;

import controller.ForgotPasswordController;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ForgotPassword extends javax.swing.JFrame {

private ForgotPasswordController controll;

public ForgotPassword() {
    initComponents();
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    getContentPane().setBackground(new Color(0, 102, 102));
    controll = new ForgotPasswordController(this);
}


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newPassText = new javax.swing.JPasswordField();
        answerText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        changePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setBackground(new java.awt.Color(56, 181, 234));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel4.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 500));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo (2).png"))); // NOI18N
        back.setText("back");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(456, 456, 456))
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(0, 0, 370, 500);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD RECOVERY");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, -1));

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("New password:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));
        jPanel7.add(newPassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 320, 30));

        answerText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel7.add(answerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Your answer:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, -1));

        questionText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel7.add(questionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Question:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel7.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail.png"))); // NOI18N
        jLabel3.setText("Email :  ");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        changePass.setBackground(new java.awt.Color(0, 102, 102));
        changePass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changePass.setForeground(new java.awt.Color(255, 255, 255));
        changePass.setText("Change password");
        jPanel7.add(changePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jPanel4.add(jPanel7);
        jPanel7.setBounds(370, 0, 430, 500);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new ForgotPassword().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerText;
    private javax.swing.JButton back;
    private javax.swing.JButton changePass;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField newPassText;
    private javax.swing.JTextField questionText;
    // End of variables declaration//GEN-END:variables

public JButton getBack() {
    return back;
}

public void setBack(JButton back) {
    this.back = back;
}

public JButton getjButton1() {
    return changePass;
}

public void setjButton1(JButton jButton1) {
    this.changePass = jButton1;
}

public JLabel getjLabel2() {
    return jLabel2;
}

public void setjLabel2(JLabel jLabel2) {
    this.jLabel2 = jLabel2;
}

public JLabel getjLabel3() {
    return jLabel3;
}

public void setjLabel3(JLabel jLabel3) {
    this.jLabel3 = jLabel3;
}

public JLabel getjLabel6() {
    return jLabel6;
}

public void setjLabel6(JLabel jLabel6) {
    this.jLabel6 = jLabel6;
}

public JLabel getjLabel7() {
    return jLabel7;
}

public void setjLabel7(JLabel jLabel7) {
    this.jLabel7 = jLabel7;
}

public JLabel getjLabel8() {
    return jLabel8;
}

public void setjLabel8(JLabel jLabel8) {
    this.jLabel8 = jLabel8;
}

public JPanel getjPanel2() {
    return jPanel2;
}

public void setjPanel2(JPanel jPanel2) {
    this.jPanel2 = jPanel2;
}

public JPanel getjPanel4() {
    return jPanel4;
}

public void setjPanel4(JPanel jPanel4) {
    this.jPanel4 = jPanel4;
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

public JPasswordField getjPasswordField1() {
    return newPassText;
}

public void setjPasswordField1(JPasswordField jPasswordField1) {
    this.newPassText = jPasswordField1;
}

public JTextField getjTextField2() {
    return emailText;
}

public void setjTextField2(JTextField jTextField2) {
    this.emailText = jTextField2;
}

public JTextField getjTextField3() {
    return questionText;
}

public void setjTextField3(JTextField jTextField3) {
    this.questionText = jTextField3;
}

public JTextField getjTextField4() {
    return answerText;
}

public void setjTextField4(JTextField jTextField4) {
    this.answerText = jTextField4;
}

    public JTextField getAnswerText() {
        return answerText;
    }

    public void setAnswerText(JTextField answerText) {
        this.answerText = answerText;
    }

    public JButton getChangePass() {
        return changePass;
    }

    public void setChangePass(JButton changePass) {
        this.changePass = changePass;
    }

    public JTextField getEmailText() {
        return emailText;
    }

    public void setEmailText(JTextField emailText) {
        this.emailText = emailText;
    }

    public JPasswordField getNewPassText() {
        return newPassText;
    }

    public void setNewPassText(JPasswordField newPassText) {
        this.newPassText = newPassText;
    }

    public JTextField getQuestionText() {
        return questionText;
    }

    public void setQuestionText(JTextField questionText) {
        this.questionText = questionText;
    }

}
