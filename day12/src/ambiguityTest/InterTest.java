package ambiguityTest;

public class InterTest implements Inter1, Inter2, Inter3{
	//인터페이스1.2.3 구현 => 다중구현 가능
	@Override
	public void printText() {
		Inter1.super.printText();
//		Inter2.super.printText();
//		Inter3.super.printText();
	}
	
	public static void main(String[] args) {
		InterTest it = new InterTest();
		it.printText();
	}
}
