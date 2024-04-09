package interMethod;

public class MyClass implements MyInterface{
	//인터페이스를 구현받으면 오버라이딩 해줘야한다
	@Override
	public void abstractMethod() {
		System.out.println("추상 메소드 호출");
		
	}
	
	
}
