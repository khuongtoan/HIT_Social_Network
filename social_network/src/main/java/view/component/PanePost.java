package view.component;

import static common.EffectButtonLLabel.toggleLikeButtonColor;
import common.SetScaledImage;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import model.Post;

public class PanePost extends javax.swing.JPanel {

//public PanePost(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor, int like, int comment) {
public PanePost(Post p) {
    initComponents();
    this.contentw.setText(p.getContent());
    this.username.setText(p.getUser().getUserName() + "");
    int likeCount = p.getLikes().size();
    int commentCount = p.getComments().size();

    this.labelLike.setText(likeCount + "");
    this.commentLabel.setText(commentCount + "");

    toggleLikeButtonColor(this.ButtonLike);
    SetScaledImage.setScaledImage570(p.getImagePath(), this.image);

}

public PanePost() {

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPopupMenu = new javax.swing.JPopupMenu();
        deleteMenuItem = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        deletePostLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        labelLike = new javax.swing.JLabel();
        ButtonLike = new javax.swing.JButton();
        buttonComment = new javax.swing.JButton();
        commentLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        contentw = new javax.swing.JLabel();

        deleteMenuItem.setText("Delete post");
        dPopupMenu.add(deleteMenuItem);

        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(570, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (2).png"))); // NOI18N

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("name");

        deletePostLabel.setText(". . . .");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(deletePostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(username)
                        .addComponent(deletePostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(570, 60));

        labelLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        labelLike.setText("0");

        ButtonLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        ButtonLike.setText("Like");
        ButtonLike.setBorderPainted(false);
        ButtonLike.setContentAreaFilled(false);
        ButtonLike.setDefaultCapable(false);
        ButtonLike.setFocusPainted(false);

        buttonComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat (3).png"))); // NOI18N
        buttonComment.setText("comment");
        buttonComment.setBorder(null);
        buttonComment.setBorderPainted(false);
        buttonComment.setContentAreaFilled(false);
        buttonComment.setFocusPainted(false);

        commentLabel.setText("0");
        commentLabel.setPreferredSize(new java.awt.Dimension(37, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelLike, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(buttonComment, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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
                            .addComponent(ButtonLike)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLike;
    private javax.swing.JButton buttonComment;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JLabel contentw;
    private javax.swing.JPopupMenu dPopupMenu;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JLabel deletePostLabel;
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

public JLabel getCommentLabel() {
    return commentLabel;
}

public void setCommentLabel(JLabel commentLabel) {
    this.commentLabel = commentLabel;
}

public JLabel getDeletePostLabel() {
    return deletePostLabel;
}

public void setDeletePostLabel(JLabel deletePostLabel) {
    this.deletePostLabel = deletePostLabel;
}

    public JPopupMenu getdPopupMenu() {
        return dPopupMenu;
    }

    public void setdPopupMenu(JPopupMenu dPopupMenu) {
        this.dPopupMenu = dPopupMenu;
    }

    public JMenuItem getDeleteMenuItem() {
        return deleteMenuItem;
    }

    public void setDeleteMenuItem(JMenuItem deleteMenuItem) {
        this.deleteMenuItem = deleteMenuItem;
    }

}
