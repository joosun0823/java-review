package input;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
		//이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기
		//이름 : 000
		//나이 : 0
		//000님의 나이는 0살입니다
		
		//이름과 나이 String 변수지정
		//입력메소드 import
		//이름 : 000 메세지 출력
		//next() 이름 입력
		//나이 입력 메시지 출력
		//next() 나이 입력
		//출력
		
		String name = "", age = "";
		//String 자료형 name 과 age 선언 모두 기본값
		Scanner sc = new Scanner(System.in);
		//입력클래스
		System.out.print("이름 : ");
		name = sc.next();
		//name에 입력메소드 값 대입
		System.out.print("나이 : ");
		age = sc.next();
		//age에 두번째 입력메소드값 대입
		System.out.println(name + "님의 나이는 " + age + "살입니다");
		//결과 출력
		System.out.println("내년의 나이는 " + (Integer.parseInt(age)+1) + "살입니다");

	}
}
