package whileTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
//		boolean isTrue = false;
//
//		while (isTrue) {
//			System.out.println("출력");
//		}
//
//		do {
//			System.out.println("김주선");
//		} while (isTrue);

		// 사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
		// 입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는
		// 메시지를 출력하고 다시 입력받기
		// 입력된 숫자가 양수일 경우에만 양수입니다 출력

		// 입력클래스
		// 정수형 변수 선언
		// 계속 입력 do while문안에 입력메소드

		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;

		do {
			System.out.println("숫자 입력: ");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("양수입니다");
			} else {
				System.out.println("양수가 아닙니다. 다시 입력해주세요");
			}
		} while (num > 0);

	}
}
