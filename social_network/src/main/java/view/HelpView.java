
package view;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

public class HelpView extends javax.swing.JFrame {

public HelpView() {
    initComponents();
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));

    this.setLocationRelativeTo(null);
    setSize(650, 470);
    setShape(new RoundRectangle2D.Double(0, 0, 650, 470, 40, 40));
    this.setVisible(true);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new view.component.PanelCustom();
        exitButton1 = new view.component.ExitButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCustom1.setColorDark("#DBD4B4");
        panelCustom1.setColorLight("#CC95C0");
        panelCustom1.add(exitButton1);
        exitButton1.setBounds(610, 0, 35, 35);

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Back");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        panelCustom1.add(back);
        back.setBounds(0, 0, 90, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Author information");
        panelCustom1.add(jLabel1);
        jLabel1.setBounds(10, 180, 220, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Application information");
        panelCustom1.add(jLabel2);
        jLabel2.setBounds(10, 30, 220, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("This is a beta version of an application developed by the Wato team from HIT Club.");
        panelCustom1.add(jLabel3);
        jLabel3.setBounds(60, 150, 550, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("For any inquiries, rentals, or purchases, please contact us");
        panelCustom1.add(jLabel4);
        jLabel4.setBounds(60, 110, 470, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Version v1.0");
        panelCustom1.add(jLabel5);
        jLabel5.setBounds(60, 80, 150, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email.png"))); // NOI18N
        jLabel6.setText(" kxtdumbo@gmail.com");
        panelCustom1.add(jLabel6);
        jLabel6.setBounds(270, 80, 180, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nguyễn Kim Quang");
        panelCustom1.add(jLabel7);
        jLabel7.setBounds(20, 290, 160, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Khương Xuân Toàn");
        panelCustom1.add(jLabel8);
        jLabel8.setBounds(30, 230, 130, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Software Engineering major at Hanoi University of Industry (HAUI).        ");
        panelCustom1.add(jLabel9);
        jLabel9.setBounds(80, 320, 540, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Information Technology major at Hanoi University of Industry (HAUI).        ");
        panelCustom1.add(jLabel10);
        jLabel10.setBounds(80, 260, 540, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Thank you so much for using our application!        ");
        panelCustom1.add(jLabel11);
        jLabel11.setBounds(100, 420, 470, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        this.dispose();
        new PersonalView2().setVisible(true);
    }//GEN-LAST:event_backMousePressed


public static void main(String args[]) {
    HelpView a = new HelpView();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private view.component.ExitButton exitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private view.component.PanelCustom panelCustom1;
    // End of variables declaration//GEN-END:variables
}
