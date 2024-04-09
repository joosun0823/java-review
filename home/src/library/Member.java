package library;

public class Member {
	//필드
	int memberNumber;
	String memberName;
	String memberPhoneNumber;
	String memberAddress;
	Book[] memberBookList;
	
	//생성자
	//매개변수 3개 있는 생성자
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
		System.out.println(this.memberNumber + "." + this.memberName);
		System.out.println("주소 :" + this.memberAddress);
		System.out.println("핸드폰 번호 :" + this.memberPhoneNumber);
	}
	
	//빌린 책목록 보여주기 메소드
	void showBookList() {
		Book book = null;
		for(int i = 0; i< memberBookList.length; i++) {
			book = memberBookList[i];
			if(book == null) {
				continue;
			}
			
			System.out.println(book.bookName);
		}
	}
}
