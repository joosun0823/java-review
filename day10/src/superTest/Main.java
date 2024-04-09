package superTest;

public class Main {
	public static void main(String[] args) {
		Parents p1 = new Parents(100);
		//부모 클래스 매개변수 1개받는 생성자 100대입
		System.out.println(p1);
		System.out.println(p1.pVal);
		
		System.out.println("===========");
		Child c1 = new Child(200, 22);
		//자식클래스 매개변수 2개받는 생성자
		System.out.println(c1);
		System.out.println(c1.pVal);
		System.out.println(c1.chVal);
		c1.chMethod1();
		
	}
}
