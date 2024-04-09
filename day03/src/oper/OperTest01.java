package oper;

import java.util.Scanner;

public class OperTest01 {
	public static void main(String[] args) {
		//두자리수 정수를 입력받고 십의 자리와 일의 자리를 각각 출력하기
		//1) 입력클래스 import
		//2) 정수형 변수 3개 선언
		//3) 출력 메시지(두자리수 정수 입력 : )
		//4) 입력 받아서 변수에 저장 (nextInt())
		//5) 십의자리 / 10
		//6) 일의 자리 % 10
		//7) 출력
		
		Scanner sc = new Scanner(System.in);
		//입력클래스
		int inputNum = 0, result1 = 0, result2 = 0;
		//정수형 변수 inputNum, result1, result2 모두 기본값 0 대입
		System.out.println("두자리 정수를 입력하세요 : ");
		inputNum = sc.nextInt();
		//inputNum에 입력한 정수값 대입
		
		result1 = inputNum / 10;
		//result1에 inputNum을 10으로 나눈 값 대입
		result2 = inputNum % 10;
		//result2에 inputNum을 10으로 나누고 나머지 값 대입
		System.out.println("십의 자리 : " + result1);
		System.out.println("일의 자리 : " + result2);
	}
}
