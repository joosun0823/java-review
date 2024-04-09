package castingTest3;

public class Animal {
	//필드
	int age; //나이
	String name; //이름
	
	//메소드 
	//반드시 자식클래스에서 재정의 해야한다
	void crying() {
		System.out.println("울어 울어");
	}
	
	//생성자	
	//매개변수 1개받는 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
}
