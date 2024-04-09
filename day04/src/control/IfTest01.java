package control;

public class IfTest01 {
	public static void main(String[] args) {
		//if문
		System.out.println("1번");
		//1번 출력
		if(true) {
			System.out.println("2번");
		}
		//조건문이 true일 때 2번 출력
		if(10 % 2 ==0) {
			System.out.println("3번");
		}
		//조건문에서 10을 2로 나눈 나머지 값이 0일 때 3번 출력 => 참이므로 출력
		System.out.println("4번");
		//4번 출력
		System.out.println("==============");
		
		
	}
}
