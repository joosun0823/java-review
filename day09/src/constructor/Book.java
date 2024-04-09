package constructor;

public class Book {
	//필드 : 책제목, 책저자, 가격, 출판년도
	String title; //문자열 책제목
	String author; //문자열 저자
	int price; //정수형 가격
	int year; //정수형 출판년도
	//=============Heap 메모리 저장
	
	//생성자 : alt + shift + s + o
	public Book() {
		//기본생성자
	}

	//생성자 오버로딩
	//매개변수 4개받는 생성자
	public Book(String title, String author, int price, int year) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	
	
	//메소드
	//책 이름과 저자를 출력하는 메소드
	void printBook() {
		System.out.println("책 이름은 " + this.title + 
				"이고, 책 저자 이름은" + this.author + "입니다");
		
	}
	
}
