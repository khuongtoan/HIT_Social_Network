package view.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ExitButton extends JButton {

public ExitButton() {
    setPreferredSize(new Dimension(35, 35));
    setBackground(null);
    setBorder(null);
    setContentAreaFilled(false);
    setOpaque(false);

    // Thiết lập text và font cho nút "X"
    setText("X");
    setFont(new Font("Arial", Font.PLAIN, 17));
    setForeground(Color.WHITE);

    addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    });
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int w = getWidth(), h = getHeight();

    g2d.setColor(Color.BLACK);  // Chọn màu đen
    g2d.fillRoundRect(0, 0, w, h, w, h);
    // Vẽ text lên button (chữ "X")
    Font font = getFont();
    FontMetrics fm = g2d.getFontMetrics(font);
    String text = getText();
    int x = (w - fm.stringWidth(text)) / 2;
    int y = ((h - fm.getHeight()) / 2) + fm.getAscent();

    g2d.setColor(getForeground());
    g2d.setFont(font);
    g2d.drawString(text, x, y);
}
}
