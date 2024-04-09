package abstractTest;

public class AbstractTest {
	public static void main(String[] args) {
//		ClassA a = new ClassA(); //추상클래스는 객체생성 불가능
		ClassB b = new ClassB(); //가능 상속받은 일반 자식클래스는 가능
		ClassA a = new ClassB(); //업캐스팅으로 하면 가능
		
		System.out.println(a);
		System.out.println(b);
		
		a.method1(); 
		a.method2();
		b.method1();
		b.method2();
	}
}
