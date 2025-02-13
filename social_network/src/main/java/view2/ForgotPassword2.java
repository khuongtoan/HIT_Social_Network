package view2;

import controller2.ForgotPasswordController2;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.component.ButtonCustom;
import view.component.ExitButton;
import view.component.PasswordFieldCustom;
import view.component.TextFieldCustom;

public class ForgotPassword2 extends javax.swing.JFrame {

private ForgotPasswordController2 controll;

public ForgotPassword2() {
    initComponents();
    this.setLocationRelativeTo(null);
    setSize(650, 470);
    setCommon();
    setShape(new RoundRectangle2D.Double(0, 0, 650, 470, 40, 40));
    controll = new ForgotPasswordController2(this);
}

public void setCommon() {
    this.usernameText.setTitle("User name: ");
    this.answerText.setTitle("Answer Question: ");
    this.newPassText.setTitle("New password: ");

    this.usernameText.setUrl("user.png");
    this.newPassText.setUrl("pass.png");

    this.panelCustom1.setColorDark("#FFEFBA");
    this.panelCustom1.setColorLight("#FFFFFF");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new view.component.PanelCustom();
        exitButton1 = new view.component.ExitButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        changePass = new view.component.ButtonCustom();
        usernameText = new view.component.TextFieldCustom();
        answerText = new view.component.TextFieldCustom();
        newPassText = new view.component.PasswordFieldCustom();
        questionLabel = new javax.swing.JLabel();
        getQuestion = new view.component.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelCustom1.add(exitButton1);
        exitButton1.setBounds(610, 0, 35, 35);

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Back");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        panelCustom1.add(back);
        back.setBounds(0, 20, 90, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password Recovery");
        panelCustom1.add(jLabel1);
        jLabel1.setBounds(180, 20, 260, 50);

        changePass.setBackground(new java.awt.Color(51, 51, 51));
        changePass.setForeground(new java.awt.Color(255, 255, 255));
        changePass.setText("Change password");
        panelCustom1.add(changePass);
        changePass.setBounds(400, 330, 180, 60);
        panelCustom1.add(usernameText);
        usernameText.setBounds(20, 90, 270, 60);
        panelCustom1.add(answerText);
        answerText.setBounds(20, 210, 480, 60);
        panelCustom1.add(newPassText);
        newPassText.setBounds(20, 300, 340, 60);

        questionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        questionLabel.setText("Your question");
        panelCustom1.add(questionLabel);
        questionLabel.setBounds(20, 180, 500, 30);

        getQuestion.setBackground(new java.awt.Color(51, 51, 51));
        getQuestion.setForeground(new java.awt.Color(255, 255, 255));
        getQuestion.setText("Get question");
        panelCustom1.add(getQuestion);
        getQuestion.setBounds(330, 140, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {
    ForgotPassword2 a = new ForgotPassword2();

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.component.TextFieldCustom answerText;
    private javax.swing.JButton back;
    private view.component.ButtonCustom changePass;
    private view.component.ExitButton exitButton1;
    private view.component.ButtonCustom getQuestion;
    private javax.swing.JLabel jLabel1;
    private view.component.PasswordFieldCustom newPassText;
    private view.component.PanelCustom panelCustom1;
    private javax.swing.JLabel questionLabel;
    private view.component.TextFieldCustom usernameText;
    // End of variables declaration//GEN-END:variables

public TextFieldCustom getAnswerText() {
    return answerText;
}

public void setAnswerText(TextFieldCustom answerText) {
    this.answerText = answerText;
}

public JButton getBack() {
    return back;
}

public void setBack(JButton back) {
    this.back = back;
}

public ButtonCustom getChangePass() {
    return changePass;
}

public void setChangePass(ButtonCustom changePass) {
    this.changePass = changePass;
}

public ExitButton getExitButton1() {
    return exitButton1;
}

public void setExitButton1(ExitButton exitButton1) {
    this.exitButton1 = exitButton1;
}

public ButtonCustom getGetQuestion() {
    return getQuestion;
}

public void setGetQuestion(ButtonCustom getQuestion) {
    this.getQuestion = getQuestion;
}

public PasswordFieldCustom getNewPassText() {
    return newPassText;
}

public void setNewPassText(PasswordFieldCustom newPassText) {
    this.newPassText = newPassText;
}

public JLabel getQuestionLabel() {
    return questionLabel;
}

public void setQuestionLabel(JLabel questionLabel) {
    this.questionLabel = questionLabel;
}

public TextFieldCustom getUserNameText() {
    return usernameText;
}

public void setUserNameText(TextFieldCustom usernameText) {
    this.usernameText = usernameText;
}

}
