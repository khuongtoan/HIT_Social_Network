package controller;

import common.EffectButtonLLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.Comment;
import model.Post;
import service.Service;
import service.ServiceInterfaces;
import view.component.ACommentPanel;
import view.component.PanePost;
import view.CreatePostView2;
import view.PersonalView2;
import view.SettingView2;

public class PersonalController2 {

private final PersonalView2 view;
private final ServiceInterfaces serviced;
private int currentPage;
private boolean isLoading = false;

public PersonalController2(PersonalView2 personalView) {
    this.view = personalView;

    this.serviced = new Service();
    view.getReload().addActionListener(evt -> ReloadActionPerformed(evt));
    this.view.getSearchTF().addActionListener(evt -> searchActionPerformed(evt));
    ReloadActionPerformed(null);
    setupScrollListener();

    switchView();
    this.view.getNameLabel().setText(UserSession.getCurrentUser().getUserName());

    EffectButtonLLabel.setLabelHoverEffect(this.view.getCreatePostLabel());
    EffectButtonLLabel.setLabelHoverEffect(this.view.getSettingLabel());
    EffectButtonLLabel.setLabelHoverEffect(this.view.getGameLabel());

    EffectButtonLLabel.buttonHoverEffect(this.view.getReload());

    this.view.setVisible(true);
}

private void switchView() {
    this.view.getCreatePostLabel().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        CreatePostView2 createPostView2 = new CreatePostView2();
        createPostView2.setVisible(true);
        view.dispose();

    }
    });

    this.view.getSettingLabel().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        new SettingView2().setVisible(true);
        view.dispose();
    }
    });

    this.view.getGameLabel().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        GameTableTennis a = new GameTableTennis();
        a.setVisible(true);
        view.dispose();
    }
    });
}

private void setupScrollListener() {
    JScrollPane scrollPane = view.getjScrollPane1();
    scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (!isLoading && e.getAdjustable().getMaximum() == e.getAdjustable().getValue() + e.getAdjustable().getVisibleAmount()) {
            loadMorePosts();
        }
    }
    });
}

private void ReloadActionPerformed(ActionEvent evt) {
    currentPage = 1;
    view.getMainLabel().removeAll();
    loadMorePosts();
}

private void loadMorePosts() {
    isLoading = true;
    List<Post> listPost = serviced.getAllPost(currentPage);

    if (listPost != null && !listPost.isEmpty()) {
        for (Post p : listPost) {

            boolean isLiked = serviced.isPostLikedByUser(p, UserSession.getCurrentUser());

            PanePost panePost = new PanePost(p);
            updateLikeButtonUI(panePost.getButtonLike(), isLiked);
            panePost.getButtonLike().addActionListener(evt2 -> likeActionPerformed(evt2, p, panePost.getButtonLike(), panePost));
            EffectButtonLLabel.buttonHoverEffect(panePost.getButtonLike());
            EffectButtonLLabel.buttonHoverEffect(panePost.getButtonComment());

            int countComment = serviced.getCommentCount(p);
            panePost.getCommentLabel().setText(countComment + "");

            this.view.getMainLabel().add(panePost, 0);
            panePost.getButtonComment().addActionListener(evt3 -> commentActionPerformed(evt3, p, panePost));
            panePost.getDeletePostLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                panePost.getdPopupMenu().show(panePost.getDeletePostLabel(), evt.getX(), evt.getY());
            }
            });
            panePost.getDeleteMenuItem().addActionListener(evt4 -> deletePostActionPerformed(evt4, p.getPostId()));
        }
        currentPage++;
    }

    view.revalidate();
    view.repaint();
    isLoading = false;
}

private void likeActionPerformed(ActionEvent evt, Post post, JButton buttonLike, PanePost panePost) {
    boolean isLiked = serviced.addAndDeleteLike(post, UserSession.getCurrentUser());

    int updatedLikeCount = serviced.getLikeCount(post);
    panePost.getLabelLike().setText(String.valueOf(updatedLikeCount));

    updateLikeButtonUI(buttonLike, isLiked);
}

private void updateLikeButtonUI(JButton button, boolean isLiked) {
    if (isLiked) {
        button.setText("Liked");
    } else {
        button.setText("Like");
    }
}

