package controller;

import common.Check;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import service.Service;
import service.ServiceInterfaces;
import view.LoginAndRegister;
import view.PersonalView;
import view.UserSettingView;
import view.component.ChangeEmail;
import view.component.ChangePassword;
import view.component.ChangeQuestionRecovery;
import view.component.ChangeUsername;

public class UserSettingController {

private UserSettingView view;
private ServiceInterfaces serviced;

public UserSettingController(UserSettingView view) {
    this.view = view;
    serviced = new Service();
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.view.getChangeEmail().addActionListener(evt -> showChangeEmailPanel(evt));
    this.view.getChangePass().addActionListener(evt -> showChangePasswordPanel(evt));
    this.view.getChangeQuestion().addActionListener(evt -> showChangeQuestionRecoveryPanel(evt));
    this.view.getChangeUsername().addActionListener(evt -> showChangeUserNamePanel(evt));

    this.view.getLogoutButton().addActionListener(evt -> logoutActionperformed(evt));
    this.view.setVisible(true);
}

// Quay lại PersonalView
private void backActionPerformed(ActionEvent evt) {
    this.view.setVisible(false);

    PersonalView personalView = new PersonalView();
    personalView.setVisible(true);

    this.view.dispose();
}

// chức năng cập nhật email 
private void showChangeEmailPanel(ActionEvent evt) {
    ChangeEmail changeEmailPanel = new ChangeEmail();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeEmailPanel);
    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changeEmailPanel.getConfirm().addActionListener(e -> updateEmailActionperformed(changeEmailPanel));

}

private void updateEmailActionperformed(ChangeEmail changeEmailPanel) {
    String passEnter = new String(changeEmailPanel.getPassText().getPassword());
    String newEmailEnter = changeEmailPanel.getNewEmailText().getText();

    boolean auth = serviced.checkPasswordCurrentUser(UserSession.getCurrentUser().getUserName(), passEnter);
    if (auth) {
        if (!Check.checkValidEmail(newEmailEnter)) {
            JOptionPane.showMessageDialog(view, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean updated = serviced.updateEmail(UserSession.getCurrentUser().getUserId(), newEmailEnter);
        if (updated) {
            JOptionPane.showMessageDialog(view, "Email updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to update email. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(view, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// cập nhập mật khẩu 
private void showChangePasswordPanel(ActionEvent evt) {
    ChangePassword changePasswordPanel = new ChangePassword();

    view.getMainArea().removeAll();
    view.getMainArea().add(changePasswordPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changePasswordPanel.getConfirm().addActionListener(e -> updatePassActionperformed(changePasswordPanel));

}

private void updatePassActionperformed(ChangePassword changePasswordPanel) {

    String oldPasslEnter = new String(changePasswordPanel.getOldPassText().getPassword());
    String newPasslEnter = changePasswordPanel.getNewPassText().getText();

    boolean auth = serviced.checkPasswordCurrentUser(UserSession.getCurrentUser().getUserName(), oldPasslEnter);

    if (auth) {
        if (!Check.checkValidPassword(newPasslEnter)) {
            JOptionPane.showMessageDialog(view, "Invalid password format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean updated = serviced.updatePassword(UserSession.getCurrentUser().getUserId(), oldPasslEnter, newPasslEnter);

        if (updated) {
            JOptionPane.showMessageDialog(view, "Password updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to update password. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(view, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// cập nhật câu hỏi khôi phục
private void showChangeQuestionRecoveryPanel(ActionEvent evt) {
    ChangeQuestionRecovery changeQuestionRecoveryPanel = new ChangeQuestionRecovery();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeQuestionRecoveryPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changeQuestionRecoveryPanel.getConfirm().addActionListener(e -> updateQuestionActionperformed(changeQuestionRecoveryPanel));

}

private void updateQuestionActionperformed(ChangeQuestionRecovery changeQuestionRecoveryPanel) {

    String passEnter = new String(changeQuestionRecoveryPanel.getOldPassText().getPassword());
    String newQuestionEnter = changeQuestionRecoveryPanel.getNewQuestionText().getText();
    String newAnswerEnter = changeQuestionRecoveryPanel.getNewAnswerText().getText();

    boolean auth = serviced.checkPasswordCurrentUser(UserSession.getCurrentUser().getUserName(), passEnter);
    if (auth) {

        boolean updated = serviced.updatePasswordRecovery(UserSession.getCurrentUser().getUserId(), newQuestionEnter, newAnswerEnter);
        if (updated) {
            JOptionPane.showMessageDialog(view, "Question recovery updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to update Question recovery. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(view, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// cập nhật tên người dùng
private void showChangeUserNamePanel(ActionEvent evt) {
    ChangeUsername changeUserNamePanel = new ChangeUsername();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeUserNamePanel);
    view.getMainArea().revalidate();
    view.getMainArea().repaint();

    changeUserNamePanel.getConfirm().addActionListener(e -> updateUserNameActionperformed(changeUserNamePanel));
}

private void updateUserNameActionperformed(ChangeUsername changeUserNamePanel) {
    String passEnter = new String(changeUserNamePanel.getPassText().getPassword());
    String newUserNameEnter = changeUserNamePanel.getNewUserNameText().getText();

    if (passEnter.isEmpty() || newUserNameEnter.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please enter all required fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Kiểm tra username không vượt quá 15 ký tự trước khi kiểm tra mật khẩu
    if (newUserNameEnter.length() > 15) {
        JOptionPane.showMessageDialog(view, "Failed to update username. The username must not exceed 15 characters!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean auth = serviced.checkPasswordCurrentUser(UserSession.getCurrentUser().getUserName(), passEnter);
    if (auth) {
        boolean updated = serviced.updateUserName(UserSession.getCurrentUser().getUserId(), newUserNameEnter);
        if (updated) {
            JOptionPane.showMessageDialog(view, "Username updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to update username. The new username may already exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(view, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void logoutActionperformed(ActionEvent evt) {
    this.view.setVisible(false);
    LoginAndRegister login = new LoginAndRegister();
    login.setVisible(true);
    this.view.dispose();
    UserSession.setCurrentUser(null);
}
}
