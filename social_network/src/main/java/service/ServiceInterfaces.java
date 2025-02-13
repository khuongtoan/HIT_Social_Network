package service;

import java.util.List;
import model.Comment;

import model.Post;
import model.Role;
import model.Status;
import model.User;

public interface ServiceInterfaces {

public List<Comment> getAllComments(Post post);

public boolean addComment(Post post, User user, String content);

public boolean addAndDeleteLike(Post post, User user);

public boolean isPostLikedByUser(Post post, User user);

public int getLikeCount(Post post);

public boolean addPost(User user, String content, String fontFamily, Integer fontSize, String textColor, String backgroundColor);

public boolean addPost(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor);

public boolean deletePost(int postId);

public List<Post> searchPostsByContent(String keyword);

public List<Post> getAllPost();

public int addUser(String userName, String password, String email, String passwordRecovery, String passwordRecoveryAnswer);

public boolean deleteUser(int UserId);

public boolean updateUserName(int userId, String newUserName);

public boolean updatePassword(int userId, String oldPassword, String newPassword);

public boolean updateEmail(int userId, String newEmail);

public boolean updatePasswordRecovery(int userId, String newPasswordRecovery, String newAnswerRecovery);

public boolean updateRole(String userName, Role newRole);

public boolean updateStatus(String userName, Status newStatus);

public List<User> searchByUsername(String keyword);

public boolean changePasswordByUserName(String userName, String newPassword);

public boolean verifyRecoveryInfo(String email, String answer);

public User authUser(String username, String password);

public String getPasswordRecoveryQuestion(String userName);

public boolean checkPasswordCurrentUser(String username, String password);

}
