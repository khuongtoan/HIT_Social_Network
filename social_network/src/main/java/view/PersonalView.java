package view;

import controller.PersonalController;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import view.component.PanePost;

public class PersonalView extends javax.swing.JFrame {

private PersonalController controll;

public PersonalView() {
    initComponents();
    setLocationRelativeTo(null);
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));

    jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
    jScrollPane2.getHorizontalScrollBar().setUnitIncrement(16);
    controll = new PersonalController(this);

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelSearch = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        game = new javax.swing.JLabel();
        reload = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        createPostLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainLabel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));

        LabelSearch.setBackground(new java.awt.Color(255, 255, 255));
        LabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search (2).png"))); // NOI18N
        LabelSearch.setOpaque(true);

        searchTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTF.setText("search");
        searchTF.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game (2).png"))); // NOI18N

        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(game)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(219, 440));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (2).png"))); // NOI18N
        nameLabel.setText("name");
        nameLabel.setOpaque(true);

        createPostLabel.setBackground(new java.awt.Color(255, 255, 255));
        createPostLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPostLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        createPostLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create (2).png"))); // NOI18N
        createPostLabel.setText("create post");
        createPostLabel.setOpaque(true);

        settingLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        settingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/setting (4).png"))); // NOI18N
        settingLabel.setText("setting");
        settingLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createPostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(settingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nameLabel)
                .addGap(98, 98, 98)
                .addComponent(createPostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(settingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setLayout(new javax.swing.BoxLayout(mainLabel, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane2.setViewportView(mainLabel);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 440));

        jPanel5.add(jPanel2);
        jPanel2.setBounds(0, 50, 800, 487);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        new PersonalView();
    }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel createPostLabel;
    private javax.swing.JLabel game;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton reload;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables

public JLabel getCreatePostLabel() {
    return createPostLabel;
}

public void setCreatePostLabel(JLabel createPostLabel) {
    this.createPostLabel = createPostLabel;
}

public JLabel getGame() {
    return game;
}

public void setGame(JLabel game) {
    this.game = game;
}

public JLabel getLabelSearch() {
    return LabelSearch;
}

public void setLabelSearch(JLabel labelSearch) {
    this.LabelSearch = labelSearch;
}

public JPanel getjPanel1() {
    return jPanel1;
}

public void setjPanel1(JPanel jPanel1) {
    this.jPanel1 = jPanel1;
}

public JPanel getjPanel2() {
    return jPanel2;
}

public void setjPanel2(JPanel jPanel2) {
    this.jPanel2 = jPanel2;
}

public JPanel getjPanel3() {
    return jPanel3;
}

public void setjPanel3(JPanel jPanel3) {
    this.jPanel3 = jPanel3;
}

public JPanel getjPanel4() {
    return jPanel4;
}

public void setjPanel4(JPanel jPanel4) {
    this.jPanel4 = jPanel4;
}

public JPanel getjPanel5() {
    return jPanel5;
}

public void setjPanel5(JPanel jPanel5) {
    this.jPanel5 = jPanel5;
}

public JPanel getjPanel6() {
    return jPanel6;
}

public void setjPanel6(JPanel jPanel6) {
    this.jPanel6 = jPanel6;
}

public JScrollPane getjScrollPane2() {
    return jScrollPane2;
}

public void setjScrollPane2(JScrollPane jScrollPane2) {
    this.jScrollPane2 = jScrollPane2;
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

public JTextField getSearchTF() {
    return searchTF;
}

public void setSearchTF(JTextField searchTF) {
    this.searchTF = searchTF;
}

public JLabel getSettingLabel() {
    return settingLabel;
}

public void setSettingLabel(JLabel settingLabel) {
    this.settingLabel = settingLabel;
}

}
