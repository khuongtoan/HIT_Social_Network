
package view.component;

import javax.swing.JButton;
import view.component.PasswordFieldCustom;
import view.component.TextFieldCustom;


public class ChangePassword2 extends javax.swing.JPanel {


public ChangePassword2() {
    initComponents();
    setCommon();
    
}

public void setCommon(){
    this.oldPassText.setTitle("Old password: ");
    this.newPassText.setTitle("New password: ");
    
    this.oldPassText.setUrl("pass.png");
    this.newPassText.setUrl("pass.png");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newPassText = new view.component.TextFieldCustom();
        confirm = new javax.swing.JButton();
        oldPassText = new view.component.PasswordFieldCustom();

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
                            .addComponent(oldPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(oldPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(confirm)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private view.component.TextFieldCustom newPassText;
    private view.component.PasswordFieldCustom oldPassText;
    // End of variables declaration//GEN-END:variables

    public JButton getConfirm() {
        return confirm;
    }

    public void setConfirm(JButton confirm) {
        this.confirm = confirm;
    }

    public TextFieldCustom getNewPassText() {
        return newPassText;
    }

    public void setNewPassText(TextFieldCustom newPassText) {
        this.newPassText = newPassText;
    }

    public PasswordFieldCustom getOldPassText() {
        return oldPassText;
    }

    public void setOldPassText(PasswordFieldCustom oldPassText) {
        this.oldPassText = oldPassText;
    }


}
