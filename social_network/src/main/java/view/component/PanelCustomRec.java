package view.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PanelCustomRec extends javax.swing.JPanel {

private String colorDark = "#99f2c8";
private String colorLight = "#1f4037";

public PanelCustomRec() {
    initComponents();
    setLayout(null);
    setPreferredSize(new Dimension(100, 100));
}

@Override
protected void paintChildren(Graphics grphcs) {
    Graphics2D g2 = (Graphics2D) grphcs;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    GradientPaint g = new GradientPaint(0, 0, Color.decode(colorDark), getWidth(), getHeight(), Color.decode(colorLight));
    g2.setPaint(g);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
    g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
    super.paintChildren(grphcs);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
public String getColorDark() {
    return colorDark;
}

public void setColorDark(String colorDark) {
    this.colorDark = colorDark;
}

public String getColorLight() {
    return colorLight;
}

public void setColorLight(String colorLight) {
    this.colorLight = colorLight;
}

}
