package view.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimplePostPanel extends JPanel {

public SimplePostPanel(String userName, String postText, ImageIcon postImage) {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    setBackground(Color.WHITE);
    setPreferredSize(new Dimension(500, 400));  // Thay đổi kích thước panel ở đây

    JPanel headerPanel = new JPanel();
    headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

    ImageIcon profilePicIcon = new ImageIcon(getClass().getResource("/user.png"));
    JLabel profilePicLabel = new JLabel();
    profilePicLabel.setIcon(profilePicIcon);
    profilePicLabel.setPreferredSize(new Dimension(40, 40));
    headerPanel.add(profilePicLabel);

    JLabel nameLabel = new JLabel(userName);
    nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
    headerPanel.add(nameLabel);

    add(headerPanel);

    if (postImage != null) {
        JLabel postImageLabel = new JLabel();
        postImageLabel.setIcon(postImage);
        add(postImageLabel);
    }

    JTextArea postTextArea = new JTextArea(postText);
    postTextArea.setEditable(false);
    postTextArea.setWrapStyleWord(true);
    postTextArea.setLineWrap(true);
    postTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
    postTextArea.setBackground(Color.WHITE);
    add(postTextArea);

    JPanel actionPanel = new JPanel();
    actionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

    JButton likeButton = new JButton("Like");
    likeButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(userName + " liked the post.");
    }
    });
    actionPanel.add(likeButton);

    JButton commentButton = new JButton("Comment");
    commentButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(userName + " commented on the post.");
    }
    });
    actionPanel.add(commentButton);

    add(actionPanel);
}

public static void main(String[] args) {
    // Tạo khung cửa sổ chứa panel
    JFrame frame = new JFrame("Simple Post");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 500);  // Tăng kích thước của frame nếu cần thiết

    // Test dữ liệu
    ImageIcon postImage = new ImageIcon("path_to_image.jpg");  // Đường dẫn đến hình ảnh bài viết
    SimplePostPanel postPanel = new SimplePostPanel("John Doe", "This is a simple .", postImage);

    // Thêm panel vào frame và hiển thị
    frame.add(new JScrollPane(postPanel));
    frame.setVisible(true);
}
}
