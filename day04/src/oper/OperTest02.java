package oper;

public class OperTest02 {
	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? 참일 때 값 : 거짓일 때 값
		int num1 = 10, num2 = 20, num3 = 20;
		String num4 = num1 >= 9 ? num1+ "이 9보다 큽니다" : num1+"이 9보다 크지 않습니다";
		//정수형 변수 num1에 10, num2에 20, num3에 20 대입
		//문자열 변수 num4에 삼항 연산자 대입
		//조건 num1이 9보다 크다 참이면 "9보다 큽니다"출력
		//거짓이면 "9보다 크지않습니다"출력
		System.out.println( true ? 10 : 20);
		System.out.println( false ? 10 : 20);
		
		System.out.println( num1 == num2 ? "같다" : "다르다");
		System.out.println( num1 != num2 ? "같다" : "다르다");
		
		System.out.println(num4);
	}
}
