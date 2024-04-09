package staticTest;

public class StaticTest02 {
	public static void main(String[] args) {
		//다른 클래스에서 instance 멤버를 사용하는 경우
		AClass a = new AClass();
//		System.out.println(a.iVar);
		a.iVar = 5; //a객체의 인스턴스변수 값 5대입
//		a.iMethod1();
		
		//다른 클래스에서 static 멤버를 사용하는 경우 객체를 이용하는 것은 권장하지 않는다
		a.sVar = 15; //a객체의 스태틱변수 값 15대입
		System.out.println(a.sVar);
		a.sMethod1(); //a객체의 스태틱변수1 실행

		//클래스 명을 이용하여 static 멤버에 접근하는 것을 권장한다
		AClass.sMethod1(); //A클래스에 있는 스태틱메소드1 호출
		AClass.sVar = 250; //A클래스에 있는 스태틱 변수에 250 대입
		System.out.println(AClass.sVar);
	}
}
