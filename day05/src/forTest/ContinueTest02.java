package forTest;

public class ContinueTest02 {
	public static void main(String[] args) {
		//1부터 10까지 5를 제외하고 출력하기
		// 반복문 (for 초기식 i=0; 조건식 i<10; 증감식 i++)
		// 조건문( if (i==5) continue;
		// 출력
		
		
		//반복문
		//초기식 i=0
		//조건식 i<10;
		//증감식 i++
		//조건문 i+1 == 5
		for (int i=0; i<10; i++) {
			if( i == 4) {
				continue;
			}
			System.out.println(i+1);
		}
		
	}
}
