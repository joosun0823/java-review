package final1;

import java.util.ArrayList;
import java.util.List;

public class Board {
	// 컬렉션 프레임워크
	private List<Post> posts;
	private int nextId;

	// 생성자
	public Board() {
		super();
		this.posts = new ArrayList<>();
		this.nextId = 1;
	}

	// 제목, 내용 받아서 게시판 등록 메소드
	public void addPost(String title, String content) {
		Post post = new Post(nextId++, title, content);
		posts.add(post);
		System.out.println("1");
	}

	// 삭제메소드
	public void deletePost(int id) throws IllegalArgumentException {
		boolean removed = false;
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i).getId() == id) {
				posts.remove(i);
				removed = true;
				break;
			}
		}
		if (!removed) {
			throw new IllegalArgumentException("해당 ID값이없습니다");
		}

	}

	// 전체조회 메소드
	public List<Post> getAllPosts() {
		return new ArrayList<>(posts);
	}

}
