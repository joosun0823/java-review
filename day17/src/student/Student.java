package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	//필드 
	int studentCount; //학생 수
	ArrayList<Integer> score; //점수
	int total; //점수 총합
	
	//생성자
	public Student() {
		super();
		this.score = new ArrayList<>();
	}
	
	//메소드
	//학생 점수 입력 메소드
	void studentScore(int count) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < count; i++) {
			System.out.println("학생 점수를 입력하세요: ");
			int inputScore = sc.nextInt();
			this.score.add(inputScore);
			this.total += inputScore;
		}
		sc.close();
	}
	
	
	//학생 평균 메소드
	double avg() {
		return (double) total / score.size();
	}
	
	//학생 최고점수 메소드
	void topScore() {
		System.out.println("최고 점수 : " + Collections.max(this.score));
	}
	
}
