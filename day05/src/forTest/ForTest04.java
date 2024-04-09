package forTest;

import java.util.Scanner;

public class ForTest04 {
	public static void main(String[] args) {
		//구구단 3단
		// ..
		//3X9 = 27
		
		
		//사용자가 입력한 숫자의 단이 출력되도록 하기
		//입력클래스 import
		//dan 변수 nextInt()
		
		int dan = 3;
		//정수형 변수 dan 값 3대입
		Scanner sc = new Scanner(System.in);
		//입력클래스
		System.out.println("출력하고 싶은 구구단 입력: ");
		dan = sc.nextInt();
		//dan에 입력한 정수형값 대입
		for(int i = 1; i<10; i++) {
			System.out.printf("%d X %d = %d \n", dan, i, dan*i);
//			System.out.println();
		}
		
	}
}
