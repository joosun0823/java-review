package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// 김주선
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 클래스
		int result = 0;
		// 나눈 결과 result
		System.out.println("나누어질 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("나눌 숫자를 입력하세요: ");
		int num2 = sc.nextInt();

		// if 조건문 num2가 0보다 작거나 같을 시
		// MyException으로 예외처리 매개변수 있어서 메시지 출력
		// else에 num2가 숫자가 아닐시 발생하는 InputMismatchException
		// 예외처리 할라했는데 안되네요;;

		if (num2 <= 0) {
			try {
				throw new MyException("0 또는 음수는 나눌 수 없습니다.");
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		} else {
			try {
				result = num1 / num2;
				System.out.println("나눈 결과 : " + result);
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			
		}
		

		

	}
}
