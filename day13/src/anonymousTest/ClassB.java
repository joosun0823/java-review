package anonymousTest;

public class ClassB implements InterA{
	//InterA인터페이스를 구현
	@Override
	public void printData() {
		System.out.println("ClassB에서 구현한 메소드 오버라이딩");	
	}

}
