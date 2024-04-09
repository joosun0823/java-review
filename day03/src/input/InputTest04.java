package input;

import java.util.Scanner;

public class InputTest04 {
   public static void main(String[] args) {
      //좋아하는 숫자 num   => nextInt()
      //좋아하는 동물 animal => nextLine()
      int num = 0;
      //정수형 변수 num 기본값 0 대입해서 선언
      String animal = "";
      //문자열 변수 animal 기본값 null
      Scanner sc = new Scanner(System.in);
      System.out.println("좋아하는 숫자를 입력하세요 : ");
      num = sc.nextInt();
      //num에 숫자 입력값 넣어주기 위해 nextInt
      System.out.println("좋아하는 동물을 입력하세요 : ");
      sc.nextLine();
      //엔터 소모위해 nextLine 한번 써줌
      animal = sc.nextLine();
      //animal에 문자열 입력값 대입
      
      System.out.println("좋아하는 숫자는 " + num + ", "
            + "좋아하는 동물은 " + animal + "입니다");
      
   }
}
