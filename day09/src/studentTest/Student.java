package studentTest;

public class Student {
	//학생 클래스
	
	//필드 => 힙메모리에 생성(객체 생성될 때)
	//이름, 전공, 나이, 학년, 학점
	String name;
	String major;
	int age;
	int grade;
	char score;
	
	
	//생성자
	//기본생성자
	public Student() { //객체 생성 시 인수를 넣지 않을 때 호출
	
	}
	//이름, 전공, 나이 입력받는 생성자

	//생성자 오버로딩
	public Student(String name, String major, int age) {
		// 문자열, 문자열, 정수형의 인수가 전달될 때 호출
		this(); //생성자 자기 자신
		this.name = name; //해당 객체의 name이라는 필드에 매개변수로 전달된 값을 대입
		this.major = major;
		this.age = age;
	}
	
	//이름, 전공, 나이, 학년을 입력받는 생성자
	//생성자 오버로딩
	public Student(String name, String major, int age, int grade) {
		// 문자열, 문자열, 정수형, 정수형의 인수가 전달될 때 호출
		this(name, major, age); //name, major, age 매개변수를 가진 자기 자신의 생성자 호출
		this.grade = grade; //해당 객체의 grade라는 필드에 매개변수로 전달된 값을 대입
	}
	
	
	
	
	//메소드
	//학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
	void printStudent() {
		System.out.println("이름은 " + this.name + ", 학년은 " + 
				this.grade + ", 전공은 " + this.major + "입니다");
	}
	
	
	//학생의 전공 과목의 성적을 2개 입력받아 전공 과목의 평균을 구하는 메소드
	//avgScore
	
	double avgScore(int score1, int score2) {
		double avg = (score1 + score2)/2;
		return avg;
	}
	
	//학생의 평균이 90점이상이면 A, 70점 이상이면 B, 
	//60점 이상이면 C, 그외 F 학점 반환하는 메소드
	//gradeScore
	
	char gradeScore(double score) {
		if(score >= 90) {
			this.score = 'A';
		} else if( score >= 70) {
			this.score = 'B';
		} else if( score >= 60) {
			this.score = 'C';
		} else {
			this.score = 'F';
		}
		
		return this.score;

	}
	
	
}
