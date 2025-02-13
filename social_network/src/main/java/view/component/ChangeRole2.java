
package view.component;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import view.component.TextFieldCustom;


public class ChangeRole2 extends javax.swing.JPanel {


public ChangeRole2() {
    initComponents();
    setCommon();
    
}

public void setCommon(){
    this.userNameText.setTitle("Username: ");
    
    this.userNameText.setUrl("user.png");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        userNameText = new view.component.TextFieldCustom();
        confirm = new javax.swing.JButton();
        userRadioButton = new javax.swing.JRadioButton();
        adminRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        confirm.setBackground(new java.awt.Color(51, 51, 51));
        confirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("confirm");

        buttonGroup1.add(userRadioButton);
        userRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        userRadioButton.setText("User");

        buttonGroup1.add(adminRadioButton);
        adminRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminRadioButton.setForeground(new java.awt.Color(0, 105, 105));
        adminRadioButton.setText("Admin");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Role :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(adminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRadioButton)
                    .addComponent(adminRadioButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(confirm)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel4;
    private view.component.TextFieldCustom userNameText;
    private javax.swing.JRadioButton userRadioButton;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getAdminRadioButton() {
        return adminRadioButton;
    }

    public void setAdminRadioButton(JRadioButton adminRadioButton) {
        this.adminRadioButton = adminRadioButton;
    }

    public JButton getConfirm() {
        return confirm;
    }

    public void setConfirm(JButton confirm) {
        this.confirm = confirm;
    }

    public TextFieldCustom getUserNameText() {
        return userNameText;
    }

    public void setUserNameText(TextFieldCustom userNameText) {
        this.userNameText = userNameText;
    }

    public JRadioButton getUserRadioButton() {
        return userRadioButton;
    }

    public void setUserRadioButton(JRadioButton userRadioButton) {
        this.userRadioButton = userRadioButton;
    }


}
