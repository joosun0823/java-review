package student;

import java.util.ArrayList;
import java.util.List;

public class School {
	//School 클래스
	//필드 학생리스트
	//메소드 학생들 리스트 조회
	//학생들 성적 평균 조회

	
	//필드
	private List<Student> school;
	private int studentId;
	
	//생성자
	public School() {
		this.school = new ArrayList<>();
		this.studentId = 1;
	}
	
	
	//메소드
	//학생 등록 메소드
	void register(String studentName, int[] grade) {
		Student student = new Student( this.studentId++, studentName, grade);
		school.add(student);
		
		System.out.println(school);
	}
	


	//학생 점수 평균 조회
	void showStudentAvg() {
		for(int i = 0; i < school.size(); i++) {
			int[] score = school.get(i).getGrade();
			int total = 0;
			double avg = 0;
			for(int s : score) {
				total += s;
				avg = (double) total / 3;
			}
//			double avg = (double) score[0] + score[1] + score[2]/3;
			
			System.out.println(school.get(i).getStudentName() + "의 평균 점수 :" + avg);
		}
	}
	
}
