package whileTest;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		//안녕하세요 ---님 환영합니다 10번 출력
		
		//1)카운트 변수 선언 1 or 0
		//2)while (카운트 변수 < 11)
		//3) 출력문(---님 환영합니다)
		//4) ++ 증감연산자
		//
		
		//입력클래스
		//이름 변수 선언
		//카운트 변수 선언
		//"이름입력" 출력
		// while문안에 입력메소드가 있으면 반복해서
		// 입력할 수 있다
		// 입력받을 메시지
		// 이름 입력 메소드
		// 출력 메시지
		// 증감연산자
		
		Scanner sc = new Scanner(System.in);
		String name = ""; int num = 0;
		System.out.println("이름입력: ");
		
		while (num < 10) {
			name = sc.next();
			System.out.println("안녕하세요 " + name +"님 환영합니다");
			num++;
		}


	}
}
