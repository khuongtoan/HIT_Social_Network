package controller;

import javax.swing.*;
import java.awt.event.*;
import view.FlashScreen2;
import view.LoginAndRegister2;

public class FlashScreenController2 {

private final FlashScreen2 flashScreen;

public FlashScreenController2(FlashScreen2 view) {
    this.flashScreen = view;
    this.showFlashScreen();
}

public void showFlashScreen() {
    flashScreen.setVisible(true);

    Timer timer = new Timer(2000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        flashScreen.setVisible(false);
        new LoginAndRegister2().setVisible(true);
        flashScreen.dispose();
    }
    });

    timer.setRepeats(false);
    timer.start();
    
    
}
}
