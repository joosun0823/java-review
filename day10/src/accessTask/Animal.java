package accessTask;

public class Animal {
	//필드
	protected String name; 
	//프로텍티드 변수 이름
	//같은 패키지 사용가능
	//생성자
	public Animal() {
		super();
	}
	//메소드
	void eat() {
		System.out.println(this.name + "이/가 먹이를 먹습니다");
	}
	
	
	
}
