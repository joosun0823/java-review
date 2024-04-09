package task05;

public class Student {
	String stuName; //학생이름
	Integer score; //학생점수
	
	//생성자
	//학생이름과 학생점수를 매개변수로 받는 생성자
	public Student(String stuName, int score) {
		super();
		this.stuName = stuName;
		this.score = score;
	}
	
	//메소드
	//학생 이름과 점수 정보
	void showStudentInfo() {
		System.out.println("이름: " + this.stuName + ", 점수: " + this.score);
	}
}
