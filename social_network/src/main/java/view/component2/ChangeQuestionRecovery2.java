package view.component2;

import javax.swing.JButton;
import view.component.PasswordFieldCustom;
import view.component.TextFieldCustom;

public class ChangeQuestionRecovery2 extends javax.swing.JPanel {

public ChangeQuestionRecovery2() {
    initComponents();
    setCommon();
}

public void setCommon() {
    this.oldPassText.setTitle("Your password: ");
    this.newQuestionText.setTitle("New Question: ");
    this.newAnswerText.setTitle("New answer: ");

    this.oldPassText.setUrl("pass.png");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newQuestionText = new view.component.TextFieldCustom();
        confirm = new javax.swing.JButton();
        newAnswerText = new view.component.TextFieldCustom();
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
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(oldPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(confirm)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private view.component.TextFieldCustom newAnswerText;
    private view.component.TextFieldCustom newQuestionText;
    private view.component.PasswordFieldCustom oldPassText;
    // End of variables declaration//GEN-END:variables

public JButton getConfirm() {
    return confirm;
}

public void setConfirm(JButton confirm) {
    this.confirm = confirm;
}

public TextFieldCustom getNewAnswerText() {
    return newAnswerText;
}

public void setNewAnswerText(TextFieldCustom newAnswerText) {
    this.newAnswerText = newAnswerText;
}

public TextFieldCustom getNewQuestionText() {
    return newQuestionText;
}

public void setNewQuestionText(TextFieldCustom newQuestionText) {
    this.newQuestionText = newQuestionText;
}

public PasswordFieldCustom getOldPassText() {
    return oldPassText;
}

public void setOldPassText(PasswordFieldCustom oldPassText) {
    this.oldPassText = oldPassText;
}

}
