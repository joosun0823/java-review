package control;

import java.util.Scanner;

public class IfTest03 {
	public static void main(String[] args) {
		// if~else if~else문
		// 학생의 java성적을 입력받아서 학점(A+,A,B,C) 계산하기
		// A+ : 100
		// A : 90~99
		// B : 70~89
		// C : 그외

		// 입력클래스 import
		// 출력메시지(입력받을)
		// 변수 = 입력메소드
		// 조건문(if~else if~else)

		Scanner sc = new Scanner(System.in);
		//입력클래스
		System.out.println("학생의 java 점수 입력 : ");
		//java 점수 입력 출력
		int score = sc.nextInt();
		//정수형 변수 score 선언후 입력하는 정수값 대입
		if (score == 100) {
			//변수 score가 100일 경우 A+ 출력
			System.out.println("A+");
		} else if (score <= 99 && score >= 90) {
			//변수 score가 90이상 99이하 일경우 A출력
			// java에서는 비교연산자를 연속해서 범위를 지정할 수 없다
			// 논리연산자를 사용하여 두개의 비교연산을 결해야한다
			System.out.println("A");
		} else if (score <= 89 && score > 69) {
			//변수 score가 70이상 90미만 일경우 B출력
			System.out.println("B");
		} else if (100 < score || score < 0) {
			//변수가 100을 초과하거나 0미만일경우 잘못된 값 출력
			System.out.println("잘못된 값입니다");
		} else {
			//위 조건들 모두 거짓일 때 C출력
			System.out.println("C");
		}

		System.out.println("출력끝");
	}
}
