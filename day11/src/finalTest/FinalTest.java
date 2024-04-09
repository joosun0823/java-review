package finalTest;

public class FinalTest {
	//클래스 내부에서 상수를 선언하는 방법
	static final double PI = 3.14;
	
	public static void main(String[] args) {		
		int maxLength = 10; //변수
		System.out.println(maxLength);
		maxLength = 30; //변수의 값 변경 가능
		System.out.println(maxLength);
		
		//메소드 내부에서 상수를 선언하는 방법(상수는 변하지 않는 항상 동일한 값)
		final int MAX_LENGTH = 100;
		System.out.println(MAX_LENGTH);
//		MAX_LENGTH = 300; 오류발생
		
		System.out.println(PI);
		
	}
}
