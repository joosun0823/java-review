package ex01;

import java.util.Arrays;

public class Student {
//김주선
	
	//필드
	int studentNumber;
	String studentName;
	int[] grades;
	
	//매개변수 2개 있는 생성자
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
		this.studentNumber= 0; //초기값 설정
	}
	
	//메소드
	//성적정보 보기 메소드
	
	void showGradeInfo() {
		System.out.println("===성적 정보===");
		System.out.println(this.studentNumber + "." + this.studentName + 
				", 국어 성적: " + this.grades[0] + ", 영어 성적 : " + this.grades[1] + ", 수학 성적 : " + this.grades[2]);	
	}
	
	//평균 성적 계산 메소드
	//점수 배열의 인데스 1,2,3 으로 평균값 구해주기
	double scoreAvg() {
		double result = (this.grades[0]+this.grades[1]+this.grades[2])/3;
		
		return result;
	}

	//Tostring 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[" + this.studentNumber + ". " + this.studentName + ", 점수 : " + Arrays.toString(grades) ;
	}
	
	
	
}
