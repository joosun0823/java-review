package forTest;

public class TwoForTest03 {
   // 구구단 2단~9단까지 탭키 적용해서 단마다 가로로 출력하기

//   // 바깥for => 2~9
//   // 안쪽for => 1~9
   public static void main(String[] args) {
//
//      for (int dan = 2; dan < 10; dan++) {
//         for (int num = 1; num < 10; num++) {
//            System.out.print(dan + " x " + num + " = " + dan * num);
//            if(num != 9) {
//               System.out.print("\t");
//            }
//         }//안쪽for문 끝나는 영역
//         System.out.println();
//      }

      for (int num = 1; num <= 9; num++) {
         for (int dan = 2; dan <= 9; dan++) {
            System.out.print(dan + "x" + num + "=" + dan * num + "\t");
         }
         System.out.println();
      }
   }
}
