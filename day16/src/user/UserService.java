package user;

import java.util.ArrayList;

public class UserService {
//	UserService 클래스
//	회원정보를 저장할 list를 private로 선언한다
//	메소드 : 아이디 중복 검사 메소드
//		회원가입 메소드
//		로그인 메소드
	
	private ArrayList<UserVO> list;
	
	//생성자
	public UserService() {
		super();
		this.list = new ArrayList<>();
	} 
	
	//메소드
	
	//아이디 중복 검사 메소드
	//매개변수에 사용자가 적을 아이디를 받는다
	//foreach반복문으로 UserVo클래스에 있는
	//필드 아이디값과 매개변수로 받을 아이디값
	//동일한지 비교메소드 equals()
	//동일하다면 true
	
	boolean idDuplicate(String id) {
		for(UserVO user : list) {
			if(user.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//회원가입메소드
	//아이디중복 메소드이용
	void join(UserVO user) {
		if(!idDuplicate(user.getId())) {
			list.add(user);
			System.out.println("회원가입 완료");
		} else {
			System.out.println("이미 존재하는 아이디이다");
		}
	}
	
	//로그인메소드
	void login(String id, String pw) {
		for(UserVO user : list) {
			if(user.getId().equals(id) && user.getPw().equals(pw)) {
				System.out.println("로그인 되었습니다");
			} else { 
				System.out.println("로그인 정보가 다릅니다");
			}
		}
	}
	
}
