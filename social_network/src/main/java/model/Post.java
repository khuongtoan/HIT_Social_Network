package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;

@Entity
public class Post {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "post_id")
private Integer postId;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_id", nullable = false)
private User user;

@Column(name = "content", columnDefinition = "TEXT", nullable = false)
private String content;

@Column(name = "image_path", length = 500)
private String imagePath;

@Column(name = "font_family", length = 100)  // Lưu font chữ (tên font)
private String fontFamily;

@Column(name = "font_size")
private Integer fontSize; // Lưu cỡ chữ

@Column(name = "text_color", length = 10)  // Lưu màu chữ (dạng mã hex)
private String textColor;

@Column(name = "background_color", length = 10)  // Lưu màu nền (dạng mã hex)
private String backgroundColor;


@Column(name = "created_at")
private LocalDateTime createdAt;

@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
private List<Comment> comments = new ArrayList<>();

@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
private List<Like> likes = new ArrayList<>();

@PrePersist
public void prePersist() {
    if (this.createdAt == null) {
        this.createdAt = LocalDateTime.now();
    }
}

// Constructors
public Post(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    this.user = user;
    this.content = content;
    this.imagePath = imagePath;
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
    this.textColor = textColor;
    this.backgroundColor = backgroundColor;
}

public Post() {
}

public Post(User user, String content, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    this.user = user;
    this.content = content;
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
    this.textColor = textColor;
    this.backgroundColor = backgroundColor;
}


public Integer getPostId() {
    return postId;
}

public void setPostId(Integer postId) {
    this.postId = postId;
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

public String getImagePath() {
    return imagePath;
}

public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}

public List<Comment> getComments() {
    return comments;
}

public void setComments(List<Comment> comments) {
    this.comments = comments;
}

public List<Like> getLikes() {
    return likes;
}

public void setLikes(List<Like> likes) {
    this.likes = likes;
}

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }



}