private void commentActionPerformed(ActionEvent evt3, Post post, PanePost panePost) {

    JDialog commentDialog = new JDialog(view, "Lifebool COMMENT", true);
    commentDialog.setSize(400, 300);
    commentDialog.setLocationRelativeTo(view);

    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel inputPanel = new JPanel();
    inputPanel.setPreferredSize(new Dimension(400, 50));
    JTextField userComment = new JTextField();
    userComment.setPreferredSize(new Dimension(380, 30));
    inputPanel.add(userComment);

    JPanel commentListPanel = new JPanel();
    commentListPanel.setLayout(new BoxLayout(commentListPanel, BoxLayout.Y_AXIS));

    loadComments(post, commentListPanel);

    JScrollPane scrollPane = new JScrollPane(commentListPanel);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    mainPanel.add(inputPanel, BorderLayout.NORTH);
    mainPanel.add(scrollPane, BorderLayout.CENTER);

    userComment.addActionListener(e -> {
        String content = userComment.getText().trim();
        if (!content.isEmpty()) {
            boolean success = serviced.addComment(post, UserSession.getCurrentUser(), content);
            if (success) {
                ACommentPanel newCommentPanel = new ACommentPanel();
                newCommentPanel.getUserNameComment().setText(UserSession.getCurrentUser().getUserName());
                newCommentPanel.getContent().setText(content);
                commentListPanel.add(newCommentPanel, 0);
                commentListPanel.revalidate();
                commentListPanel.repaint();

                userComment.setText("");
                int updatedCommentCount = serviced.getCommentCount(post);
                panePost.getCommentLabel().setText(String.valueOf(updatedCommentCount));

            } else {
                JOptionPane.showMessageDialog(commentDialog, "Failed to add comment. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(commentDialog, "Comment cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    });

    commentDialog.add(mainPanel);
    commentDialog.setVisible(true);
}

private void loadComments(Post post, JPanel commentListPanel) {
    commentListPanel.removeAll();
    commentListPanel.setLayout(new BoxLayout(commentListPanel, BoxLayout.Y_AXIS));

    List<Comment> comments = serviced.getAllComments(post);
    if (comments != null && !comments.isEmpty()) {
        for (Comment com : comments) {
            ACommentPanel commentPanel = new ACommentPanel();
            commentPanel.getUserNameComment().setText(com.getUser().getUserName());
            commentPanel.getContent().setText(com.getContent());

            if (com.getUser().getUserId() != UserSession.getCurrentUser().getUserId()) {
                commentPanel.getUpDeLabel().setVisible(false);
                commentListPanel.add(commentPanel, 0);
            } else {
                commentPanel.getUpDeLabel().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    commentPanel.getCommentPopupMenu().show(commentPanel.getUpDeLabel(), evt.getX(), evt.getY());
                }
                });

                // Xử lý sự kiện update comment 
                commentPanel.getUpdateComment().addActionListener(e -> {
                    String newContent = JOptionPane.showInputDialog(view, "Edit your comment:", com.getContent());
                    if (newContent != null && !newContent.trim().isEmpty()) {
                        boolean updated = serviced.updateComment(com.getCommentId(), newContent.trim());
                        if (updated) {
                            commentPanel.getContent().setText(newContent.trim());
                            JOptionPane.showMessageDialog(view, "Comment updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(view, "Failed to update comment.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                // Xử lý sự kiện delete comment
                commentPanel.getDeleteComment().addActionListener(e -> {
                    int confirm = JOptionPane.showConfirmDialog(view, "Are you sure you want to delete this comment?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        boolean deleted = serviced.deleteComment(com.getCommentId());
                        if (deleted) {
                            commentListPanel.remove(commentPanel);
                            commentListPanel.revalidate();
                            commentListPanel.repaint();
                        } else {
                            JOptionPane.showMessageDialog(view, "Failed to delete comment.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
            commentListPanel.add(commentPanel, 0);
        }
    }
    commentListPanel.revalidate();
    commentListPanel.repaint();
}

private void searchActionPerformed(ActionEvent evt) {
    String keyword = view.getSearchTF().getText().trim();

    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please enter a keyword to search.", "Search Failed", JOptionPane.WARNING_MESSAGE);
        return;
    }

    List<Post> searchResults = serviced.searchPostsByContent(keyword);

    if (searchResults == null || searchResults.isEmpty()) {
        JOptionPane.showMessageDialog(view, "No posts found matching your search.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    } else {
        view.getMainLabel().removeAll();

        for (Post p : searchResults) {
            boolean isLiked = serviced.isPostLikedByUser(p, UserSession.getCurrentUser());

            PanePost panePost = new PanePost(p);
            updateLikeButtonUI(panePost.getButtonLike(), isLiked);
            panePost.getButtonLike().addActionListener(evt2 -> likeActionPerformed(evt2, p, panePost.getButtonLike(), panePost));

            int countComment = (p.getComments() != null) ? p.getComments().size() : 0;
            panePost.getCommentLabel().setText(countComment + "");

            this.view.getMainLabel().add(panePost, 0);
            panePost.getButtonComment().addActionListener(evt3 -> commentActionPerformed(evt3, p, panePost));
        }

        view.revalidate();
        view.repaint();
    }
}

private void deletePostActionPerformed(ActionEvent evt, int postId) {
    boolean flag = serviced.deletePost(postId);

    if (flag) {
        JOptionPane.showMessageDialog(view, "Post deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        ReloadActionPerformed(null);
    } else {
        JOptionPane.showMessageDialog(view, "Failed to delete post. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}
