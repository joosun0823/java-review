package ex01;

public class School2 {
//   필드   
//   학생배열(students) Student 배열 타입
//   학생수(studentCount) 정수형 타입
   Student[] students;
   int studentCount;

//   생성자   
//   기본 생성자(매개변수 없는 생성자, 단, 초기값은 반드시 지정한다.)
//   최대 30까지 학생을 받을 수 있다
//   학생 수는 0부터 시작한다
   public School2(Student[] students, int studentCount) {
      super();
      this.students = new Student[30];
      this.studentCount = 0;
   }

//   등록 메소드 registerStudent 
//   (매개변수 Student타입 student, 리턴값 boolean타입)

   // 매개변수는 Student 객체
   // if (최대학생 등록 가능수는 30크거나 같다면(조건문) 등록불가 출력)
   // 배열의 크기를 1씩 증가
   // 학생번호 해당 번호로 부여
   // 학생을 등록했습니다 출력
   boolean registerStudent(Student student) {
      if (studentCount >= 30) {
         System.out.println("최대학생수 30명을 초과하여 학생을 등록하지 못했습니다");
         return false;
      }
      students[studentCount++] = student;
      student.studentNumber = studentCount;
      System.out.println("학생을 등록했습니다");
      return true;
   }

//   학생 목록 보기 메소드 showStudentList (매개변수 x, 리턴값 x)
//    studentCount 개수만큼 반복문(for문)
   void showStudentList() {
      System.out.println("=== 학생 목록 ===");
      for (int i = 0; i < studentCount; i++) {
         System.out.println(students[i]);
      }
      System.out.println("=================");
   }

//   성적 평균 보기 메소드 showScoreAvg (매개변수 x, 리턴값 x)
//   studentCount 개수만큼 반복문(for문)
   void showScoreAvg() {
      System.out.println("=== 성적 평균 ===");
      for (int i = 0; i < studentCount; i++) {
         Student student = students[i];
         double avg = student.scoreAvg();
         System.out.println("학생 이름 : " + student.studentName + ", 평균성적 : " + avg);
      }
      System.out.println("=================");
   }
}
