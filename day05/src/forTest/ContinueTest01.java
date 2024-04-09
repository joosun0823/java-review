package forTest;

public class ContinueTest01 {
	public static void main(String[] args) {
		// 1부터 100까지의 합 출력
		// 1)총합 구할 변수
		// 2)for(초기식 int i = 1; 조건식 i <= 100; 증감식 i++)
		// 3) 총합변수+=i
		// 4)출력

		int total = 0;
		//정수형 변수 total 기본값 0
		for (int i = 1; i <= 100; i++) {
			//반복문 조건 정수형 변수 i는 값 1, 100이하, 증감연산자
//			total += i;
			
			if(i%2==0) {
				//i가 2로 나눴을 때 나머지 0일경우 
				//스킵 후 다음 반복으로 넘어간다
				continue;
			}
			
			total += i;
			//총합 변수 total i를 반복해서 더해줌
			System.out.println(i);
		}
		
		System.out.println(total);
		
		//홀수 총합 구하기
	}
}
