package view.component;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class RoundedTextField extends JTextField {

private int cornerRadius;

public RoundedTextField(int columns, int cornerRadius) {
    super(columns);
    this.cornerRadius = cornerRadius;
    setOpaque(false); // Cho phép tùy chỉnh nền
}

@Override
protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Vẽ nền bo góc
    g2.setColor(getBackground());
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

    // Vẽ viền
    g2.setColor(getForeground());
    g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);

    g2.dispose();
    super.paintComponent(g);
}

@Override
public void setBorder(Border border) {
}
}
