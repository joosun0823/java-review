package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
//   카페메뉴
//   아메리카노 2000원
//   카페라떼 2500원
//   바닐라라떼 4000원
//   초코라떼 4000원

//   HashMap에 저장하기
//   출력과 입력
//   1. 아메리카노
//   2. 카페라떼
//   3. 바닐라라떼
//   4. 초코라떼
//   번호를 선택하세요 : 2
//   카페라떼의 가격은 2500원 입니다

   public static void main(String[] args) {

      // 1) HashMap<String, Integer> menu 객체 생성
      // 2) 사용자에게 선택할 메뉴 msg 변수 선언
      // 3) 입력 클래스 import
      // 4) msg 출력
      // 5) 변수 생성 nextInt
      // 7) switch~case
      // 1~4 "메뉴 " + menu.get("키값")
      // 8) 결과

      // 7-2) 선택한 번호에 따라 메뉴를 출력
      // memuName = "아메리카노";

      // 8-2) memuName + "의 가격은" + memu.get(memuName)

      HashMap<String, Integer> menu = new HashMap<>();
      Scanner sc = new Scanner(System.in);
      String result = null;
      String msg = "1. 아메리카노\n" + "2. 카페라떼\n" + "3. 바닐라라떼\n" + "4. 초코라떼\n" + "번호 선택 : ";
      menu.put("아메리카노", 2000);
      menu.put("카페라떼", 2500);
      menu.put("바닐라라떼", 4000);
      menu.put("초코라떼", 4000);

      System.out.println(menu);

      System.out.println(msg);
      int choice = sc.nextInt();
//      switch(choice){
//         case 1:
//            result = "아메리카노는 " + menu.get("아메리카노") + "입니다";
//            break;
//         case 2:
//            result = "카페라떼는 " + menu.get("카페라떼") + "입니다";
//            break;
//      }
//      System.out.println(result);

      // 선택한 번호에 해당하는 메뉴 출력
      switch (choice) {
      case 1:
         printMenu(menu, "아메리카노");
         break;
      case 2:
    	 printMenu(menu, "카페라떼");
    	 break;
      }

   }

   // 선택한 메뉴 출력 메소드
   static void printMenu(HashMap<String, Integer> menu, String menuName) {
      int price = menu.get(menuName);
      System.out.println(menuName + "의 가격은 " + price + "입니다");

   }
}
