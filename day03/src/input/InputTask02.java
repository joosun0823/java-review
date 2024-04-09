package input;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
		//두 정수를 입력받고 합을 출력하기
		//next()메소드만 사용
		//ex)
		//정수1 입력: 10
		//정수2 입력: 20
		//두 정수의 합은 30입니다
		
		//자료형의 기본값
		//int : 0
		//double : 0.0
		//char: ''
		//String: "", null
		//boolean: false
		
		//로직구성
		//1) 변수 2개를 선언(String 2게, int 1개)
		//2) 입력클래스 import 
		//3) 메세지를 출력 (정수1 입력: ) print()
		//4) 입력메소드를 사용해서 정수1 변수에 저장 next()
		//5) 메세지를 출력 (정수2 입력: )
		//6) 입력메소드를 사용해서 정수2 변수에 저장 next()
		//7) int 변수 형변환한 정수1 + 정수2
		
		String num1 = "", num2 = "";
		//String 자료형 변수 num1, num2 선언 모두 기본값
		int result = 0;
		//int 자료형 변수 result 기본값 0
		Scanner sc = new Scanner(System.in);
		//입력클래스
//		System.out.println();
		num1 = sc.next();
		//num1에 입력메소드 값 대입
//		System.out.println();
		num2 = sc.next();
		//num2에 입력메소드 값 대입
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
		//result 변수에 num1 int로 강제 형변환 num2 int로 강제형변환 후 더한 값 대입
		System.out.printf("두 정수의 합은 %d입니다\n",result);
	}
}
