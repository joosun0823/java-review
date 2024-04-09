package ThingTask;

public class Things {
	//필드 이름
	String name;
	//생성자 매개변수1

	public Things(String name) {
		super();
		this.name = name;
	}
	
	//메소드 printInfo: 이름을 출력
	
	void printInfo() {
		System.out.println("이름: " + this.name);
	}
	
	//Things 클래스를 상속받는 Book클래스
	//필드 저자(String author)
	//생성자 매개변수2
	//메소드 오버라이딩
	//	책이름 : 
	// 	저자 :
	
	//Main 클래스
	//main 메소드
	//부모클래스 객체 thing
	//자식클래스 객체 book
	//각 객체마다 메소드 호출
}
