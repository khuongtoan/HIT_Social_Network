package tester;

import java.awt.Color;

public class MyColorModel {

private Color foreGround;
private Color background;
private boolean apaque;

public MyColorModel() {
    this.foreGround = Color.WHITE;
    this.background = Color.WHITE;
    this.apaque = true;
}

    public Color getForeGround() {
        return foreGround;
    }

    public void setForeGround(Color foreGround) {
        this.foreGround = foreGround;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isApaque() {
        return apaque;
    }

    public void setApaque(boolean apaque) {
        this.apaque = apaque;
    }
    
}
