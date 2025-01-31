package controller;

import java.awt.event.ActionEvent;
import java.util.List;
import model.Post;
import service.Service;
import view.PersonalView;
import view.component.PanePost;

public class PersonalViewController {

private PersonalView view;
private Service serviced;

public PersonalViewController(PersonalView personalView) {
    this.view = personalView;
    view.getReload().addActionListener(evt -> ReloadActionPerformed(evt));
}

private void ReloadActionPerformed(ActionEvent evt) {
    List<Post> listPost = serviced.getAllPost();
    view.getMainLabel().removeAll();

    if (listPost != null) {
        for (Post p : listPost) {
            String username = p.getUser().getUsername();
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
}
