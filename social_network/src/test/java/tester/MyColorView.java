package tester;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyColorView extends JFrame {

private MyColorModel myColorModel;

public MyColorView(){
    this.myColorModel = new MyColorModel();
    initComponent();
}

public void initComponent(){
    setTitle("localy");
    setSize(500,700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    setLayout(null);
    
    setVisible(true);   
}
}