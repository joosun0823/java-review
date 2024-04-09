package review;

public class Main {
	public static void main(String[] args) {
		//익명클래스를 이용해서 계산기 생성
		Cal cal = new Cal() {
			
			@Override
			public int sub(int num1, int num2) {
				return num1 - num2;
			}
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		//계산기 메소드 2개 출력
		System.out.println(cal.sub(3, 2));
		System.out.println(cal.add(1, 2));
		
	}
}
