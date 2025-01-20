package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name", length = 15, nullable = false)
	private String userName;

	@Column(name = "password", length = 50, nullable = false)
	private String password;

	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;

	@Column(name = "password_recovery", length = 100)
	private String passwordRecovery;

	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	private Role role = Role.USER;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status = Status.ACTIVE;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Post> posts;

	public User() {
	}

	public User(String userName, String password, String email, String passwordRecovery) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.passwordRecovery = passwordRecovery;
		this.role = Role.USER;
		this.status = Status.ACTIVE;
	}

	public User(String username, String password, String email) {
		this.userName = username;
		this.password = password;
		this.email = email;
		this.role = Role.USER;
		this.status = Status.ACTIVE;
	}

	public User(String username, String password, String email, String passwordRecovery, Role role, Status status) {
		this.userName = username;
		this.password = password;
		this.email = email;
		this.passwordRecovery = passwordRecovery;
		this.role = role;
		this.status = status;
	}

	public User(String userName, String password, String email, Role role, Status status) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordRecovery() {
		return passwordRecovery;
	}

	public void setPasswordRecovery(String passwordRecovery) {
		this.passwordRecovery = passwordRecovery;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return userName;
	}

}
