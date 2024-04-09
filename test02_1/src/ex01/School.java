package ex01;

public class School {
//김주선
	
	//필드
	Student[] students;
	int studentCount;
	
	//생성자 , 초기값 설정
	public School() {
		super();
		this.students = new Student[30]; //최대 30명
		this.studentCount = 0; 
	}
	
	//메소드
	//학생등록 메소드
	//현재 학생수 30명 이상일시  등록할 수 없음 false
	//현재 학생수를 인덱스로 생각 후
	//students 배열에 인덱스를 학생수로 넣는다
	// 객체에 대입
	// 현재학생수 + 1 후 studentNumber에 대입
	boolean registerStudent(Student student) {
		if(this.studentCount > 29) {
			return false;
		}
		this.students[studentCount] = student;
		this.studentCount++;
		student.studentNumber = this.studentCount;
		return true;
	}
	
	
	//학생 목록보기
	//어떤 배열올지 모르니 초기값 null 설정
	//객체값에 학생 배열 i번째 대입
	//조건문 객체값이 빈값일 때 for문 탈출
	//student클래스 이용해서 오버라이딩한 tostring 출력
	void showStudentList() {
		System.out.println("===학생 목록===");
		Student student = null;
		
		for(int i = 0; i < this.students.length; i ++) {
			student = students[i];
			
			if(student == null) {
				break;
			}
			
			System.out.println(student.toString());
 		}
	}
	
	
	//성적 평균 보기
	//어떤 배열 올지 모르니 초기값 null
	//객체값 학생배열 i번째대입
	//조건문 객체값 빈값일 때 for 문 탈출
	//student클래스 이용하여 평균 메소드 호출
	void showScoreAvg() {
		System.out.println("===성적 목록===");
		Student student = null;
		
		for(int i=0; i< this.students.length; i++) {
			student = students[i];
			
			if(student == null) {
				break;
			}
			
			System.out.println( student.studentName + "의 평균 : " + student.scoreAvg());
		}
	}

	
}
