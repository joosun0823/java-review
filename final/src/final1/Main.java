package final1;

public class Main {
//   Main 클래스
//   - 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
   public static void main(String[] args) {
	Board b = new Board();
	
	b.addPost("제목1","후우우우우");
	b.addPost("제목2","목목목목4");
	b.addPost("제목3", "123123");
	b.addPost("제목5", "이도건븅신");
//	System.out.println("=============");
	
	try {
//		if()
		b.deletePost(0);
	} catch (IllegalArgumentException e) {

		e.printStackTrace();
	}

//	System.out.println("===========");
	b.getAllposts();
	
	  }
}
