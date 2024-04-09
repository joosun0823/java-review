package ambiguityTest;
	//ClassA를 상속, Inter1를 구현
public class ClassB extends ClassA implements Inter1{
	//ClassA와 Inter1 양쪽에 printText() 메소드가 존재하지만 오류가 발생하지 않는다
	//구현하는 인터페이스보다 상속받는 부모클래스의 우선순위가 높기 때문이다
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.printText();
		//자식 클래스이기 때문에 부모클래스의 메소드 호출가능
	}
}
