package view.component;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class PanePost extends javax.swing.JPanel {

public PanePost(String user, String postContentText, String imagePath, int like, int comment) {
    initComponents();
    setPostContent(postContentText);
    setImage(imagePath);
    username.setText(user + "");
    labelLike.setText(like + "");
    buttonComment.setText(comment + "");
    toggleLikeButtonColor(ButtonLike);

}

public void setPostContent(String content) {
    contentw.setText(content);
}

public void setImage(String imagePath) {
    if (imagePath == null || imagePath.trim().isEmpty()) {
        return; 
    }
    File imageFile = new File(imagePath);
    if (imageFile.exists()) {
        ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());
        int labelWidth = image.getWidth();
        int labelHeight = image.getHeight();

        if (labelWidth == 0 || labelHeight == 0) {
            image.setPreferredSize(new java.awt.Dimension(570, 400));
        }

        Image img = imageIcon.getImage();
        Image resizedImg = img.getScaledInstance(570, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        image.setIcon(resizedIcon);
    } else {
    }
}

public void toggleLikeButtonColor(JButton button) {
    boolean[] isSelected = {false};

    button.addActionListener(e -> {
        if (!isSelected[0]) {
            button.setBackground(Color.GREEN);
            button.setText("Liked");
        } else {
            button.setBackground(null);
            button.setText("Like");
        }
        isSelected[0] = !isSelected[0];
    });
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        labelLike = new javax.swing.JLabel();
        ButtonLike = new javax.swing.JButton();
        buttonComment = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        contentw = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(570, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(570, 60));

        labelLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        labelLike.setText("1");

        ButtonLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        ButtonLike.setText("Like");
        ButtonLike.setDefaultCapable(false);
        ButtonLike.setOpaque(true);

        buttonComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat (2).png"))); // NOI18N
        buttonComment.setText("comment");
        buttonComment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonComment.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelLike, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(buttonComment, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLike))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonComment)
                            .addComponent(ButtonLike))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setLayout(new java.awt.BorderLayout());

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setOpaque(true);
        jPanel6.add(image, java.awt.BorderLayout.CENTER);

        contentw.setBackground(new java.awt.Color(255, 255, 255));
        contentw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contentw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentw.setToolTipText("");
        contentw.setOpaque(true);
        contentw.setPreferredSize(new java.awt.Dimension(570, 50));
        jPanel6.add(contentw, java.awt.BorderLayout.PAGE_START);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

public static void main(String[] args) {
    JFrame frame = new JFrame("Test Like Button");

    PanePost post = new PanePost("User Name", "This is a post content", "D:/SocialNetwork/social_network/src/main/resources/dragonBack.jpg", 5, 3);

    frame.getContentPane().add(post);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLike;
    private javax.swing.JButton buttonComment;
    private javax.swing.JLabel contentw;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelLike;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

public JButton getButtonLike() {
    return ButtonLike;
}

public void setButtonLike(JButton ButtonLike) {
    this.ButtonLike = ButtonLike;
}

public JButton getButtonComment() {
    return buttonComment;
}

public void setButtonComment(JButton buttonComment) {
    this.buttonComment = buttonComment;
}

public JLabel getContentw() {
    return contentw;
}

public void setContentw(JLabel contentw) {
    this.contentw = contentw;
}

public JLabel getImage() {
    return image;
}

public void setImage(JLabel image) {
    this.image = image;
}

public JLabel getjLabel3() {
    return jLabel3;
}

public void setjLabel3(JLabel jLabel3) {
    this.jLabel3 = jLabel3;
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

public JSeparator getjSeparator2() {
    return jSeparator2;
}

public void setjSeparator2(JSeparator jSeparator2) {
    this.jSeparator2 = jSeparator2;
}

public JLabel getLabelLike() {
    return labelLike;
}

public void setLabelLike(JLabel labelLike) {
    this.labelLike = labelLike;
}

public JLabel getUsername() {
    return username;
}

public void setUsername(JLabel username) {
    this.username = username;
}

}
