package ambiguityTest;

public interface Inter1 { //인터페이스
	default void printText() {
		System.out.println("Inter1 printText() 호출");
	}
}
