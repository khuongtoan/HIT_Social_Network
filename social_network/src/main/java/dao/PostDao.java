package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Comment;
import model.Likes;
import model.Likes;
import model.Post;
import model.User;
import service.EntityManagerUtil;

public class PostDao {

static EntityManager entityManager = EntityManagerUtil.getEntityManager();

public PostDao() {
}

public static List<Comment> getAllComments(Post post) {
    try {
        String queryStr = "SELECT c FROM Comment c WHERE c.post = :post";
        TypedQuery<Comment> query = entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("post", post);

        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

public static boolean addComment(Post post, User user, String content) {
    try {
        Comment comment = new Comment(post, user, content);
        entityManager.getTransaction().begin();
        entityManager.persist(comment);
        entityManager.getTransaction().commit();
        return true;
    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        e.printStackTrace();

        return false;
    }
}

public static boolean addAndDeleteLike(Post post, User user) {
    try {
        TypedQuery<Likes> query = entityManager
                .createQuery("SELECT l FROM Likes l WHERE l.post = :post AND l.user = :user", Likes.class);
        query.setParameter("post", post);
        query.setParameter("user", user);

        List<Likes> existingLikes = query.getResultList();

        entityManager.getTransaction().begin(); // Bắt đầu transaction

        if (!existingLikes.isEmpty()) {
            System.out.println("User đã like trước đó, xóa like...");
            Likes existingLike = existingLikes.get(0);

            if (!entityManager.contains(existingLike)) {
                existingLike = entityManager.merge(existingLike); // Đảm bảo entity được quản lý trước khi xóa
            }

            entityManager.remove(existingLike);
            entityManager.getTransaction().commit();
            entityManager.clear(); // Xóa cache để đảm bảo dữ liệu mới nhất
            System.out.println("Like đã bị xóa!");
            return false;
        }

        System.out.println("User chưa like, thêm like mới...");
        Likes like = new Likes();
        like.setPost(post);
        like.setUser(user);

        entityManager.persist(like);
        entityManager.getTransaction().commit();
        entityManager.clear(); // Xóa cache để đảm bảo dữ liệu mới nhất
        System.out.println("Like mới đã được thêm!");
        return true;

    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        System.out.println("Lỗi khi xử lý like: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

public static boolean isPostLikedByUser(Post post, User user) {
    try {
        String queryStr = "SELECT COUNT(l) FROM Likes l WHERE l.post = :post AND l.user = :user";
        TypedQuery<Long> query = entityManager.createQuery(queryStr, Long.class);
        query.setParameter("post", post);
        query.setParameter("user", user);

        return query.getSingleResult() > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

public static int getLikeCount(Post post) {
    try {
        TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(l) FROM Likes l WHERE l.post = :post", Long.class);
        query.setParameter("post", post);
        return query.getSingleResult().intValue();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}

public static boolean addPost(User user, String content, String imagePath, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    try {
        Post post = new Post(user, content, imagePath, fontFamily, fontSize, textColor, backgroundColor);
        entityManager.getTransaction().begin();
        entityManager.persist(post);
        entityManager.getTransaction().commit();
        return true;
    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        e.printStackTrace();

        return false;
    }
}

public static boolean addPost(User user, String content, String fontFamily, Integer fontSize, String textColor, String backgroundColor) {
    try {
        Post post = new Post(user, content, fontFamily, fontSize, textColor, backgroundColor);

        entityManager.getTransaction().begin();
        entityManager.persist(post);
        entityManager.getTransaction().commit();
        return true;
    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        e.printStackTrace();

        return false;
    }
}

public static boolean deletePost(int postId) {
    try {
        Post post = entityManager.find(Post.class, postId);
        if (post != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(post);
            entityManager.getTransaction().commit();
            return true;
        }
        return false;
    } catch (Exception e) {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
        e.printStackTrace();

        return false;
    }
}

public static List<Post> searchPostsByContent(String keyword) {
    try {
        String queryStr = "SELECT p FROM Post p WHERE p.content LIKE :keyword";
        TypedQuery<Post> query = entityManager.createQuery(queryStr, Post.class);
        query.setParameter("keyword", "%" + keyword.trim() + "%");

        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();

        return null;
    }
}

public static List<Post> getAllPost() {
    try {
        String queryStr = "SELECT P FROM Post P";
        TypedQuery<Post> query = entityManager.createQuery(queryStr, Post.class);
        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();

        return null;
    }
}
}
