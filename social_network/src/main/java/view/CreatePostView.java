package view;

import controller.CreatePostController;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class CreatePostView extends javax.swing.JFrame {

private CreatePostController controll;

public CreatePostView() {
    initComponents();
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    controll = new CreatePostController(this);

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addImage = new javax.swing.JButton();
        chooseColor = new javax.swing.JButton();
        font = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPost = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Post");

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (2).png"))); // NOI18N
        nameLabel.setText("name");
        nameLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 430));

        jButton1.setBackground(new java.awt.Color(0, 105, 105));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Post");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        addImage.setBackground(new java.awt.Color(0, 105, 105));
        addImage.setForeground(new java.awt.Color(255, 255, 255));
        addImage.setText("Image");
        addImage.setPreferredSize(new java.awt.Dimension(88, 30));
        jPanel4.add(addImage);

        chooseColor.setBackground(new java.awt.Color(0, 105, 105));
        chooseColor.setForeground(new java.awt.Color(255, 255, 255));
        chooseColor.setText("Color");
        chooseColor.setPreferredSize(new java.awt.Dimension(88, 30));
        jPanel4.add(chooseColor);

        font.setBackground(new java.awt.Color(0, 105, 105));
        font.setForeground(new java.awt.Color(255, 255, 255));
        font.setText("Font");
        font.setPreferredSize(new java.awt.Dimension(88, 30));
        jPanel4.add(font);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        mainPost.setBackground(new java.awt.Color(255, 255, 255));
        mainPost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mainPost.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        mainPost.add(jTextArea1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        imageLabel.setOpaque(true);
        jPanel5.add(imageLabel, java.awt.BorderLayout.CENTER);

        mainPost.add(jPanel5, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(mainPost);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {

    CreatePostView a = new CreatePostView();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImage;
    private javax.swing.JButton chooseColor;
    private javax.swing.JButton font;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainPost;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

public JButton getAddImage() {
    return addImage;
}

public void setAddImage(JButton addImage) {
    this.addImage = addImage;
}

public JButton getChooseColor() {
    return chooseColor;
}

public void setChooseColor(JButton chooseColor) {
    this.chooseColor = chooseColor;
}

public JLabel getImageLabel() {
    return imageLabel;
}

public void setImageLabel(JLabel imageLabel) {
    this.imageLabel = imageLabel;
}

public JButton getjButton1() {
    return jButton1;
}

public void setjButton1(JButton jButton1) {
    this.jButton1 = jButton1;
}

public JScrollPane getjScrollPane1() {
    return jScrollPane1;
}

public void setjScrollPane1(JScrollPane jScrollPane1) {
    this.jScrollPane1 = jScrollPane1;
}

public JSeparator getjSeparator1() {
    return jSeparator1;
}

public void setjSeparator1(JSeparator jSeparator1) {
    this.jSeparator1 = jSeparator1;
}

public JTextArea getjTextArea1() {
    return jTextArea1;
}

public void setjTextArea1(JTextArea jTextArea1) {
    this.jTextArea1 = jTextArea1;
}

public JPanel getMainPost() {
    return mainPost;
}

public void setMainPost(JPanel mainPost) {
    this.mainPost = mainPost;
}

public JLabel getNameLabel() {
    return nameLabel;
}

public void setNameLabel(JLabel nameLabel) {
    this.nameLabel = nameLabel;
}

public JButton getfont() {
    return font;
}

public void setFont(JButton font) {
    this.font = font;
}

}
