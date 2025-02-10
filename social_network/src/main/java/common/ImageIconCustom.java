package view.component;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconCustom extends ImageIcon {
    public ImageIconCustom(String f, int width, int height) {
        if (f == null || f.trim().isEmpty()) {
            f = "home_2.png";
        }

        URL imageUrl = getClass().getClassLoader().getResource(f);
        setImage(new ImageIcon(imageUrl)
            .getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING));
    }
}
