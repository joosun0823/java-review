package day03;

public class Review {
	public static void main(String[] args) {
		char ch1 = ' ';
		//char 타입은 '' 빈 문자값을 넣을 수 없다(오류발생)
		System.out.println(ch1);
		System.out.println("========");
		String st1 = "";
		//String 타입은 ""빈 문자열 값을 넣을 수 있다
		System.out.println(st1);
		System.out.println("========");
		//""안에 숫자가 들어가있어도 ""로 묶여있으면 문자열이다
		System.out.println("123123123" + 1 );
		System.out.println(123123123 + 1 );
		
	}
}
