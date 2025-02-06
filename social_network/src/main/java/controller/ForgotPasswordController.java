package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import view.ForgotPassword;
import view.LoginAndRegister;

public class ForgotPasswordController {

    private ForgotPassword forgotPassword;
    private static Service serviced;

    public ForgotPasswordController(ForgotPassword forgotPassword) {
        this.forgotPassword = forgotPassword;
        this.forgotPassword.getBack().addActionListener(evt -> backActionPerformed(evt));
        this.forgotPassword.getChangePass().addActionListener(evt -> changePasswordActionPerformed(evt));
        serviced = new Service();
    }

    private void backActionPerformed(ActionEvent evt) {
        forgotPassword.setVisible(false);
        LoginAndRegister loginAndRegister = new LoginAndRegister();
        loginAndRegister.setVisible(true);
        forgotPassword.dispose();
    }

    private void changePasswordActionPerformed(ActionEvent evt) {
        String email = forgotPassword.getEmailText().getText().trim();
        String question = forgotPassword.getQuestionText().getText().trim();
        String answer = forgotPassword.getAnswerText().getText().trim();
        String newPassword = new String(forgotPassword.getNewPassText().getPassword()).trim();

        // Kiểm tra nếu các trường nhập liệu không được để trống
        if (email.isEmpty() || question.isEmpty() || answer.isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(forgotPassword, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra độ dài mật khẩu mới
        if (newPassword.length() < 8 || !newPassword.matches(".*[A-Za-z].*") || !newPassword.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(forgotPassword, "Password must be at least 8 characters long and contain both letters and numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra nếu câu hỏi và câu trả lời khôi phục là chính xác
        boolean isValid = serviced.verifyRecoveryInfo(email, question, answer);
        if (isValid) {
            // Tiến hành thay đổi mật khẩu
            boolean isPasswordChanged = serviced.changePasswordByEmail(email, newPassword);
            if (isPasswordChanged) {
                JOptionPane.showMessageDialog(forgotPassword, "Password changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(forgotPassword, "Failed to change password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(forgotPassword, "Incorrect recovery information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
