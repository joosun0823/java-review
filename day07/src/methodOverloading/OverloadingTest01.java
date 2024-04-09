package methodOverloading;

public class OverloadingTest01 {
	//메소드 오버로딩 : 매개변수의 타입, 개수, 순서가 다르면 
	//같은 이름의 메소드로 선언할 수 있다
	
	//두 개를 더해서 출력하는 메소드
	void printNum(int num1, int num2) {
		System.out.println( num1 + num2 );
	}
	
	//실수형 매개변수 2개, 정수형 변수 1개 모두 더하는 메소드
	void printNum(double num1, double num2, int num3) {
		System.out.println( num1 + num2 + num3 );
	}
	
	
	public static void main(String[] args) {
		OverloadingTest01 ot = new OverloadingTest01();
		//클래스명으로 객체를 만들어줌
	}
}
