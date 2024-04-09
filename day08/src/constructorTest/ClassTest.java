package constructorTest;

class A {
	//메소드 매개변수X, 리턴값X
	void method() {
		System.out.println(this);
	}
}


public class ClassTest {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		System.out.println(a);
		//method 메소드 실행
		a.method();
		
		//객체 생성
		A a1 = new A();
		System.out.println(a1);
		//method 메소드 실행
		a1.method();
	}
}
