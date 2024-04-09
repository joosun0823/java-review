package task05;

public class StudentMain {
	// 학생들 객체를 배열에 넣기
	Student[] students = new Student[5];
	int num = 0;
	
	//객체를 매개변수로 받아 학생 배열에 넣는 메소드
	boolean inputStudent(Student student) {
		
		this.students[num] = student;
		num++;
		
		return true;
	}
	
	//학생리스트 불러오는 리스트
	void showStudentList() {
		Student student = null;
		
		for(int i = 0; i < students.length; i++) {
			student = students[i];
			if(student == null) {
				break;
			}
			
			student.showStudentInfo();
		}
	}
	
	
	//가장 높은 점수인 학생불러오기 메소드
	void topScore() {
		int score = 0;
		for(Student student : students) {
			if(student.score > score) {
				score = student.score;
				System.out.println("이름: " + student.stuName + ", 점수" + score);
			}
		}
	}
	
	
	// 여기서 객체에서 점수 바꿔주면 높은 점수를 가진 사람이 쌓이는 문제 발생...;;
	// 이유를 모르겠습니다..
	
	
	//학생들 점수 평균 메소드
	void avgScore() {
		int total = 0;
		for(Student student : students) {
			total += student.score;
		}
		
		double avg = total/students.length;
		System.out.println("평균: " + avg);
		
	}
	
	public static void main(String[] args) {
		StudentMain sm = new StudentMain();
		Student stu1 = new Student("김주선" , 90);
		Student stu2 = new Student("김주성", 100);
		Student stu3 = new Student("김주섬", 80);
		Student stu4 = new Student("김주설", 70);
		Student stu5 = new Student("김주션", 60);
		
		sm.inputStudent(stu1);
		sm.inputStudent(stu2);
		sm.inputStudent(stu3);
		sm.inputStudent(stu4);
		sm.inputStudent(stu5);
		
		sm.showStudentList();
		System.out.println("========");
		sm.topScore();
		sm.avgScore();
		
	}
}
