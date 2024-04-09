package constructorTest;

class B {
	//필드
	int num;
	//메소드
	void printNum(int num) {
		System.out.println("매개변수 num : " + num);
		System.out.println("필드 num : " + this.num);
		System.out.println("참조값 : " + this);
	}
	
	//생성자
	public B(int num) {
		this.num = num;
	}
	
	//기본생성자
	public B() {
		
	}
	
	
}

public class ClassTest2 {
	public static void main(String[] args) {
		//객체화 작업
		B b1 = new B();
		System.out.println(b1);
		//printNum 메소드 매개변수에 10 대입
		b1.printNum(10);
		System.out.println(b1.num);
		
		//객체 생성
		B b2 = new B();
		//필드에 있는 변수 num에 100 대입
		b2.num = 100;
		//printNum 메소드 매개변수에 5대입
		b2.printNum(5);
		System.out.println(b2);
		
		//매개변수 한개 있는 객체 생성, 매개변수에 7대입
		B b3 = new B(7);
		System.out.println(b3.num);
		
	}
}
