package lotto;


import java.util.HashSet;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		//로또 번호 생성
		//1 ~ 45 까지 숫자 중 6개 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성 
		//-> HashSet<Integer>
		//Random -> nextInt(45)+1
		
		//출력될 때 오름차순으로 정렬하여 출력한다
		//Collections.sort
		
		//사용자로부터 몇회차의 로또번호를 생성할 지 입력받고 각 회차별로 생성된
		//로또 번호를 출력한다
		//입력클래스, 입력 메소드 nextInt
		
		//1번 출력
		//로또 번호는 [1,2,3,4,5,6] 입니다
		
		//ArrayList<Integer> 메소드
		
		
		//출력 예시
		//몇 회차의 로또 번호를 생성하시겠습니까? 
		HashSet<Integer> number = new HashSet<>();
		Lotto lotto = new Lotto();

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 회차의 로또를 생성하시겠습니까? : ");
		lotto.round(sc.nextInt());
		sc.close();
	}
}
