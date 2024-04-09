package anonymousTest;

public class Main {
	public static void main(String[] args) {
		InterA a = new ClassB(); //업캐스팅
		a.printData(); //오버라이딩 메소드가 호출
		
		InterA ia = new InterA() { //익명클래스
			@Override
			public void printData() {
				System.out.println("익명클래스에서 오버라이딩");
				
			}
		};
		
		ia.printData();
	}
}
