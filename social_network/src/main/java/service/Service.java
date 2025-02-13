package service;

import java.util.List;

import dao.PostDao;
import dao.UserDao;
import model.Comment;
import model.Post;
import model.Role;
import model.Status;
import model.User;

public class Service implements ServiceInterfaces {

@Override
public boolean addComment(Post post, User user, String content) {
    return PostDao.addComment(post, user, content);
}

@Override
public boolean addAndDeleteLike(Post post, User user) {
    return PostDao.addAndDeleteLike(post, user);
}

@Override
public boolean addPost(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    return PostDao.addPost(user, content, imagePath, fontFamily, fontSize, textColor, backgroundColor);
}

@Override
public boolean addPost(User user, String content, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    return PostDao.addPost(user, content, fontFamily, fontSize, textColor, backgroundColor);
}

@Override
public boolean deletePost(int postId) {
    return PostDao.deletePost(postId);
}

@Override
public int addUser(String userName, String password, String email, String passwordRecovery, String passwordRecoveryAnswer) {
    return UserDao.addUser(userName, password, email, passwordRecovery, passwordRecoveryAnswer);
}

@Override
public boolean deleteUser(int UserId) {
    return UserDao.deleteUser(UserId);
}

@Override
public boolean updatePassword(int userId, String oldPassword, String newPassword) {
    return UserDao.updatePassword(userId, oldPassword, newPassword);
}

@Override
public boolean updateEmail(int userId, String newEmail) {
    return UserDao.updateEmail(userId, newEmail);
}

@Override
public boolean updatePasswordRecovery(int userId, String newPasswordRecovery, String newAnswerRecovery) {
    return UserDao.updatePasswordRecovery(userId, newPasswordRecovery, newAnswerRecovery);
}

@Override
public boolean updateRole(String userName, Role newRole) {
    return UserDao.updateRole(userName, newRole);
}

@Override
public boolean updateStatus(String userName, Status newStatus) {
    return UserDao.updateStatus(userName, newStatus);
}

@Override
public List<Post> searchPostsByContent(String keyword) {
    return PostDao.searchPostsByContent(keyword);
}

@Override
public List<User> searchByUsername(String keyword) {
    return UserDao.searchByUsername(keyword);
}

@Override
public List<Post> getAllPost() {
    return PostDao.getAllPost();
}

@Override
public boolean changePasswordByUserName(String userName, String newPassword) {
    return UserDao.changePasswordByUserName(userName, newPassword);
}

@Override
public boolean verifyRecoveryInfo(String email, String answer) {
    return UserDao.verifyRecoveryInfo(email, answer);
}

@Override
public User authUser(String username, String password) {
    return UserDao.authUser(username, password);
}

@Override
public String getPasswordRecoveryQuestion(String userName) {
    return UserDao.getPasswordRecoveryQuestion(userName);
}

@Override
public boolean checkPasswordCurrentUser(String username, String password) {
    return UserDao.checkPasswordCurrentUser(username, password);
}

@Override
public boolean updateUserName(int userId, String newUserName) {
    return UserDao.updateUserName(userId, newUserName);
}

@Override
public boolean isPostLikedByUser(Post post, User user) {
    return PostDao.isPostLikedByUser(post, user);
}

@Override
public int getLikeCount(Post post) {
    return PostDao.getLikeCount(post);
}

@Override
public List<Comment> getAllComments(Post post) {
    return PostDao.getAllComments(post);
}

}
