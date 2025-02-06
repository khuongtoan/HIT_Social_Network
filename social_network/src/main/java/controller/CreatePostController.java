package controller;

import common.SetScaledImage;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import say.swing.JFontChooser;
import service.Service;
import view.CreatePostView;
import view.PersonalView;

public class CreatePostController {

private final CreatePostView view;
private Service service;
private String content;
private String fontFamily;
private int fontSize;
private String textColor;
private String backgroundColor;
private String imagePath;

public CreatePostController(CreatePostView createPostView) {
    this.view = createPostView;
    this.view.getNameLabel().setText(UserSession.getCurrentUser().getUserName());
    this.view.getAddImage().addActionListener(evt -> addImageActionPerformed(evt));
    this.view.getChooseColor().addActionListener(evt -> chooseColorActionPerformed(evt));
    this.view.getfont().addActionListener(evt -> fontActionPerformed(evt));
    this.view.getjButton1().addActionListener(evt -> postActionPerformed(evt));
    switchView();
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

    // Nếu người dùng chọn OK, cập nhật phông chữ cho JTextArea
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
    boolean isPostAdded;
    if (this.imagePath != null) {
        isPostAdded = service.addPost(UserSession.getCurrentUser(), this.content, this.imagePath, this.fontFamily, this.fontSize, this.textColor, this.backgroundColor); // Sử dụng phương thức với ảnh
    } else {
        isPostAdded = service.addPost(UserSession.getCurrentUser(), this.content, this.fontFamily, this.fontSize, this.textColor, this.backgroundColor); // Sử dụng phương thức không có ảnh
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

}
