package student;

import java.util.Scanner;

public class StudentMain {
	//컬렉션 프레임워크 이용(점수 저장)
			//1. 사용자로부터 학생 수와 학생 점수 입력받기 
			//입력클래스 
			//한번은 학생수 입력메소드
			// 학생수만큼 반복문안에 입력메소드호출
			// arrayList에 add
			//2. 입력받은 점수를 이용해서 평균점수 계산하기
			//평균점수 구하기 위해 총합 구해야함
			//총합 변수 선언
			//반복문으로 총합 구하기
			//평균은 실수형 타입
			//3. 입력받은 점수 중 최고점수 계산하기
			//최고점수 Collections max
			//4. 계산된 평균점수와 최고점수 출력하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학생 수를 입력하세요 : ");
		int count = sc.nextInt();
		student.studentScore(count);
		System.out.println("평균 점수 :" + student.avg());
		student.topScore();

	}
}
