package view.component;

import javax.swing.JButton;
import view.component.PasswordFieldCustom;
import view.component.TextFieldCustom;

public class ChangeUsername2 extends javax.swing.JPanel {

public ChangeUsername2() {
    initComponents();
    setCommon();

}

public void setCommon() {
    this.passText.setTitle("Your password: ");
    this.newUserNameText.setTitle("New userName: ");

    this.passText.setUrl("pass.png");
    this.newUserNameText.setUrl("user.png");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newUserNameText = new view.component.TextFieldCustom();
        confirm = new javax.swing.JButton();
        passText = new view.component.PasswordFieldCustom();

        confirm.setBackground(new java.awt.Color(51, 51, 51));
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
                        .addGap(107, 107, 107)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(confirm)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private view.component.TextFieldCustom newUserNameText;
    private view.component.PasswordFieldCustom passText;
    // End of variables declaration//GEN-END:variables

public JButton getConfirm() {
    return confirm;
}

public void setConfirm(JButton confirm) {
    this.confirm = confirm;
}

public TextFieldCustom getNewUserNameText() {
    return newUserNameText;
}

public void setNewUserNameText(TextFieldCustom newUserNameText) {
    this.newUserNameText = newUserNameText;
}

public PasswordFieldCustom getPassText() {
    return passText;
}

public void setPassText(PasswordFieldCustom passText) {
    this.passText = passText;
}

}
