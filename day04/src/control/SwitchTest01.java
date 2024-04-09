package control;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력클래스
		int choice = 0;
		//정수형 choice 기본값 
		String result = "";
		//문자열 변수 result 기본값 null
		System.out.println("1부터 4까지 정수 입력 : ");
		choice = sc.nextInt();
		//choice 변수에 입력한 정수값 대입
		System.out.println(choice);

		switch (choice) {
		case 1: case 3:
			//변수 choice의 값이 1또는 3일 때
			//result에 "홀수" 값 대입
			result = "홀수";
			break;
		case 2: case 4:
			//변수 choice의 값이 2또는 4일 때
			//result에 "짝수" 값 대입
			result = "짝수";
			break;
//		case 3:
//			result = "홀수";
//			break;
//		case 4:
//			result = "짝수";
//			break;
		default:
			//choice의 값이 1,2,3,4 이외의 값일 때
			//result에 "잘못입력했습니다" 대입
			result = "잘못입력했습니다";
			break;
		}

		System.out.println(result);
	}
}
