package lambdaTask;

public class Main {
	public static void main(String[] args) {
		//두 수의 곱을 구하는 프로그램
		//1. MultipleInter.java(인터페이스)에 두수를 매개변수로 받고
		// 정수값을 반환하는 추상메소드를 만든다
		
//		MultipleInter ml = (num1, num2) -> num1*num2 ;
		
		//2. Main.java(클래스)에 static메소드를 선언한다
		// - MultipleInter 타입을 반환한다
		// - 이름은 calculater
		// - 매개변수는 boolean 타입
		// 매개변수로 true가 들어오면 두수의 곱을 반환하는 람다식을 만들고
		// false가 들어오면 0을 반환하는 람다식을 만든다
		// 작성된 람다식을 multipleInter 타입의 변수에 저장하여 반환하는
		// 메소드를 만든다
		
//		MultipleInter result = calculater(true).mul(1,2);
//		결과값이 정수형 타입이므로
		int result = calculater(true).mul(30, 2);
		System.out.println(result);
	}
	
//	static MultipleInter calculater(boolean b) {
//		if( b ) {
//			return (num1, num2) -> num1*num2 ;
//		} else {
//			return (num1, num2) -> 0;
//		}
//	}
	
	static MultipleInter calculater(boolean a) {
	      MultipleInter multi = null;
	      if (a) {
	         multi= (num1, num2) -> num1 * num2;
	      } else {
	         multi = (num1, num2) -> 0;
	      }
	      return multi;	      
	   }
	
}
