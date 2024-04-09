package interTest;

public class Main {
	public static void main(String[] args) {
//		Inter inter = new Inter(); 인터페이스는 객체화 작업이 되지 않음
		ClassA ca = new ClassA();
		//인터페이스에 있는 메소드를 쓰기 위해서는 인터페이스를 구현한 클래스
		//를 객체화해서 호출해야함
		ca.method1();
		ca.method2();
//		ca.VAR1 = 100; 상수이기 때문에 대입연산 불가
		System.out.println(ca.VAR1);
		System.out.println(ca.VAR2);
		
		//인터페이스는 객체화가 안되지만 구현받은 클래스를 업캐스팅하여 
		//인터페이스의 멤버를 사용할 수 있음
		Inter inter = new ClassA(); //업캐스팅
		inter.method1(); //업캐스팅된 객체의 메소드 호출시 오버라이딩 된 결과로 출력된다
		inter.method2();
		
	}
}
