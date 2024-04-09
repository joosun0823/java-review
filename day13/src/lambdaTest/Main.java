package lambdaTest;

public class Main {
	public static void main(String[] args) {
		FunctionalInter fi = new FunctionalInter() { //익명클래스
			@Override
			public void method1() {
				System.out.println("익명 객체의 메소드 재정의");
			}
		}; 
		
		fi.method1();
		
		FunctionalInter fi2 = ()-> System.out.println("람다식"); //익명클래스
		//람다식 표현으로 오버라이딩 함수형 인터페이스라 가능
		fi2.method1();
	}
}
