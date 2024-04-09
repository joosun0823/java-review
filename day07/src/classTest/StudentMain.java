package classTest;

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		//학생1 객체생성
		System.out.println(st1);
		Student st2 = new Student();
		//학생2 객체생성
		System.out.println(st2);
		
		st1.name = "김주선"; //학생1이름
		st1.math = 90;//학생1 수학점수
		st1.eng = 0;//학생1 영어점수
		st1.kor = 100;//학생1 국어점수
		
		System.out.println(st1.name);
		System.out.println(st1.math);		
		
		System.out.println(st2.name);
		System.out.println(st2.math);		
		
		//st1의 총합 구하기
		System.out.println(st1.getTotal());
		
		//st1의 평균 구하기 메소드 호출
		System.out.println(st1.getAvg());
	}
}
