package typeCasting;

public class CastingTest01 {
	public static void main(String[] args) {
		//int, long, double, float, boolean, char
		//기본자료형, 원시자료형, Primitive Type
		
		//String, 클래스 ...
		//클래스 자료형, 참조 자료형, Reference Type
		
		//다른 자료형의 값을 문자열 자료형으로
		// + ""
		//기본자료형 : 10, 10L, 5.3, 5.3f, true, 'c'
		String str1 = 10 + ""; //문자열 변수 str1을 선언하고 10을 대입 ""을 붙여 형변환시켜줌
		String str2 = 5.3 + ""; //문자열 변수 str2을 선언하고 실수 5.3을 대입 ""을 붙여 형변환시켜줌
		String str3 = true + "";//문자열 변수 str3을 선언하고 boolean 타입인 true를 대입 ""을 붙여 형변환시켜줌
		String str4 = 'a'+ ""; //문자열 변수 str4를 선언하고 문자 'a' 를 대입 ""을 붙여 형변환시켜줌
		System.out.println(str1 + str2); //str1 + str2 의 값을 콘솔창에 출력
		
		//문자열을 다른 자료형으로 변환
		int number1 = Integer.parseInt(str1); 
		//정수형 변수 number1을 선언하고 문자열 변수인 str1을 정수형으로 형변환시켜준 후 값으로 대입
		double number2 = Double.parseDouble(str2);
		//실수형 변수 number2을 선언하고 문자열 변수인 str2를 실수형으로 형변환시켜준 후 값으로 대입
		boolean isTrue = Boolean.parseBoolean(str3);
		//논리형 변수 isTrue을 선언하고 문자열 변수인 str3을 논리형으로 형변환시켜준 후 값으로 대입
		System.out.println(number1 + number2);
		//정수형변수 number1과 실수형변수 number2를 합한 값을 콘솔창에 출력함
		char ch = str4.charAt(0);
		//문자형 변수 ch를 선언하고 str4의 0번째 문자를 가져와 값으로 대입
		System.out.println(ch);
		//ch의 값을 콘솔창에 출력
		char ch2 = "hello".charAt(0);
		//문자형 변수 ch2을 선언하고 "hello"의 0번째 문자를 가져와 값으로 대입
		//index: 문자열을 구성하는 모든 문자들에 부여된 고유번호
		//index의 시작번호는 0부터 시작한다
		System.out.println(ch2);
		//ch2의 값을 콘솔창에 출력
	}
}
