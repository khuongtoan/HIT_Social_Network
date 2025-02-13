package common;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EffectButtonLLabel {

public static void setLabelHoverEffect(JLabel label) {
    label.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true); // Hiện màu nền
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        label.setOpaque(false);
        label.setBackground(null); 
    }
    });
}


public static void buttonHoverEffect(JButton jButton) {
    jButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        jButton.setBackground(Color.LIGHT_GRAY);
        jButton.setOpaque(true); // Hiện màu nền
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        jButton.setOpaque(false);
        jButton.setBackground(null); 
    }
    });
}



public static void toggleLikeButtonColor(JButton button) {
    boolean[] isSelected = {false};

    button.addActionListener(e -> {
        if (!isSelected[0]) {
            button.setBackground(new Color(10, 105, 105));
            button.setText("Liked");
        } else {
            button.setBackground(null);
            button.setText("Like");
        }
        isSelected[0] = !isSelected[0];
    });
}

}
