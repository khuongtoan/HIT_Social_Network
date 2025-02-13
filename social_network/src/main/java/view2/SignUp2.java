package view2;

import controller2.SignUpController2;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import view.component.ButtonCustom;
import view.component.ExitButton;
import view.component.TextFieldCustom;

public class SignUp2 extends javax.swing.JFrame {

private SignUpController2 controll;

public SignUp2() {
    initComponents();
    this.setLocationRelativeTo(null);
    setSize(650, 470);

    setShape(new RoundRectangle2D.Double(0, 0, 650, 470, 40, 40));
    setComon();
    controll = new SignUpController2(this);

}

public void setComon() {
    this.usernameText.setTitle("User name: ");
    this.passText.setTitle("Password: ");
    this.emailText.setTitle("Email: ");
    this.questionText.setTitle("Recovery Question: ");
    this.answer.setTitle("Answer Question: ");

    this.usernameText.setUrl("user.png");
    this.passText.setUrl("pass.png");
    this.emailText.setUrl("email.png");
    this.panelCustom1.setColorDark("#2ebf91");
    this.panelCustom1.setColorLight("#8360c3");
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new view.component.PanelCustom();
        exitButton1 = new view.component.ExitButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        questionText = new view.component.TextFieldCustom();
        answer = new view.component.TextFieldCustom();
        usernameText = new view.component.TextFieldCustom();
        passText = new view.component.TextFieldCustom();
        emailText = new view.component.TextFieldCustom();
        jLabel6 = new javax.swing.JLabel();
        createAccount = new view.component.ButtonCustom();
        agreeCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCustom1.add(exitButton1);
        exitButton1.setBounds(610, 0, 35, 35);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create an account");
        panelCustom1.add(jLabel1);
        jLabel1.setBounds(220, 20, 260, 50);

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Back");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        panelCustom1.add(back);
        back.setBounds(0, 20, 90, 27);
        panelCustom1.add(questionText);
        questionText.setBounds(30, 280, 500, 60);
        panelCustom1.add(answer);
        answer.setBounds(30, 350, 540, 60);
        panelCustom1.add(usernameText);
        usernameText.setBounds(30, 70, 250, 60);
        panelCustom1.add(passText);
        passText.setBounds(30, 140, 290, 60);
        panelCustom1.add(emailText);
        emailText.setBounds(30, 210, 330, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html> Make sure your password is at  least 6 characters long<br>and contains both letters  and  numbers.</html> ");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelCustom1.add(jLabel6);
        jLabel6.setBounds(370, 110, 270, 70);

        createAccount.setBackground(new java.awt.Color(51, 51, 51));
        createAccount.setForeground(new java.awt.Color(255, 255, 255));
        createAccount.setText("Create account");
        panelCustom1.add(createAccount);
        createAccount.setBounds(370, 200, 160, 30);

        agreeCheckBox.setText("I agree with license");
        agreeCheckBox.setContentAreaFilled(false);
        panelCustom1.add(agreeCheckBox);
        agreeCheckBox.setBounds(430, 240, 140, 30);

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
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {
    SignUp2 a = new SignUp2();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeCheckBox;
    private view.component.TextFieldCustom answer;
    private javax.swing.JButton back;
    private view.component.ButtonCustom createAccount;
    private view.component.TextFieldCustom emailText;
    private view.component.ExitButton exitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private view.component.PanelCustom panelCustom1;
    private view.component.TextFieldCustom passText;
    private view.component.TextFieldCustom questionText;
    private view.component.TextFieldCustom usernameText;
    // End of variables declaration//GEN-END:variables

public TextFieldCustom getAnswer() {
    return answer;
}

public void setAnswer(TextFieldCustom answer) {
    this.answer = answer;
}

public JButton getBack() {
    return back;
}

public void setBack(JButton back) {
    this.back = back;
}

public ButtonCustom getCreateAccount() {
    return createAccount;
}

public void setCreateAccount(ButtonCustom createAccount) {
    this.createAccount = createAccount;
}

public TextFieldCustom getEmailText() {
    return emailText;
}

public void setEmailText(TextFieldCustom emailText) {
    this.emailText = emailText;
}

public ExitButton getExitButton1() {
    return exitButton1;
}

public void setExitButton1(ExitButton exitButton1) {
    this.exitButton1 = exitButton1;
}

public TextFieldCustom getPassText() {
    return passText;
}

public void setPassText(TextFieldCustom passText) {
    this.passText = passText;
}

public TextFieldCustom getQuestionText() {
    return questionText;
}

public void setQuestionText(TextFieldCustom questionText) {
    this.questionText = questionText;
}

public TextFieldCustom getUsernameText() {
    return usernameText;
}

public void setUsernameText(TextFieldCustom usernameText) {
    this.usernameText = usernameText;
}

public JCheckBox getAgreeCheckBox() {
    return agreeCheckBox;
}

public void setAgreeCheckBox(JCheckBox agreeCheckBox) {
    this.agreeCheckBox = agreeCheckBox;
}

}
