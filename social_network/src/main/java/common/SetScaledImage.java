package common;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SetScaledImage {

public static void setScaledImage(String imagePath, JLabel label) {
    try {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();

        double aspectRatio = (double) image.getWidth(null) / image.getHeight(null);

        int labelWidth = label.getWidth();
        int newWidth = labelWidth;
        int newHeight = (int) (newWidth / aspectRatio);

        Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(scaledImage));
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
