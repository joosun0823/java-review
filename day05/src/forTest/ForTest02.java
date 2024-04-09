package forTest;

public class ForTest02 {
	public static void main(String[] args) {
		//for문
		//초기식 정수형 변수선언
		//5번까지 조건식
		//증감연산
		//이름 출력(i 변수활용)
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번 김주선");
		}
		
		//10번째 김주선~ 1번째
		
		//for문
		//초기식 10으로 잡기
		//조건식 0보다 클때
		//증감연산 --로 하기
		// 이름 출력
		
		for(int i = 10; i>0; i--) {
			System.out.println(i + "번 김주선");
		}
		
		
		//초기식 0부터 시작
		//조건식 i<10;
		//증감식 i++
		
		for(int i = 0; i<10; i++) {
			System.out.println(10-i + "번 김주선");
		}
		
		
	}
}
