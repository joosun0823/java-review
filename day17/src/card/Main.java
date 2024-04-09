package card;

import java.util.HashSet;
import java.util.Random;

public class Main {
//	3. 철수는 동생과 카드게임을 했다. 카드게임에 사용된 카드는 중복되는 숫자 없이 총 10장이다. 배열과 랜덤함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요.
//	카드에 적힌 숫자는 1부터 10이며, 카드는 섞여있으므로 순서는 상관없다.
//
//	2	1	3	5	4
//	6	9	7	8	10

	public static void main(String[] args) {
		// 중복되는 숫자없고 순서 상관 X --> HashSet 사용
		// 반복문으로 철수에게 먼저 5장 카드 부여
		// 동생도 새로운 객체로 만들어준다
		// 반복문 1~10까지 철수에게 들어가지 않은
		// 숫자만 add해주는 조건문

		HashSet<Integer> chulsoo = new HashSet<>();
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			int num = r.nextInt(10) + 1; //nextint(10)은 0~9까지 수이므로 +1

			if (!chulsoo.contains(num)) { //철수의 리스트에 포함이 되있지않다면
				chulsoo.add(num); //리스트 추가
				continue;
			}
			i--; //포함된다면 한번더 할수있게 i를 -1해줌
		}

		HashSet<Integer> brother = new HashSet<>();

		for (int i = 1; i <= 10; i++) {
			if (!chulsoo.contains(i)) {//춸수의 리스트에 포함되있지않다면
				brother.add(i); //동생의 리스트에 추가
			}
		}

		System.out.println(chulsoo);
		System.out.println(brother);

	}

}
