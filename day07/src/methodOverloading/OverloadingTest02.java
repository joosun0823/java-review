package methodOverloading;

public class OverloadingTest02 {
	//정수 1개 출력하는 메소드(printNum())
	void printNum(int num) {
		System.out.println(num);
	}
	//실수 1개 출력하는 메소드(printNum())
	void printNum(double num) {
		System.out.println(num);
	}
	//문자열 1개 출력하는 메소드(printNum())
	void printNum(String num) {
		System.out.println(num);
	}
	//문자열 배열을 출력하는 메소드(printNum())
	void printNum(String[] num) {
		System.out.println(num);
		for(String text : num) {
			System.out.println(text);
		}
	}
	
	public static void main(String[] args) {
		OverloadingTest02 ot = new OverloadingTest02();
//		System.out.println(ot);
		
		//정수 출력 메소드
		ot.printNum(10);
		
		//실수 출력 메소드
		ot.printNum(15.5);
		
		//문자열 출력 메소드
		ot.printNum("문자열");
		
		//문자열 배열 출력 메소드
		String[] str1 = {"java","dbms", "jabc"};
//		System.out.println(str1);
//      System.out.println(str1[0]);
//      System.out.println(str1[1]);
//      System.out.println(str1[2]);
		
		
		ot.printNum(str1);
	}
}
