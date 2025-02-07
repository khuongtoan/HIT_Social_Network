
package view.component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;


public class ChangeStatus extends javax.swing.JPanel {


public ChangeStatus() {
    initComponents();
}


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        activejRadioButton = new javax.swing.JRadioButton();
        BanRadioButton = new javax.swing.JRadioButton();
        passText = new javax.swing.JPasswordField();
        confirm = new javax.swing.JButton();

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 105, 105));
        jLabel4.setText("Status:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 105, 105));
        jLabel3.setText("Password:");

        activejRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        activejRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        activejRadioButton.setText("Active");

        BanRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BanRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        BanRadioButton.setText("Ban");

        confirm.setBackground(new java.awt.Color(0, 105, 105));
        confirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("confirm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(activejRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BanRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activejRadioButton)
                    .addComponent(BanRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BanRadioButton;
    private javax.swing.JRadioButton activejRadioButton;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passText;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getBanRadioButton() {
        return BanRadioButton;
    }

    public void setBanRadioButton(JRadioButton BanRadioButton) {
        this.BanRadioButton = BanRadioButton;
    }

    public JRadioButton getActivejRadioButton() {
        return activejRadioButton;
    }

    public void setActivejRadioButton(JRadioButton activejRadioButton) {
        this.activejRadioButton = activejRadioButton;
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

    public JPasswordField getPassText() {
        return passText;
    }

    public void setPassText(JPasswordField passText) {
        this.passText = passText;
    }

    public JButton getConfirm() {
        return confirm;
    }

    public void setConfirm(JButton confirm) {
        this.confirm = confirm;
    }

    
    
}
