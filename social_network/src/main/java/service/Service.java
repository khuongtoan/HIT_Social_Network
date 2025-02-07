package service;

import java.util.List;

import dao.PostDao;
import dao.UserDao;
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
public boolean updateComment(int commentId, String newContent) {
    return PostDao.updateComment(commentId, newContent);
}

@Override
public boolean deleteComment(int commentId) {
    return PostDao.deleteComment(commentId);
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
public boolean updatePost(int postId, String newContent, String newImagePath) {
    return PostDao.updatePost(postId, newContent, newImagePath);
}

@Override
public boolean updatePost(int postId, String newContent) {
    return PostDao.updatePost(postId, newContent);
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
public boolean updatePasswordRecovery(int userId, String newPasswordRecovery) {
    return UserDao.updatePasswordRecovery(userId, newPasswordRecovery);
}

@Override
public boolean updateRole(int userId, Role newRole) {
    return UserDao.updateRole(userId, newRole);
}

@Override
public boolean updateStatus(int userId, Status newStatus) {
    return UserDao.updateStatus(userId, newStatus);
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
        return UserDao.changePasswordByUserName (userName, newPassword);
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

}
