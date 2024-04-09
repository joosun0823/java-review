package task03;

import java.util.Scanner;

public class Task03 {
	//입력클래스
	Scanner sc = new Scanner(System.in);
	
	//trycatch로 예외처리
	void integerParse() { 
		 try {
			 System.out.println("문자열 입력 : ");
			 String str = sc.next(); 
			 int num = Integer.parseInt(str);	 
			 System.out.println(num);
		 } catch(NumberFormatException e) {
			 System.out.println("입력한 문자열이 숫자가 아닙니다");
		 }
	}
	
	
	public static void main(String[] args) {
		Task03 t3 = new Task03();
		
		t3.integerParse();
	}
}
