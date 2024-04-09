package ex01;

import java.util.Arrays;

public class Student2 {
//   필드   
//   학생번호(studentNumber) 정수형타입
//   학생이름(studentName) 문자열타입
//   성적배열(grades) 정수형배열타입
   int studentNumber;
   String studentName;
   int[] grades;

//   생성자   
//   매개변수 2개 있는 생성자(문자열 studentName, 정수형 배열 grades )
//   매개변수로 들어온 값 저장할 것
   public Student2(String studentName, int[] grades) {
      super();
      this.studentName = studentName;
      this.grades = grades;
   }

//   메소드   
//   성적 정보 보기 메소드(showGradeInfo 리턴타입x, 매개변수 x)
   // 학생이름, 학생번호, 국어성적, 영어성적, 수학성적 출력
   void showGradeInfo() {
      System.out.println("=== 성적 정보 ===");
      System.out.println("학생 이름 : " + studentName);
      System.out.println("학생 번호 : " + studentNumber);
      System.out.println("국어성적 : " + grades[0]);
      System.out.println("영어성적 : " + grades[1]);
      System.out.println("수학성적 : " + grades[2]);
      System.out.println("===============");
   }

//   평균 성적 계산 메소드(scoreAvg 리턴타입 double, 매개변수 x)
   // 총합 구할 변수 선언
   // 반복문(for-each문)
   // 변수 += 반복문변수명;
   // return (double) sum / grades.length;
   double scoreAvg() {
      int sum = 0;
      for (int grade : grades) {
         sum += grade;
      }
      return (double) sum / grades.length;
   }

   // toString() 오버라이딩
//   학생이름, 학생 점수를 반환하는 메소드(Arrays.toString(grades)
//   Object 클래스의 toString 메소드 오버라이딩 문자열로 반환
   @Override
   public String toString() {
      return "Student [ 학생이름 : " + studentName + ", 학생 점수 : " + Arrays.toString(grades) + "]";
   }

}
