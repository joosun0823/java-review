package method;

import java.util.Scanner;

public class MethodTask {
	void printName() {
		Scanner sc = new Scanner(System.in);
		//입력클래스
		String name = "";
		//문자열 변수 선언
		System.out.println("이름을 입력하세요");
		//이름입력 출력
		name = sc.next();
		//변수에 입력메소드
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "님 안녕하세요");
			//6번 반복 for문
		}
	}

	
	int getTotal(int num) {
		int total = 0;
		//총합 변수 선언
		for (int i = 0; i <= num; i++) {
			total += i;
			//총합 변수에 i를 계속 더해줌
		}

		return total;
		//리턴 총합변수
	}
	

	int getNumber() {

		Scanner sc = new Scanner(System.in);
		//입력클래스
		int num = 0; //입력메소드 넣을 변수 선언
		int total1 = 0; //총합변수 선언
		System.out.println("입력할 숫자 5개");
		//입력설명 출력
		for (int i = 0; i < 5; i++) {
			//for문 5번 반복
			num = sc.nextInt();
			//입력메소드
			total1 += num;
			//총합 변수에 입력받은 값 대입
		}

		return total1;
		//리턴 총합변수

	}

	public static void main(String[] args) {

		MethodTask mt = new MethodTask();
		//객체생성
		// 1. 이름을 넘겨받아 1. ~님 안녕하세요 5번 출력하는 메소드
		// 메소드명 : printName()
		mt.printName();
		//printName 메소드 호출
		// 2. 1~100까지의 합을 반환하는 메소드
		// 메소드명 : getTotal()

		System.out.println(mt.getTotal(100));

		// 3. 5개의 정수를 넘겨주면 합을 반환하는 메소드
		// 메소드명 : getNumber();

		System.out.println(mt.getNumber());
	}
}
