package throwTest;

import java.util.Scanner;

public class ThrowTest2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.println("양의 정수를 입력하세요 : ");
//      number = sc.nextInt();
//      if (number < 0) {
//         System.out.println("양수만 입력하세요");
//      } else {
//         System.out.println(number);
//      }

		number = sc.nextInt();
		if (number < 0) {
			try {
				throw new MyException("그게 양수냐?");
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(number);

	}
}
