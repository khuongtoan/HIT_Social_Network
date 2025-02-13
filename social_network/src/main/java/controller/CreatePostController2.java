package controller;

import common.EffectButtonLLabel;
import common.SetScaledImage;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import say.swing.JFontChooser;
import service.Service;
import service.ServiceInterfaces;

import view.CreatePostView2;
import view.PersonalView2;

public class CreatePostController2 {

private final CreatePostView2 view;
private final ServiceInterfaces serviced;
private String content;
private String fontFamily;
private int fontSize;
private String textColor;
private String backgroundColor;
private String imagePath;

public CreatePostController2(CreatePostView2 createPostView) {
    this.view = createPostView;
    serviced = new Service();
    this.view.getNameLabel().setText(UserSession.getCurrentUser().getUserName());

    this.view.getAddImage().addActionListener(evt -> addImageActionPerformed(evt));
    this.view.getChooseColor().addActionListener(evt -> chooseColorActionPerformed(evt));
    this.view.getfont().addActionListener(evt -> fontActionPerformed(evt));
    this.view.getPostButton().addActionListener(evt -> postActionPerformed(evt));
    this.view.getBack().addActionListener(evt -> backActionPerformed(evt));
    
    EffectButtonLLabel.buttonHoverEffect(this.view.getBack());

    this.view.setVisible(true);
    
}

public void chooseColorActionPerformed(ActionEvent evt) {
    JDialog popupDialog = new JDialog(view, "Choose Text Properties", true);
    popupDialog.setLayout(new FlowLayout());
    popupDialog.setSize(400, 200);
    popupDialog.setLocationRelativeTo(null);

    // Chọn màu chữ
    JButton chooseTextColorButton = new JButton("Choose Text Color");
    chooseTextColorButton.addActionListener(e -> {
        Color textColor = JColorChooser.showDialog(popupDialog, "Choose Text Color", view.getjTextArea1().getForeground());
        if (textColor != null) {
            this.view.getjTextArea1().setForeground(textColor);
            this.textColor = colorToHex(textColor);
        }
    });

    // Chọn màu nền
    JButton chooseBackgroundColorButton = new JButton("Choose Background Color");
    chooseBackgroundColorButton.addActionListener(e -> {
        Color backgroundColor = JColorChooser.showDialog(popupDialog, "Choose Background Color", view.getjTextArea1().getBackground());
        if (backgroundColor != null) {
            this.view.getjTextArea1().setBackground(backgroundColor);
            this.backgroundColor = colorToHex(backgroundColor);
        }
    });

    chooseTextColorButton.setBackground(new Color(0, 105, 105));
    chooseBackgroundColorButton.setBackground(new Color(0, 105, 105));
    chooseTextColorButton.setForeground(new Color(255, 255, 255));
    chooseBackgroundColorButton.setForeground(new Color(255, 255, 255));

    popupDialog.add(chooseTextColorButton);
    popupDialog.add(chooseBackgroundColorButton);
    popupDialog.setVisible(true);
}

public void fontActionPerformed(ActionEvent evt) {
    JFontChooser fc = new JFontChooser();

    int result = JOptionPane.showConfirmDialog(this.view, fc, "Choose Font", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if (result == JOptionPane.OK_OPTION) {
        this.view.getjTextArea1().setFont(fc.getSelectedFont());
        this.fontSize = fc.getSelectedFont().getSize();
        this.fontFamily = fc.getSelectedFont().getFamily();
    }
}

public void addImageActionPerformed(ActionEvent evt) {

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select an Image");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png"));

    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        this.imagePath = selectedFile.getAbsolutePath();
        SetScaledImage.setScaledImage(this.imagePath, this.view.getImageLabel());
    }
}

public void postActionPerformed(ActionEvent evt) {
    this.content = this.view.getjTextArea1().getText();
    if (this.content.trim().isEmpty() && this.imagePath == null) {
        JOptionPane.showMessageDialog(this.view, "Please enter some text or select an image to post!", "Post Failed", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean isPostAdded;
    if (this.imagePath != null) {
        isPostAdded = serviced.addPost(UserSession.getCurrentUser(), this.content, this.imagePath, this.fontFamily, this.fontSize, this.textColor, this.backgroundColor);
    } else {
        isPostAdded = serviced.addPost(UserSession.getCurrentUser(), this.content, this.fontFamily, this.fontSize, this.textColor, this.backgroundColor);
    }

    if (isPostAdded) {
        JOptionPane.showMessageDialog(this.view, "Post successfully added!");
    } else {
        JOptionPane.showMessageDialog(this.view, "Failed to add post!");
    }
}

private static String colorToHex(Color color) {
    return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
}

private void backActionPerformed(ActionEvent evt) {
    this.view.setVisible(false);
    new PersonalView2().setVisible(true);
    this.view.dispose();
}

}
