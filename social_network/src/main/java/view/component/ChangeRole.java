package view.component;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;


public class ChangeRole extends javax.swing.JPanel {


public ChangeRole() {
    initComponents();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        idUserText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        userRadioButton = new javax.swing.JRadioButton();
        adminRadioButton = new javax.swing.JRadioButton();
        confirm = new javax.swing.JButton();

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 105, 105));
        jLabel3.setText("Id user");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 105, 105));
        jLabel4.setText("Role");

        buttonGroup1.add(userRadioButton);
        userRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        userRadioButton.setText("User");

        buttonGroup1.add(adminRadioButton);
        adminRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        adminRadioButton.setText("Admin");

        confirm.setBackground(new java.awt.Color(0, 105, 105));
        confirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("confirm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(adminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(idUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userRadioButton)
                    .addComponent(adminRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField idUserText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton userRadioButton;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getAdminRadioButton() {
        return adminRadioButton;
    }

    public void setAdminRadioButton(JRadioButton adminRadioButton) {
        this.adminRadioButton = adminRadioButton;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JPasswordField getIdUserText() {
        return idUserText;
    }

    public void setIdUserText(JPasswordField idUserText) {
        this.idUserText = idUserText;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JRadioButton getUserRadioButton() {
        return userRadioButton;
    }

    public void setUserRadioButton(JRadioButton userRadioButton) {
        this.userRadioButton = userRadioButton;
    }

    public JButton getConfirm() {
        return confirm;
    }

    public void setConfirm(JButton confirm) {
        this.confirm = confirm;
    }

    
}
