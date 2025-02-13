package view.component;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextFieldCustom extends JPanel {

private final JLabel lbltitle;
private final JTextField txttitle;
private final JLabel lblicon;
private int yLocate = 25;

public TextFieldCustom() {
    setLayout(null);
    setOpaque(false);
    setBackground(null);
    setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));

    Font defaultFont = new Font("Arial", Font.PLAIN, 14);

    // 340 60
    lbltitle = new JLabel("default");
    lbltitle.setFont(defaultFont);
    lbltitle.setBounds(0, yLocate, 150, 30);
    add(lbltitle);

    txttitle = new JTextField();
    txttitle.setFont(defaultFont);
    txttitle.setBounds(0, 30, 310, 30);
    txttitle.setOpaque(false);
    txttitle.setBackground(null);
    txttitle.setBorder(null);
    add(txttitle);

    lblicon = new JLabel();
    lblicon.setBounds((340 - 30), 30, 30, 30);
    add(lblicon);

    this.addComponentListener(new ComponentAdapter() {
    @Override
    public void componentResized(ComponentEvent e) {
        lblicon.setBounds(getWidth() - 30, 30, 30, 30);
        repaint();
    }
    });

    txttitle.addFocusListener(new FocusListener() {
    private Timer t;

    @Override
    public void focusGained(FocusEvent e) {
        if (txttitle.getText().equals("")) {
            t = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yLocate > 5) {
                    yLocate--;
                    lbltitle.setBounds(0, yLocate, 150, 30);
                    invalidate();
                    validate();
                    repaint();
                } else {
                    t.stop();
                }
            }
            });
            t.start();
        } else {
            t.stop();
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (txttitle.getText().equals("")) {
            t = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yLocate < 25) {
                    yLocate++;
                    lbltitle.setBounds(0, yLocate, 150, 30);
                    invalidate();
                    validate();
                    repaint();
                } else {
                    t.stop();
                }
            }
            });
            t.start();
        } else {
            t.stop();
        }

    }
    });
}

@Override
public Dimension getPreferredSize() {
    return new Dimension(340, 60);
}

public String getTitle() {
    return lbltitle.getText();
}

public void setTitle(String title) {
    lbltitle.setText(title);
}

public String getText() {
    return txttitle.getText();
}

public void setText(String text) {
    txttitle.setText(text);
}

public void setUrl(String url) {
    lblicon.setIcon(new ImageIconCustom(url, 30, 30));
}

}
