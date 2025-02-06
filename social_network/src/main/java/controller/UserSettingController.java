package controller;

import java.awt.event.ActionEvent;
import view.PersonalView;
import view.UserSettingView;
import view.component.ChangeEmail;
import view.component.ChangePassword;
import view.component.ChangeQuestionRecovery;
import view.component.ChangeUsername;

public class UserSettingController {

private UserSettingView view;

public UserSettingController(UserSettingView view) {
    this.view = view;
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    this.view.getChangeEmail().addActionListener(evt -> showChangeEmailPanel(evt));
    this.view.getChangePass().addActionListener(evt -> showChangePasswordPanel(evt));
    this.view.getChangeQuestion().addActionListener(evt -> showChangeQuestionRecoveryPanel(evt));
    this.view.getChangeUsername().addActionListener(evt -> showChangeUserNamePanel(evt));
    this.view.setVisible(true);
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

private void showChangeUserNamePanel(ActionEvent evt) {
    ChangeUsername changeUserNamePanel = new ChangeUsername();

    view.getMainArea().removeAll();
    view.getMainArea().add(changeUserNamePanel);

    view.getMainArea().revalidate();
    view.getMainArea().repaint();
}

}
