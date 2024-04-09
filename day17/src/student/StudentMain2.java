package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain2 {
   public static void main(String[] args) {
      // 컬렉션 프레임워크 이용(점수 저장)
      // 1. 사용자로부터 학생 수와 학생 점수 입력받기
      // 2. 입력받은 점수를 이용해서 평균점수 계산하기
      // 3. 입력받은 점수 중 최고점수 계산하기
      // 4. 계산된 평균점수와 최고점수 출력하기

      // 1) 입력 클래스
      Scanner sc = new Scanner(System.in);

      // 2) 사용자로부터 학생 수와 점수(ArrayList, 반복문) 입력받기
      System.out.println("학생 수 입력 : ");
      int stCount = sc.nextInt();

      List<Integer> scores = new ArrayList<>();
      for (int i = 0; i < stCount; i++) {
         System.out.println("학생" + (i + 1) + "의 점수입력 : ");
         int score = sc.nextInt();
         scores.add(score);
      }

      // 3) 입력받은 점수를 이용해서 평균점수 계산 메소드 호출
      double avg = stAvg(scores);

      // 4) 입력받은 점수 중 최고점수 계산 메소드 호출
      int high = highScore(scores);
      System.out.println("최고점수 : " + high);
      System.out.println("평균점수 : " + avg);

//      System.out.println(Integer.MIN_VALUE); //-2147483648
   }

   // 평균점수 구할 메소드
   static double stAvg(List<Integer> scores) {
      // 총합을 구할 변수
      // 반복문(for-each)
      // 총합구할변수 += 반복문변수
      // return 강제형변환 /

      int sum = 0;
      for (int score : scores) {
         sum += score;
      }
      return (double) sum / scores.size();
   }

   // 최고 점수 찾는 메소드
   static int highScore(List<Integer> scores) {
      // 최고점을 저장할 변수 (정수형의 최소값을 대입)
      // 반복문(ArrayList 점수)
      // 조건문(변수에 복사된 값이 high 값보다 크다면) 값 대입
      int high = Integer.MIN_VALUE;
      for (int score : scores) {
         if (score > high) {
            high = score;
         }
      }
      return high;
   }
}