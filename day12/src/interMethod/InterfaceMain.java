package interMethod;

public class InterfaceMain {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		//스태틱 메소드 호출 => 클래스명.메소드명() or 
		//인터페이스명.메소드명()
		//스태틱 메소드는 구현되어있기 때문에 구현되어있는 곳에서 호출해야함
		MyInterface.staticMethod();
		//디폴트 메소드는 상속받은 자식클래스에서 호출 가능
		mc.defaultMethod();
		mc.abstractMethod();
	}	
}
