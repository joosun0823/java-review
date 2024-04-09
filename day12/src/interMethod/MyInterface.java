package interMethod;

public interface MyInterface {
	//jdk 8버전부터  인터페이스에서 default 메소드와 static메소드 사용가능
	
	//상수, 추상메소드
	void abstractMethod();
	
	//default 메소드
	default void defaultMethod() {
		System.out.println("디폴트 메소드 호출");
	}
	
	//static 메소드
	static void staticMethod() {
		System.out.println("스태틱 메소드 호출");
	}
}
