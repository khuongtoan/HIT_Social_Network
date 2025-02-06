package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Comment;
import model.Like;
import model.Post;
import model.User;
import service.EntityManagerUtil;

public class PostDao {
	static EntityManager entityManager = EntityManagerUtil.getEntityManager();

	public PostDao() {
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
			return false;
		}
	}

	public static boolean updateComment(int commentId, String newContent) {
		try {
			Comment comment = entityManager.find(Comment.class, commentId);
			if (comment != null) {
				comment.setContent(newContent);
				entityManager.getTransaction().begin();
				entityManager.merge(comment);
				entityManager.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean deleteComment(int commentId) {
		try {
			Comment comment = entityManager.find(Comment.class, commentId);
			if (comment != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(comment);
				entityManager.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean addAndDeleteLike(Post post, User user) {
		try {
			TypedQuery<Like> query = entityManager
					.createQuery("SELECT l FROM Like l WHERE l.post = :post AND l.user = :user", Like.class);
			query.setParameter("post", post);
			query.setParameter("user", user);

			List<Like> existingLikes = query.getResultList();

			if (!existingLikes.isEmpty()) {
				Like existingLike = existingLikes.get(0);
				entityManager.getTransaction().begin();
				entityManager.remove(existingLike);
				entityManager.getTransaction().commit();
				return false;
			}

			Like like = new Like();
			like.setPost(post);
			like.setUser(user);

			entityManager.getTransaction().begin();
			entityManager.persist(like);
			entityManager.getTransaction().commit();
			return true;

		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
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
			return false;
		}
	}

	public static boolean updatePost(int postId, String newContent, String newImagePath) {
		try {
			Post post = entityManager.find(Post.class, postId);
			if (post != null) {
				post.setContent(newContent);
				post.setImagePath(newImagePath);

				entityManager.getTransaction().begin();
				entityManager.merge(post);
				entityManager.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			return false;
		}
	}

	public static boolean updatePost(int postId, String newContent) {
		try {
			Post post = entityManager.find(Post.class, postId);
			if (post != null) {
				post.setContent(newContent);
				entityManager.getTransaction().begin();
				entityManager.merge(post);
				entityManager.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
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
			return null;
		}
	}
        public static List<Post> getAllPost(){
            try{
                String queryStr = "SELECT P FROM Post P";
                TypedQuery<Post> query = entityManager.createQuery(queryStr, Post.class);
                return query.getResultList();
            }catch(Exception e){
                return null;
            }
        }
}
