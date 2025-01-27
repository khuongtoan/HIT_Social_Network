
package controller;
// Lớp Controller
import javax.swing.*;
import java.awt.event.*;
import view.FlashScreen;
import view.LoginAndRegister;

public class FlashScreenController {
    public static void showFlashScreen() {
        FlashScreen flashScreen = new FlashScreen();
        flashScreen.setVisible(true);

        // Thiết lập Timer để chuyển sang LoginAndRegister sau 5 giây
        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                flashScreen.setVisible(false);  
                new LoginAndRegister().setVisible(true);
                flashScreen.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showFlashScreen();  
            }
        });
    }
}

