package service;

import java.util.List;

import model.Post;
import model.Role;
import model.Status;
import model.User;

public interface Iservice {

	public boolean addComment(Post post, User user, String content);

	public boolean updateComment(int commentId, String newContent);

	public boolean deleteComment(int commentId);

	public boolean addAndDeleteLike(Post post, User user);

	public boolean addPost(User user, String content, String imagePath);

	public boolean addPost(User user, String content);

	public boolean updatePost(int postId, String newContent, String newImagePath);

	public boolean updatePost(int postId, String newContent);

	public boolean deletePost(int postId);

	public List<Post> searchPostsByContent(String keyword);

	public boolean addUser(String username, String password, String email, String passwordRecovery);

	public boolean addUser(String username, String password, String email);

	public boolean addUser(String username, String password, String email, String passwordRecovery, Role role,
			Status status);

	public boolean addUser(String username, String password, String email, Role role, Status status);

	public boolean deleteUser(int UserId);

	public boolean updatePassword(int userId, String oldPassword, String newPassword);

	public boolean updateEmail(int userId, String newEmail);

	public boolean updatePasswordRecovery(int userId, String newPasswordRecovery);

	public boolean updateRole(int userId, Role newRole);

	public boolean updateStatus(int userId, Status newStatus);

	public List<User> searchByUsername(String keyword);
}
