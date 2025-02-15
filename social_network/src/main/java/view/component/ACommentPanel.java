
package view.component;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ACommentPanel extends javax.swing.JPanel {

public ACommentPanel() {
    initComponents();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        commentPopupMenu = new javax.swing.JPopupMenu();
        updateComment = new javax.swing.JMenuItem();
        deleteComment = new javax.swing.JMenuItem();
        userNameComment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextArea();
        UpDeLabel = new javax.swing.JLabel();

        updateComment.setText("update");
        commentPopupMenu.add(updateComment);

        deleteComment.setText("delete");
        commentPopupMenu.add(deleteComment);

        setBackground(new java.awt.Color(255, 255, 255));

        userNameComment.setBackground(new java.awt.Color(255, 255, 255));
        userNameComment.setToolTipText("");
        userNameComment.setPreferredSize(new java.awt.Dimension(11, 16));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        content.setEditable(false);
        content.setColumns(20);
        content.setRows(3);
        jScrollPane1.setViewportView(content);

        UpDeLabel.setText(". . .");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameComment, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpDeLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userNameComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpDeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UpDeLabel;
    private javax.swing.JPopupMenu commentPopupMenu;
    private javax.swing.JTextArea content;
    private javax.swing.JMenuItem deleteComment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem updateComment;
    private javax.swing.JLabel userNameComment;
    // End of variables declaration//GEN-END:variables

    public JTextArea getContent() {
        return content;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getUserNameComment() {
        return userNameComment;
    }

    public JLabel getUpDeLabel() {
        return UpDeLabel;
    }

    public void setUpDeLabel(JLabel UpDeLabel) {
        this.UpDeLabel = UpDeLabel;
    }

    public JPopupMenu getCommentPopupMenu() {
        return commentPopupMenu;
    }

    public void setCommentPopupMenu(JPopupMenu commentPopupMenu) {
        this.commentPopupMenu = commentPopupMenu;
    }

    public JMenuItem getDeleteComment() {
        return deleteComment;
    }

    public void setDeleteComment(JMenuItem deleteComment) {
        this.deleteComment = deleteComment;
    }

    public JMenuItem getUpdateComment() {
        return updateComment;
    }

    public void setUpdateComment(JMenuItem updateComment) {
        this.updateComment = updateComment;
    }



    
}
