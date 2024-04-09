package ThingTask;

public class Book extends Things{

	//필드
	String author;
	
	//생성자
	public Book(String name, String author) {
		super(name);
		this.author = author;
	}

	
	//메소드 오버라이딩 : alt + shift + s + v
	@Override
	void printInfo() {
		System.out.println("책 이름: " + this.name);
		System.out.println("저자 이름: " + this.author);
	}
	
}
