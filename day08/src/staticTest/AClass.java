package staticTest;

public class AClass {
	//필드
	int iVar; //정수형 변수
	static int sVar; //정수형 스태틱 변수
	//메소드
	void iMethod1() {
		iVar = 10; //10값 대입
		sVar = 20; //20값 대입
		System.out.println(iVar);
		System.out.println(sVar);
		iMethod2(); //메소드2 실행
		sMethod1(); //스태틱 메소드 실행
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");		
	}
	
	//클래스메소드(스태틱메소드)는 static이 붙은 멤버만 사용 가능하다
	static void sMethod1() {
//		ivar = 100; 객체 없이 불가능
		sVar = 200; //스태틱변수에 200대입
		System.out.println(sVar);
//		iMethod1(); 불가능
		sMethod2(); //스태틱메소드2 실행
	}
	
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
	}
	//생성자(기본생성자)
}
