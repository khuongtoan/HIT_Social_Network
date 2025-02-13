package controller;

import common.Check;
import common.EffectButtonLLabel;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Role;
import model.Status;
import service.Service;
import service.ServiceInterfaces;
import view.component.ButtonCustom;
import view.component.ChangeEmail2;
import view.component.ChangePassword2;
import view.component.ChangeQuestionRecovery2;
import view.component.ChangeRole2;
import view.component.ChangeStatus2;
import view.component.ChangeUsername2;
import view.LoginAndRegister2;
import view.PersonalView2;
import view.SettingView2;

public class SettingController2 {

private SettingView2 view;
private ServiceInterfaces serviced;

public SettingController2(SettingView2 view) {
    this.view = view;
    serviced = new Service();
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));

    if (UserSession.getCurrentUser().getRole() != Role.ADMIN) {
        this.view.getChangeStatus().setVisible(false);
        this.view.getChangeRole().setVisible(false);
    }

    this.view.getOptionButton().addActionListener(evt -> getOptionActionperformed(evt));

    this.view.getChangeEmail().addActionListener(evt -> showChangeEmailPanel(evt));
    this.view.getChangePass().addActionListener(evt -> showChangePasswordPanel(evt));
    this.view.getChangeQuestion().addActionListener(evt -> showChangeQuestionRecoveryPanel(evt));
    this.view.getChangeUserName().addActionListener(evt -> showChangeUserNamePanel(evt));
    this.view.getChangeRole().addActionListener(evt -> showChangeRolePanel(evt));
    this.view.getChangeStatus().addActionListener(evt -> showChangeStatusPanel(evt));

    EffectButtonLLabel.buttonHoverEffect(this.view.getBack());
    EffectButtonLLabel.buttonHoverEffect(this.view.getLogoutButton());

    this.view.getLogoutButton().addActionListener(evt -> logoutActionperformed(evt));
    this.view.setVisible(true);
}

// Quay lại PersonalView
private void backActionPerformed(ActionEvent evt) {
    this.view.setVisible(false);
    new PersonalView2().setVisible(true);
    this.view.dispose();
}

// chức năng cập nhật email 
private void showChangeEmailPanel(ActionEvent evt) {
    ChangeEmail2 changeEmailPanel = new ChangeEmail2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeEmailPanel);
    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changeEmailPanel.getConfirm().addActionListener(e -> updateEmailActionperformed(changeEmailPanel));

}

private void updateEmailActionperformed(ChangeEmail2 changeEmailPanel) {
    String passEnter = changeEmailPanel.getPassText().getPassword();
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
    ChangePassword2 changePasswordPanel = new ChangePassword2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changePasswordPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changePasswordPanel.getConfirm().addActionListener(e -> updatePassActionperformed(changePasswordPanel));

}

private void updatePassActionperformed(ChangePassword2 changePasswordPanel) {

    String oldPasslEnter = changePasswordPanel.getOldPassText().getPassword();
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
    ChangeQuestionRecovery2 changeQuestionRecoveryPanel = new ChangeQuestionRecovery2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeQuestionRecoveryPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changeQuestionRecoveryPanel.getConfirm().addActionListener(e -> updateQuestionActionperformed(changeQuestionRecoveryPanel));

}

private void updateQuestionActionperformed(ChangeQuestionRecovery2 changeQuestionRecoveryPanel) {

    String passEnter = changeQuestionRecoveryPanel.getOldPassText().getPassword();
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
    ChangeUsername2 changeUserNamePanel = new ChangeUsername2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeUserNamePanel);
    view.getMainArea().revalidate();
    view.getMainArea().repaint();

    changeUserNamePanel.getConfirm().addActionListener(e -> updateUserNameActionperformed(changeUserNamePanel));
}

private void updateUserNameActionperformed(ChangeUsername2 changeUserNamePanel) {
    String passEnter = changeUserNamePanel.getPassText().getPassword();
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
    new LoginAndRegister2().setVisible(true);
    this.view.dispose();
    UserSession.setCurrentUser(null);
}

// cập nhật Role 
private void showChangeRolePanel(ActionEvent evt) {
    ChangeRole2 changeRolePanel = new ChangeRole2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeRolePanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();

    changeRolePanel.getConfirm().addActionListener(e -> updateRoleActionPerformed(changeRolePanel));
}

private void updateRoleActionPerformed(ChangeRole2 changeRolePanel) {

    String userName = changeRolePanel.getUserNameText().getText();
    int idUser;

    if (!changeRolePanel.getAdminRadioButton().isSelected() && !changeRolePanel.getUserRadioButton().isSelected()) {
        JOptionPane.showMessageDialog(view, "Please select a role!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Role newRole = changeRolePanel.getAdminRadioButton().isSelected() ? Role.ADMIN : Role.USER;

    boolean updated = serviced.updateRole(userName, newRole);
    if (updated) {
        JOptionPane.showMessageDialog(view, "Role updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(view, "Failed to update role. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Hiển thị panel ChangeStatus
private void showChangeStatusPanel(ActionEvent evt) {
    ChangeStatus2 changeStatusPanel = new ChangeStatus2();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeStatusPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
    changeStatusPanel.getConfirm().addActionListener(e -> updateStatusActionPerformed(changeStatusPanel));

}

private void updateStatusActionPerformed(ChangeStatus2 changeStatusPanel) {

    String userName = changeStatusPanel.getUserNameText().getText();
    int idUser;

    if (!changeStatusPanel.getActivejRadioButton().isSelected() && !changeStatusPanel.getBanRadioButton().isSelected()) {
        JOptionPane.showMessageDialog(view, "Please select a status!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Status newStatus = changeStatusPanel.getActivejRadioButton().isSelected() ? Status.ACTIVE : Status.BAN;

    boolean updated = serviced.updateStatus(userName, newStatus);
    if (updated) {
        JOptionPane.showMessageDialog(view, "Status updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(view, "Failed to update Status. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void getOptionActionperformed(ActionEvent evt) {
    ButtonCustom button = (ButtonCustom) evt.getSource();
    this.view.getAdminPopupMenu().show(button, 0, button.getHeight());
}

}
