package view;

import controller.FlashScreenController2;
import java.awt.Toolkit;


public class FlashScreen2 extends javax.swing.JFrame {

private FlashScreenController2 control;

public FlashScreen2() {
    initComponents();
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    
    control = new FlashScreenController2(this);
}

public static void main(String[] args) {
    FlashScreen2 flashScreen = new FlashScreen2();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(780, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail.png"))); // NOI18N
        jLabel2.setText("Create by group WATO HIT15-HAUI");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 400, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifebook (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
