package view;

import controller.PersonalController2;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.component.ExitButton;

import view.component.ModernScrollBarUI;
import view.component.SearchText;

public class PersonalView2 extends javax.swing.JFrame {

private PersonalController2 controll;

public PersonalView2() {
    initComponents();
    setSize(800, 500);
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    this.setLocationRelativeTo(null);
    setShape(new RoundRectangle2D.Double(0, 0, 800, 500, 40, 40));
    setCommon();
    controll = new PersonalController2(this);
}

public void setCommon() {
    this.jScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
    this.jScrollPane1.getHorizontalScrollBar().setUI(new ModernScrollBarUI());
    this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new view.component.PanelCustom();
        panelCustomRec1 = new view.component.PanelCustomRec();
        jLabel1 = new javax.swing.JLabel();
        gameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        reload = new javax.swing.JButton();
        createPostLabel = new javax.swing.JLabel();
        exitButton1 = new view.component.ExitButton();
        settingLabel = new javax.swing.JLabel();
        jpanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTF = new view.component.SearchText();
        exitButton2 = new view.component.ExitButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainLabel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelCustom1.setColorDark("#FFFFFF");
        panelCustom1.setColorLight("#FFFFFF");
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustomRec1.setColorDark("#1cb5e0");
        panelCustomRec1.setColorLight("#000046");

        jLabel1.setFont(new java.awt.Font(".VnFree", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lifebook");
        panelCustomRec1.add(jLabel1);
        jLabel1.setBounds(30, 34, 100, 50);

        gameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gameLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        gameLabel.setText("Game");
        panelCustomRec1.add(gameLabel);
        gameLabel.setBounds(20, 320, 160, 30);

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png"))); // NOI18N
        nameLabel.setText("jLabel3");
        panelCustomRec1.add(nameLabel);
        nameLabel.setBounds(20, 90, 160, 30);

        reload.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reload.setForeground(new java.awt.Color(255, 255, 255));
        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        reload.setText("Reload");
        reload.setBorderPainted(false);
        reload.setContentAreaFilled(false);
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reload.setFocusPainted(false);
        reload.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reload.setInheritsPopupMenu(true);
        reload.setMargin(new java.awt.Insets(2, 0, 3, 7));
        panelCustomRec1.add(reload);
        reload.setBounds(20, 178, 160, 30);

        createPostLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPostLabel.setForeground(new java.awt.Color(255, 255, 255));
        createPostLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        createPostLabel.setText("Create post");
        panelCustomRec1.add(createPostLabel);
        createPostLabel.setBounds(20, 220, 160, 30);
        panelCustomRec1.add(exitButton1);
        exitButton1.setBounds(360, 0, 35, 35);

        settingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        settingLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.png"))); // NOI18N
        settingLabel.setText("Setting");
        panelCustomRec1.add(settingLabel);
        settingLabel.setBounds(20, 270, 160, 30);

        panelCustom1.add(panelCustomRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

        exitButton2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTF, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelCustom1.add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 620, 60));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mainLabel.setLayout(new javax.swing.BoxLayout(mainLabel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(mainLabel);

        panelCustom1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 620, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//public static void main(String args[]) {
//    PersonalView2 q = new PersonalView2();
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createPostLabel;
    private view.component.ExitButton exitButton1;
    private view.component.ExitButton exitButton2;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPanel mainLabel;
    private javax.swing.JLabel nameLabel;
    private view.component.PanelCustom panelCustom1;
    private view.component.PanelCustomRec panelCustomRec1;
    private javax.swing.JButton reload;
    private view.component.SearchText searchTF;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables

public JLabel getCreatePostLabel() {
    return createPostLabel;
}

public void setCreatePostLabel(JLabel createPostLabel) {
    this.createPostLabel = createPostLabel;
}

public ExitButton getExitButton1() {
    return exitButton1;
}

public void setExitButton1(ExitButton exitButton1) {
    this.exitButton1 = exitButton1;
}

public ExitButton getExitButton2() {
    return exitButton2;
}

public void setExitButton2(ExitButton exitButton2) {
    this.exitButton2 = exitButton2;
}

public JPanel getMainLabel() {
    return mainLabel;
}

public void setMainLabel(JPanel mainLabel) {
    this.mainLabel = mainLabel;
}

public JLabel getNameLabel() {
    return nameLabel;
}

public void setNameLabel(JLabel nameLabel) {
    this.nameLabel = nameLabel;
}

public JButton getReload() {
    return reload;
}

public void setReload(JButton reload) {
    this.reload = reload;
}

public SearchText getSearchTF() {
    return searchTF;
}

public JLabel getGameLabel() {
    return gameLabel;
}

public void setGameLabel(JLabel gameLabel) {
    this.gameLabel = gameLabel;
}

public void setSearchTF(SearchText searchText1) {
    this.searchTF = searchText1;
}

public JLabel getSettingLabel() {
    return settingLabel;
}

public JScrollPane getjScrollPane1() {
    return jScrollPane1;
}

public void setjScrollPane1(JScrollPane jScrollPane1) {
    this.jScrollPane1 = jScrollPane1;
}

public void setSettingLabel(JLabel settingLabel) {
    this.settingLabel = settingLabel;
}

}
