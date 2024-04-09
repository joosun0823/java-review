package final1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Board {
//	Board 클래스
//  - 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
//  addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
	//매개변수 2개 제목, 내용 문자열 형식
	//put 이용해서 넣어주면 됨
//  deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
//     해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
	//매개변수로 아이디값을 받아야 삭제할것을 골라줌
//  getAllPosts(): 모든 게시물을 리스트로 반환
	
	
	// HashMap 사용 
	// Key에는 id값 value에는 post클래스로 넣고
	// value에 들어가 hashmap에는
	// 키 값 제목 벨류 값 게시판 내용
	//근데 get set 이용해야댐...; 일단 되게만 해보자
	

	
	
	public HashMap<Integer, Post> post = new HashMap<>();
	int id = 1;
	
	
	//게시물 추가
	HashMap<Integer, Post> addPost(String title, String content) {
		Post p = new Post();
		p.setTitle(title);
		p.setContent(content);
		this.post.put( id , p);

		id++;
		p.setId(id);
		
		if(p.getTitle() == null) {
			System.out.println("추가 불가");
		} else {
			
			
			System.out.println(post);
			System.out.println(p.getContent());
		}
		
		return post;
	}
	
	//게시물 삭제
	void deletePost(int num) throws IllegalArgumentException{
//		if(!post.containsKey(num)) {
//			throw new IllegalArgumentException();
//		}
		post.remove(num);
		System.out.println(post);
	}
	
	//게시물 리스트
	void getAllposts() {
		Set<Entry<Integer, Post>> entry = post.entrySet();
		for(Entry<Integer, Post> e : entry) {
			System.out.println(e.getValue().getTitle() + ":" + e.getValue().getContent());
		}	
	}
}
