package staticTest;

class B{
	//필드
	int iVar; //인스턴스변수 
	static int sVar; //스태틱변수
}

public class StaticTest03 {
	public static void main(String[] args) {
		B b1 = new B();
		//b1 객체 생성
		B b2 = new B();
		//b2 객체 생성
		b1.iVar = 10;
		b2.iVar = 20;
		//b1 인스턴스변수 10대입
		//b2 인스턴스변수 20대입
		System.out.println(b1.iVar);
		System.out.println(b2.iVar);
		
		b1.sVar = 30;
		b2.sVar = 40;
		//b1 스태틱변수 30대입
		//b2 스태틱변수 40대입
		//사용가능하지만 클래스로 접근하는 것을 권장
		System.out.println(b1.sVar);
		System.out.println(b2.sVar);
		
		//클래스 변수는 하나의 저장공간이다
		//즉, 하나의 클래스로 만든 모든 객체가 공유하는 저장공간이다
		//그러므로 클래스명으로 접근한다
		System.out.println(B.sVar);
		
	}
}
