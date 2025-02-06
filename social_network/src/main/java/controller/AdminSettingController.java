package controller;

import common.EffectButtonLLabel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import view.AdminSettingView;
import view.PersonalView;
import view.component.ChangeEmail;
import view.component.ChangePassword;
import view.component.ChangeQuestionRecovery;
import view.component.ChangeRole;
import view.component.ChangeStatus;
import view.component.ChangeUsername;

public class AdminSettingController {

private AdminSettingView view;

public AdminSettingController(AdminSettingView view) {
    this.view = view;
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.view.getChangeEmail().addActionListener(evt -> showChangeEmailPanel(evt));
    this.view.getChangePass().addActionListener(evt -> showChangePasswordPanel(evt));
    this.view.getChangeQuestion().addActionListener(evt -> showChangeQuestionRecoveryPanel(evt));
    this.view.getChangeRole().addActionListener(evt -> showChangeRolePanel(evt));
    this.view.getChangeStatus().addActionListener(evt -> showChangeStatusPanel(evt));
    this.view.getChangeUserName().addActionListener(evt -> showChangeUserNamePanel(evt));
    switchView();
    EffectButtonLLabel.setLabelHoverEffect(this.view.getHome());
    this.view.setVisible(true);
}

private void switchView() {
    this.view.getHome().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        PersonalView personalView = new PersonalView();
        personalView.setVisible(true);
        view.dispose();

    }
    });

}

// Quay lại PersonalView
private void backActionPerformed(ActionEvent evt) {
    this.view.setVisible(false);

    PersonalView personalView = new PersonalView();
    personalView.setVisible(true);

    this.view.dispose();
}

// Hiển thị panel ChangeEmail
private void showChangeEmailPanel(ActionEvent evt) {
    ChangeEmail changeEmailPanel = new ChangeEmail();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeEmailPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

// Hiển thị panel ChangePassword
private void showChangePasswordPanel(ActionEvent evt) {
    ChangePassword changePasswordPanel = new ChangePassword();

    view.getMainArea().removeAll();
    view.getMainArea().add(changePasswordPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

// Hiển thị panel ChangeQuestionRecovery
private void showChangeQuestionRecoveryPanel(ActionEvent evt) {
    ChangeQuestionRecovery changeQuestionRecoveryPanel = new ChangeQuestionRecovery();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeQuestionRecoveryPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

// Hiển thị panel ChangeRole
private void showChangeRolePanel(ActionEvent evt) {
    ChangeRole changeRolePanel = new ChangeRole();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeRolePanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

// Hiển thị panel ChangeStatus
private void showChangeStatusPanel(ActionEvent evt) {
    ChangeStatus changeStatusPanel = new ChangeStatus();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeStatusPanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

// Hiển thị panel ChangeUserName
private void showChangeUserNamePanel(ActionEvent evt) {
    ChangeUsername changeUserNamePanel = new ChangeUsername();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeUserNamePanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}
}
