package view.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonCustom extends JButton {

private Color defaultBackground;
private Color hoverBackGround = new Color(204, 255, 204);


public ButtonCustom() {
    setPreferredSize(new Dimension(60, 20));
    defaultBackground = this.getBackground();
    setBackground(null);
    setBorder(null);
    setContentAreaFilled(false);
    setOpaque(false);

    this.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(hoverBackGround);
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(defaultBackground);
        repaint();
    }
    });

}

@Override
public void setBackground(Color color) {
    super.setBackground(color);
    if (color != null && color != hoverBackGround) {
        defaultBackground = color;
    }
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.setColor(getBackground());
    g2d.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 10, 10);

    Font font = new Font("Arial", Font.PLAIN, 14);
    FontMetrics fm = g2d.getFontMetrics(font);

    String text = getText();
    int x = (getWidth() - fm.stringWidth(text)) / 2;
    int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();

    g2d.setColor(getForeground());
    g2d.setFont(font);
    g2d.drawString(text, x, y);
}

}
