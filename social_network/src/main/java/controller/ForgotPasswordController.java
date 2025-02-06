package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import view.ForgotPassword;
import view.LoginAndRegister;

public class ForgotPasswordController {

    private ForgotPassword view;
    private static Service serviced;

    public ForgotPasswordController(ForgotPassword forgotPassword) {
        this.view = forgotPassword;
        this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
        this.view.getChangePass().addActionListener(evt -> changePasswordActionPerformed(evt));
        this.serviced = new Service();
        this.view.setVisible(true);
    }

    private void backActionPerformed(ActionEvent evt) {
        view.setVisible(false);
        LoginAndRegister loginAndRegister = new LoginAndRegister();
        loginAndRegister.setVisible(true);
        view.dispose();
    }

    private void changePasswordActionPerformed(ActionEvent evt) {
        String email = view.getEmailText().getText().trim();
        String question = view.getQuestionText().getText().trim();
        String answer = view.getAnswerText().getText().trim();
        String newPassword = new String(view.getNewPassText().getPassword()).trim();

        // Kiểm tra nếu các trường nhập liệu không được để trống
        if (email.isEmpty() || question.isEmpty() || answer.isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra độ dài mật khẩu mới
        if (newPassword.length() < 8 || !newPassword.matches(".*[A-Za-z].*") || !newPassword.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(view, "Password must be at least 8 characters long and contain both letters and numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra nếu câu hỏi và câu trả lời khôi phục là chính xác
        boolean isValid = serviced.verifyRecoveryInfo(email, question, answer);
        if (isValid) {
            // Tiến hành thay đổi mật khẩu
            boolean isPasswordChanged = serviced.changePasswordByEmail(email, newPassword);
            if (isPasswordChanged) {
                JOptionPane.showMessageDialog(view, "Password changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Failed to change password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(view, "Incorrect recovery information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
