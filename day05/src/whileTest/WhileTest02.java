package whileTest;

public class WhileTest02 {
	public static void main(String[] args) {
		// 1부터 100까지의 짝수의 합 출력(while문)

		// 정수형 변수선언
		// while문 안에 증가함수 만들어주기
		// if 조건문으로 짝수만 가져와주기
		// 모든 짝수의 합

		
//		1) 변수선언
//		2) 반복문( 출력카운트 변수)
//		3) 조건문(if 카운트 %2 ==0)
//		4) 총합 구할 변수 += 카운트
//		5) 카운트 변수 증가
//		6) 출력


		int num = 0, even = 0;

		while (num <= 100) {//num이 100보다 작거나 같을 때 실행
			//num은 0부터 100까지
			if (num % 2 == 0) {
				even += num;
			}
			num++;
		}
		System.out.println(even);
	}
}
