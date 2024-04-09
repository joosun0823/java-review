package task04;

import java.util.Scanner;

public class Task04 {
	//입력클래스
	Scanner sc = new Scanner(System.in);
	
	//trycatch문으로 예외처리해주기
	void fizzBuzz() {
		System.out.println("숫자를 입력하세요 : ");
		try {
			int num = sc.nextInt();
			
			if(  num % 5 ==0 && num % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if ( num % 5 == 0) {
				System.out.println("Buzz");
			} else if ( num % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(num);
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
		}
		
		
	}

	public static void main(String[] args) {
		Task04 t4 = new Task04();
		
		t4.fizzBuzz();
	}
	
}
