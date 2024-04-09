package library;

public class Member {
	//필드
	//회원 이름, 회원 번호, 회원 폰번호, 회원 주소, 회원이 빌린 책 리스트
	int memberNumber;
	String memberName;
	String memberPhoneNumber;
	String memberAddress;
	Book[] memberBookList;

	//매개변수 3개 받는 생성
	public Member(String memberName, String memberPhoneNumber, String memberAddress) {
		super();
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.memberAddress = memberAddress;
		this.memberNumber = 0;
		this.memberBookList = new Book[3];
	}
	
	//메소드
	//회원정보 보여주기 메소드
	void showMemberInfo() {
		System.out.println(this.memberNumber+1 + "." + this.memberName);
		System.out.println("주소 : " + this.memberAddress);
		System.out.println("핸드폰 번호 : " + this.memberPhoneNumber);
	}
	
	//빌린 책 목록 보여주기 메소드
	void showMemberBookList() {
		Book book = null;
		//받아올 객체가 모르기 때문에 초기값 null
		for(int i = 0; i < memberBookList.length; i++) {
			//객체 배열 memberBookList i번째 객체를 저장
			book = memberBookList[i];
			if(book == null) {
				continue;
			}
			
			System.out.println(book.bookName);
		}
	}
	
}
