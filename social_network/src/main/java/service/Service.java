package service;

import java.util.List;

import dao.PostDao;
import dao.UserDao;
import model.Post;
import model.Role;
import model.Status;
import model.User;

public class Service implements Iservice {

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
	public boolean addPost(User user, String content, String imagePath) {
		return PostDao.addPost(user, content, imagePath);
	}

	@Override
	public boolean addPost(User user, String content) {
		return PostDao.addPost(user, content);
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
	public boolean addUser(String username, String password, String email, String passwordRecovery) {
		return UserDao.addUser(username, passwordRecovery, email);
	}

	@Override
	public boolean addUser(String username, String password, String email) {
		return UserDao.addUser(username, password, email);
	}

	@Override
	public boolean addUser(String username, String password, String email, String passwordRecovery, Role role,
			Status status) {
		return UserDao.addUser(username, password, email, passwordRecovery, role, status);
	}

	@Override
	public boolean addUser(String username, String password, String email, Role role, Status status) {
		return UserDao.addUser(username, password, email, role, status);
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

}
