package review;

import java.util.ArrayList;

public class UserService {
//	UserService 클래스
//	회원정보를 저장할 list를 private로 선언한다
//	메소드 : 아이디 중복 검사 메소드
//		회원가입 메소드
//		로그인 메소드
	
	//필드
	//모든 회원정보를 저장하는 리스트(private ArrayList)
	private ArrayList<UserVO> userList = new ArrayList<>();
	
	//메소드
	//id 중복 검사( 매개변수 o, 리턴타입 o)
	public boolean checkId(String id) {
		//모든 회원정보를 하나씩 가져와 변수에 담는다(for-each문)
		//조건문(if) 변수에 담긴 id값과 매개변수로 전달한 id와 비교한다(equals)
		for(UserVO user : userList) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		
		return true;
	}
	
	//회원가입(매개변수 o, 리턴타입 x)
	public void join(UserVO user) {
		userList.add(user);
	}
	
	//로그인(매개변수 o, 리턴타입 o)
	//for-each문 userList를 변수에 하나씩 복사{
	//조건문 (if문) id동일 && pw동일{
	// return 변수;
	// return null;
	
	public UserVO login(String id, String pw) {
		for(UserVO user : userList) {
			if(user.getId().equals(id) && user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}

	
	
	
	
}
