package controller;

import static common.EffectButtonLLabel.setLabelHoverEffect;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.util.List;
import model.Post;
import model.Role;
import model.User;
import service.Service;
import view.AdminSettingView;
import view.CreatePostView;
import view.PersonalView;
import view.UserSettingView;
import view.component.PanePost;

public class PersonalViewController {

private PersonalView view;
private Service serviced;

public PersonalViewController(PersonalView personalView) {
    this.view = personalView;
    
    this.serviced = new Service();
    view.getReload().addActionListener(evt -> ReloadActionPerformed(evt));
    
    setLabelHoverEffect(this.view.getCreatePostLabel());
    setLabelHoverEffect(this.view.getGame());
    setLabelHoverEffect(this.view.getSettingLabel());
    setLabelHoverEffect(this.view.getNameLabel());
    setLabelHoverEffect(this.view.getLabelSearch());

    
    switchView();
    this.view.getNameLabel().setText(UserSession.getCurrentUser().getUserName());
    this.view.setVisible(true);
}

private void switchView() {
    this.view.getCreatePostLabel().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        CreatePostView createPostView = new CreatePostView();
        createPostView.setVisible(true);
        view.dispose();

    }
    });

    this.view.getSettingLabel().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view.setVisible(false);
        if (UserSession.getCurrentUser().getRole() == Role.ADMIN) {
            AdminSettingView adminSettingView = new AdminSettingView();
            adminSettingView.setVisible(true);
        } else {
            UserSettingView userSettingView = new UserSettingView();
            userSettingView.setVisible(true);

        }

        view.dispose();

    }
    });
}

private void ReloadActionPerformed(ActionEvent evt) {
    List<Post> listPost = serviced.getAllPost();
    view.getMainLabel().removeAll();

    if (listPost != null) {
        for (Post p : listPost) {
            
            User user = p.getUser();
            String content = p.getContent();
            String imagePath = p.getImagePath() != null ? p.getImagePath() : "";
            String fontFamily = p.getFontFamily();
            Integer fontSize = p.getFontSize();
            String textColor = p.getTextColor();
            String backgroundColor = p.getBackgroundColor();
            int likeCount = p.getLikes().size();
            int commentCount = p.getComments().size();

            PanePost panePost = new PanePost( user, content, imagePath, fontFamily, fontSize, textColor, backgroundColor, likeCount, commentCount);
            this.view.getMainLabel().add(panePost, 0);
        }
    }

    view.revalidate();
    view.repaint();
}

}
