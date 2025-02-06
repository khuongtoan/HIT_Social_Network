package common;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EffectButtonLLabel {

// Method để tạo hiệu ứng hover cho label
public static void setLabelHoverEffect(JLabel label) {
    label.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        label.setBackground(Color.LIGHT_GRAY); // Màu khi chuột di vào
        label.setOpaque(true); // Đảm bảo label có nền
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        label.setBackground(null); // Đặt lại màu nền khi chuột ra
    }
    });
}

public static void toggleLikeButtonColor(JButton button) {
    boolean[] isSelected = {false};

    button.addActionListener(e -> {
        if (!isSelected[0]) {
            button.setBackground(Color.LIGHT_GRAY);
            button.setText("Liked");
        } else {
            button.setBackground(null);
            button.setText("Like");
        }
        isSelected[0] = !isSelected[0];
    });
}

}
