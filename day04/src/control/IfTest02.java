package control;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		int num = 0;
		//정수형 변수 num 기본값 대입
		Scanner sc = new Scanner(System.in);
		//입력클래스
		System.out.println("정수 입력: ");
		num = sc.nextInt();
		//변수 num에 입력한 정수값 대입
		// 조건식 (if~else)
		if (num % 2 == 0) {
			System.out.println(num + "은/는 짝수입니다");
			//조건식 변수 num을 2로 나눈 나머지가 0일 때 짝수이다 출력
		} else {
			System.out.println(num + "은/는 홀수입니다");
			//조건문이 거짓일 경우 홀수이다 출력
		}

		System.out.println("프로그램 종료");
	}
}
