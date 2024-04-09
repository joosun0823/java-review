package final1;

import java.util.List;

public class Main {

//	Post 클래스
//	- 모든 필드는 private으로 설정한다
//	id: 게시물의 고유 식별자 (정수)
//	title: 게시물의 제목 (문자열)
//	content: 게시물의 내용 (문자열)

//	Board 클래스
//	- 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
//	addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
//	deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
//		해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
//	getAllPosts(): 모든 게시물을 리스트로 반환

//	Main 클래스
//	- 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
	public static void main(String[] args) {

		Board board = new Board();
		board.addPost("제목 1", "내용 1");
		board.addPost("제목 2", "내용 2");
		board.addPost("제목 3", "내용 3");
		System.out.println("게시물 작성완료");

		List<Post> a = board.getAllPosts();
		for (Post post : a) {
			System.out.println(post.getId());
			System.out.println(post.getTitle());
			System.out.println(post.getContent());
		}

	}

}
