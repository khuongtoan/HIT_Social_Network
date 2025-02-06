package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Post;
import service.Service;
import view.PersonalView;
import view.component.PanePost;

public class PersonalViewController {

private PersonalView view;
private Service serviced;

public PersonalViewController(PersonalView personalView) {
    this.view = personalView;
    serviced = new Service();
    view.getReload().addActionListener(evt -> ReloadActionPerformed(evt));
    setLabelHoverEffect(this.view.getHome());
    setLabelHoverEffect(this.view.getCreatePostLabel());
    setLabelHoverEffect(this.view.getGame());
    setLabelHoverEffect(this.view.getSettingLabel());
    setLabelHoverEffect(this.view.getNameLabel());
    setLabelHoverEffect(this.view.getLabelSearch());

}

private void ReloadActionPerformed(ActionEvent evt) {
    List<Post> listPost = serviced.getAllPost();
    view.getMainLabel().removeAll();

    if (listPost != null) {
        for (Post p : listPost) {
            String username = p.getUser().getUserName();
            String postContentText = p.getContent();
            String imagePath = p.getImagePath() != null ? p.getImagePath() : "";
            int likeCount = p.getLikes().size();
            int commentCount = p.getComments().size();

            PanePost panePost = new PanePost(username, postContentText, imagePath, likeCount, commentCount);
            view.addPostToMainLabel(panePost);
        }
    }

    view.revalidate();
    view.repaint();
}

// Method để tạo hiệu ứng hover cho label
private void setLabelHoverEffect(JLabel label) {
    label.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        label.setBackground(Color.LIGHT_GRAY); // Màu khi chuột di vào
        label.setOpaque(true); // Đảm bảo label có nền
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        label.setBackground(null); // Đặt lại màu nền khi chuột ra
    }
    });
}

}
