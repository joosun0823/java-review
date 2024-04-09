package final1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Board1 {
	private Map<Integer, Post> posts;
	private int nextId;

	public Board1() {
		super();
		this.posts = posts;
		this.nextId = 1;
	}

	// 등록 메소드
	public void addPost(String title, String content) {
		Post post = new Post(nextId++, title, content);
		posts.put(post.getId(), post);
		System.out.println("게시물 작성완료");

	}

	// 삭제 메소드
	public void deletePost(int id) throws IllegalArgumentException {
		if (!posts.containsKey(id)) {
			throw new IllegalArgumentException("해당 id값이 없습니다");
		}
		posts.remove(id);
	}

	// 조회 메소드
	public List<Post> getAllPosts() {
		return new ArrayList<>(posts.values());
	}

}
