package student;

public class Main {
	//school클래스에 학생 등록
	//학생 점수보기
	//학생 목록보기
	//학생 점수 평균 계산
	
	//컬렉션 프레임 워크로 ㄱㄱ
	
	//Student 클래스
	//필드 학생 이름, 학생 점수, 학생 고유 번호
	//학생 정보 보기 메소드
	//School 클래스
	//필드 학생리스트
	//메소드 학생들 리스트 조회
	//학생들의 성적 조회
	//학생들 성적 평균 조회

	public static void main(String[] args) {
		int[] grade1 = {80, 90, 90};
		int[] grade2 = {100, 100, 100};
		int[] grade3 = {100, 100, 100};
//		Student s1 = new Student("김주선", grade1);
//		
//		s1.showStudentInfo();
		
		School sc = new School();
		
		sc.register("김주선", grade1);
		sc.register("장윤근", grade2);
		sc.register("양효준", grade3);
		
		sc.showStudentAvg();
	}

}
