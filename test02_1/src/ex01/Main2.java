package ex01;

public class Main2 {
   public static void main(String[] args) {
      // School 객체 생성
      // 학생 점수 배열
      // 학생 객체 3개 생성(점수 배열)
      // 객체1개만 출력

      // 학생 등록 메소드 호출
      // 학생 목록 보기 메소드 호출
      // 학생 평균성적보기 메소드 호출

      School school = new School();

      int[] grade1 = { 10, 20, 30 };
      int[] grade2 = { 34, 40, 88 };
      int[] grade3 = { 89, 60, 67 };

      Student st1 = new Student("뽀로로", grade1);
      Student st2 = new Student("루피", grade2);
      Student st3 = new Student("짱구", grade3);

      System.out.println(st1);

      school.registerStudent(st1);
      school.registerStudent(st2);
      school.registerStudent(st3);

      school.showStudentList();
      school.showScoreAvg();
   }
}
