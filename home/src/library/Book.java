package library;

public class Book {
	//필드
	int bookNumber;
	String bookName;
	boolean bookStatus;
	
	//매개변수 1개 있는 생성자
	public Book(String bookName) {
		super();
		this.bookName = bookName;
		this.bookNumber = 0;
		this.bookStatus = true;
	}
	
	//메소드
	//책 정보보기 메소드
	void showBookInfo() {
		System.out.println(this.bookNumber + "." + this.bookName);
		if(bookStatus) {
			System.out.println("대여가능");
		} else {
			System.out.println("대여불가능");
		}
	}
	
	
}
