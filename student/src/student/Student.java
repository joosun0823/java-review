package student;

public class Student {
	//Student 클래스
	//필드 학생 이름, 학생 점수, 학생 고유 번호 접근제한자 private으로 해보셈
	
	
	//필드
	private int studentNum = 1;
	private String studentName;
	private int[] grade = new int[3];
	
	
	//생성자
	public Student(int studentNum, String studentName, int[] grade) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.studentNum = studentNum;
	}


	//메소드
	//getter
	public int getStudentNum() {
		return studentNum;
	}


	public String getStudentName() {
		return studentName;
	}


	public int[] getGrade() {
		return grade;
	}
	


	//toString 오버라이딩
	@Override
	public String toString() {
		return studentNum + ". " + studentName + "[국어점수 :" + grade[0] + ", 수학점수 : " + grade[1] + ", 영어점수: " + grade[2] + "]" ;
	}


	
	
	
	
}
