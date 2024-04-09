package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기
		
		//정수1 : 10
		//정수2 : 20
		//10보다 20이 더 큽니다
		
		//변수 세개 선언(int 2개, String 1개)
 		//입력클래스,import
		//입력 메시지1
		//변수1 입력 메소드
		//입력 메시지2
		//변수2 입력 메소드
		//변수3 삼항 연산자
		//변수3 출력
		
		int num1 = 0, num2 =0;
		String result = "", msg = "변수 입력: ";
		//정수형 변수 num1,num2 기본값 0대입
		//문자열 변수 result에 기본값,msg에 "변수입력: " 대입
		Scanner sc = new Scanner(System.in);
		//입력클래스
		System.out.println(msg);
		//msg출력
		num1 = sc.nextInt();
		//num1에 입력한 정수값 대입
		System.out.println(msg);
		num2 = sc.nextInt();
		//num2에 입력한 두번째 정수값 대입
//		result = num1 > num2 ? "큰 수: " + num1 : "큰 수: " + num2;
		result = num1 > num2 ? "큰 수: " + num1 : num1 == num2 ?
				"같습니다" : "큰 수: " + num2 ;
		//삼항 연산자		
		//변수 result num1이 num2보다 크다고 조건을 설정 후
		//참일 경우 "큰수:" + num1 값 대입
		//거짓일 경우 조건 다시한번 설정
		//num1과 num2가 같다 조건설정 
		//참일 경우 "같습니다" 대입
		//거짓일 경우 "큰수:" + num2 값 대입
		
		System.out.println(result);
	}
}
