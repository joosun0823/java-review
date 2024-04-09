package interTest;

public class ClassA implements Inter{
//Inter 인터페이스를 구현한 클래스 ClassA
	//오버라이딩 해줘야 오류 생기지 않음
	@Override
	public void method1() {
		System.out.println("method1 오버라이딩");
	}

	@Override
	public void method2() {
		System.out.println("method2 오버라이딩");	
	}
	
}
