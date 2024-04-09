package library;

public class Library {
	//필드
	Book[] libraryBookList;
	Member[] libraryMemberList;
	int libraryBookCnt;
	int libraryMemberCnt;

	
	//생성자
	public Library() {
		super();
		this.libraryBookList = new Book[20];
		this.libraryMemberList = new Member[30];
		this.libraryBookCnt = 0;
		this.libraryMemberCnt = 0;
	}
	
	
	//메소드
	//회원 가입하기
	boolean join (Member member) {
		if(this.libraryMemberCnt > 29) {
			return false;
		}
		
		this.libraryMemberList[this.libraryMemberCnt] = member;
		this.libraryMemberCnt++;
		member.memberNumber = this.libraryMemberCnt;
		
		return true;
	}
	
	
	//책등록하기
	boolean bookRegister (Book book) {
		if(this.libraryBookCnt > 19) {
			return false;
		}
		
		this.libraryBookList[this.libraryBookCnt] = book;
		this.libraryBookCnt++;
		book.bookNumber = this.libraryBookCnt;
		
		return true;
	}
	
	
	//등록된 회원 보기
	void showLibraryMemberList() {
		Member member = null;
		for(int i = 0; i < this.libraryMemberList.length; i++) {
			member = this.libraryMemberList[i];
			if(member == null) {
				break;
			}
			member.showMemberInfo();
			member.showBookList();
		}
	}
	
	//등록된 책 보기
	void showLibraryBookList() {
		Book book = null;
		for(int i = 0; i < this.libraryBookList.length; i++) {
			book = this.libraryBookList[i];
			
			if(book == null) {
				break;
			}
			book.showBookInfo();
		}
	}
	
	
	
	//대여해주기
	
	boolean bookRental(int bookNumber, Member member) {
		Book book = this.libraryBookList[bookNumber];
		if(book.bookStatus) {
			for(int i = 0; i < member.memberBookList.length; i++) {
				book.bookStatus = false;
				member.memberBookList[i] = book;
				return true;
			}
		}
		
		return false;
	}
	
	
	
	//반납하기
	void bookReturn( int bookNumber, Member member ) {
		Book book = this.libraryBookList[bookNumber];
		
		book.bookStatus = false;
		
		for(int i = 0; i < member.memberBookList.length; i++) {
			if(member.memberBookList[i] != null && member.memberBookList[i].bookNumber == bookNumber) {
				member.memberBookList[i] = null;
				return;
			}
		}
	}
	
	
	
	
	
	
	
	

	
}
