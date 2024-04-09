package library;

public class Library {
	//필드
	//회원 목록, 책 목록, 현재 회원수, 현재 책수
	Book[] libraryBookList;
	Member[] libraryMemberList;
	int libraryBookCnt;
	int libraryMemberCnt;
	
	//기본생성자
	//초기값 설정
	public Library() {
		super();
		this.libraryBookList = new Book[20];
		this.libraryMemberList = new Member[30];
		this.libraryBookCnt = 0;
		this.libraryMemberCnt = 0;
	}

	//메소드
	
	//회원가입하기
	boolean join(Member member) {
		//현재 회원수가 30명이 넘는다면 회원등록 불가
		if(this.libraryMemberCnt > 29) {
			return false;
		}
		//매개변수로 받는 객체를 도서관회원 배열에 저장
		this.libraryMemberList[this.libraryMemberCnt] = member;
		//회원 번호를 자동으로 부여
		member.memberNumber = this.libraryMemberCnt;
		//현재 회원수 +1
		this.libraryMemberCnt++;
		return true;
	}
	
	//책등록하기
	boolean bookRegister(Book book) {
		if(this.libraryBookCnt > 19) {
			return false;
		}
		//매개변수로 받는 객체를 도서관책 배열에 저장
		this.libraryBookList[this.libraryBookCnt] = book;
		//책 번호를 자동으로 부여
		book.bookNumber = this.libraryBookCnt;
		//현재 책수 +1
		this.libraryBookCnt++;
		return true;
	}
	
	
	//등록된 회원보여주기
	void showLibraryMemberList() {
		
		Member member = null;
		//넘어올 객체 모르기 때문에 null값
		for(int i = 0; i < this.libraryMemberList.length; i++) {
			//도서관회원배열 i번째를 객체에 저장
			member = libraryMemberList[i];
			
			if(member == null ) {
				break;
			}
			//i번째 도서관회원정보 보여주기 메소드
			member.showMemberInfo();
			System.out.println("===빌린 책 목록===");
			member.showMemberBookList();
		}
		
	}
	
	//등록된 책 보여주기
	void showLibraryBookList() {
		Book book = null;
		for( int i = 0; i < this.libraryBookList.length; i++) {
			book = libraryBookList[i];
			if(book == null) {
				break;
			}
			
			book.showBookInfo();
		}
	}
	
	//대여하기
	boolean bookRental(int bookNumber, Member member) {
		Book book = this.libraryBookList[bookNumber];
		if(book.bookStatus) {
			for(int i = 0; i<member.memberBookList.length; i++) {
				book.bookStatus = false;
				member.memberBookList[i] = book;
				return true;
			}
		}
		
		return false;
	}
	
	
	//반납하기
	void bookReturn(int bookNumber, Member member) {
		Book book = this.libraryBookList[bookNumber];
		if(book != null) {
			book.bookStatus = true;
			for(int i = 0; i < member.memberBookList.length; i++) {
				if(member.memberBookList[i] != null && member.memberBookList[i].bookNumber == bookNumber) {
					member.memberBookList[i] = null;
					return;
				}
			}
		}
	}
	
}
