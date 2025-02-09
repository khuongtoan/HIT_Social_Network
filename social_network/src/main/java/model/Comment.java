package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
public class Comment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "comment_id")
private Integer commentId;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "post_id", nullable = false)
private Post post;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_id", nullable = false)
private User user;

@Column(name = "content", columnDefinition = "TEXT", nullable = false)
private String content;

@Column(name = "created_at", nullable = false)
private LocalDateTime createdAt;

@PrePersist
public void prePersist() {
    if (this.createdAt == null) {
        this.createdAt = LocalDateTime.now();
    }
}

public Comment(Post post, User user, String content) {
    this.post = post;
    this.user = user;
    this.content = content;
}

public Comment() {

}

public Integer getCommentId() {
    return commentId;
}

public void setCommentId(Integer commentId) {
    this.commentId = commentId;
}

public Post getPost() {
    return post;
}

public void setPost(Post post) {
    this.post = post;
}

public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
}

public String getContent() {
    return content;
}

public void setContent(String content) {
    this.content = content;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}

}
