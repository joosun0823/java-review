package control;

public class WhileTest01 {
   public static void main(String[] args) {
      int cnt = 1;
      System.out.println(cnt < 5);
      while (cnt < 6){
         System.out.println("안녕하세요");
//         cnt += 1; 
         System.out.println(cnt++);
//         break;
      }
      
      //정수형 변수 cnt에 1 대입
      //while문
      //cnt의 값이 6미만일 때 계속 반복해서 "안녕하세요" 출력
   }
}
