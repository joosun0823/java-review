package ex02;

import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
      // 정수형 변수 3개 선언
      // 입력클래스 import
//      try
      // 입력 메시지 출력
      // 입력 메소드(nextInt()) 입력 받기
      // 입력메시지 출력
      // 입력 메소드(nextInt()) 입력 받기
//      if(변수2 <= 0){
//         throw new MyException("0또는 음수로 나눌 수 없습니다");
//      }
      // 나눗셈 결과 = 변수1 / 변수2
//      catch(MyException e){
//         getMessage() 출력
//      }catch(Exception e)

      Scanner sc = new Scanner(System.in);
      try {
         System.out.println("나누어질 숫자 입력 : ");
         int num1 = sc.nextInt();
         System.out.println("나누어질 숫자 입력 : ");
         int num2 = sc.nextInt();

         if (num2 <= 0) {
            throw new MyException("0 또는 음수로 나눌수없습니다");
         }
         int result = num1 / num2;
         System.out.println("나눈 결과 : " + result);
      } catch (MyException e) {
         System.out.println(e.getMessage());
      } catch (Exception e) {
         System.out.println("예상치 못한 오류가 발생했습니다");
         e.printStackTrace();
      } finally {
         sc.close();
      }

   }
}
