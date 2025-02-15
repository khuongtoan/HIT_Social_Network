package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import view.PersonalView2;

public class GameTableTennis extends JFrame {

private final ControlWindow controllww = new ControlWindow(this);

public GameTableTennis() {
    this.setUndecorated(true);
    this.add(controllww);
    this.pack();
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    this.setSize(Consts.WIDTH, Consts.HEIGHT);

    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setVisible(true);
}

}

class ControlWindow extends JPanel implements ActionListener, KeyListener {

private final Ball ball = new Ball(Consts.WIDTH / 2, Consts.HEIGHT / 2, 30);
private final Timer timer = new Timer(6, this);
private final Player lp = new Player(0, Consts.HEIGHT / 2);
private final Player rp = new Player(Consts.WIDTH - lp.width - lp.width / 2, Consts.HEIGHT / 2);
private final Font gameFont = new Font("Consolas", Font.PLAIN, 20);
private final JButton backButton;

public ControlWindow(JFrame parentFrame) {
    timer.start();
    this.setLayout(null);
    this.setBackground(Color.BLACK);
    this.addKeyListener(this);
    this.setFocusable(true);

    backButton = new JButton("Back");

    backButton.setForeground(Color.WHITE); 
    backButton.setFont(gameFont);
    backButton.setBounds(Consts.WIDTH / 2 - 50, 10, 100, 30);
    backButton.setOpaque(false);
    backButton.setContentAreaFilled(false);
    backButton.setBorderPainted(false);
    backButton.setFocusPainted(false);

    add(backButton);

    backButton.addActionListener(e -> {
        parentFrame.dispose();
        new PersonalView2().setVisible(true);
    });
}

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.WHITE);
    g.fillOval(ball.x, ball.y, ball.diameter, ball.diameter);

    g.fillRect(lp.x, lp.y, lp.width, lp.height);
    g.fillRect(rp.x, rp.y, rp.width, rp.height);

    g.setFont(gameFont);
    g.drawString("LEFT: " + lp.score, 0, 40);
    g.drawString("RIGHT: " + rp.score, Consts.WIDTH - 200, 40);
}

@Override
public void actionPerformed(ActionEvent e) {
    ball.x += ball.speedX;
    ball.y += ball.speedY;

    Rectangle rectBall = new Rectangle(ball.x, ball.y, ball.diameter, ball.diameter);
    Rectangle rectLp = new Rectangle(lp.x, lp.y, lp.width, lp.height);
    Rectangle rectRp = new Rectangle(rp.x, rp.y, rp.width, rp.height);

    if (rectBall.intersects(rectRp)) {
        ball.speedX = -Math.abs(ball.speedX);
        if (ball.speedX == 0) {
            ball.speedX = -5;
        }
        ball.speedY += (Math.random() > 0.5 ? 1 : -1) * 2;
    }

    if (rectBall.intersects(rectLp)) {
        ball.speedX = Math.abs(ball.speedX);
        if (ball.speedX == 0) {
            ball.speedX = 5;
        }
        ball.speedY += (Math.random() > 0.5 ? 1 : -1) * 2;
    }

    if (ball.y >= Consts.HEIGHT - ball.diameter * 2) {
        ball.speedY *= -1;
    }

    if (ball.y <= 0) {
        ball.speedY *= -1;
    }

    if (ball.x >= Consts.WIDTH - ball.diameter) {
        lp.score++;
        ball.x = Consts.WIDTH / 2;
        ball.y = Consts.HEIGHT / 2;
    }

    if (ball.x <= 0) {
        rp.score++;
        ball.x = Consts.WIDTH / 2;
        ball.y = Consts.HEIGHT / 2;
    }

    repaint();
}

@Override
public void keyPressed(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_W && lp.y > 0) {
        lp.y -= lp.speedY;
    }

    if (e.getKeyCode() == KeyEvent.VK_S && lp.y + lp.height < Consts.HEIGHT) {
        lp.y += lp.speedY;
    }

    if (e.getKeyCode() == KeyEvent.VK_UP && rp.y > 0) {
        rp.y -= rp.speedY;
    }

    if (e.getKeyCode() == KeyEvent.VK_DOWN && rp.y + rp.height < Consts.HEIGHT) {
        rp.y += rp.speedY;
    }
}

@Override
public void keyTyped(KeyEvent e) {
}

@Override
public void keyReleased(KeyEvent e) {
}

}

class Ball {

public int x, y, diameter;
public int speedX = 5, speedY = 5;

public Ball(int x, int y, int diameter) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
}
}

class Player {

public int x, y;
public int width = 30, height = 100;
public int speedY = 60;
public int score = 0;

public Player(int x, int y) {
    this.x = x;
    this.y = y;
}
}

class Consts {

public static final int WIDTH = 1000;
public static final int HEIGHT = 550;
}
