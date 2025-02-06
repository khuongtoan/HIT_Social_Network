package service;

import java.util.List;

import model.Post;
import model.Role;
import model.Status;
import model.User;

public interface ServiceInterfaces {

public boolean addComment(Post post, User user, String content);

public boolean updateComment(int commentId, String newContent);

public boolean deleteComment(int commentId);

public boolean addAndDeleteLike(Post post, User user);

public boolean addPost(User user, String content, String fontFamily, Integer fontSize, String textColor, String backgroundColor);

public boolean addPost(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor);

public boolean updatePost(int postId, String newContent, String newImagePath);

public boolean updatePost(int postId, String newContent);

public boolean deletePost(int postId);

public List<Post> searchPostsByContent(String keyword);

public List<Post> getAllPost();

public boolean addUser(String userName, String password, String email, String passwordRecovery, String passwordRecoveryAnswer);

public boolean deleteUser(int UserId);

public boolean updatePassword(int userId, String oldPassword, String newPassword);

public boolean updateEmail(int userId, String newEmail);

public boolean updatePasswordRecovery(int userId, String newPasswordRecovery);

public boolean updateRole(int userId, Role newRole);

public boolean updateStatus(int userId, Status newStatus);

public List<User> searchByUsername(String keyword);

public boolean changePasswordByEmail(String email, String newPassword);

public boolean verifyRecoveryInfo(String email, String question, String answer);

}
