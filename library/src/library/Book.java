package library;

public class Book {
//필드
//책이름, 책 번호, 책 대여 상태
	int bookNumber;
	String bookName;
	boolean bookStatus;

	//매개변수 1개 받는 생성자
	
	public Book(String bookName) {
		super();
		this.bookName = bookName;
		this.bookNumber = 0;
		this.bookStatus = true;
	}
	
	
	//책 정보 보여주는 메소드
	void showBookInfo() {
		System.out.println(this.bookNumber+1 + "." +  this.bookName);
		if(bookStatus) {
			System.out.println("대여가능");
		} else {
			System.out.println("대여불가능");
		}
	}
}
