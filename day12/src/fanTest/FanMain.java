package fanTest;

public class FanMain {
	public static void main(String[] args) {
		FanMain fm = new FanMain();
		fm.method(new BasicFan()); //업캐스팅해도 오버라이딩된 값 반환
		fm.method(new BasicFan2()); //업캐스팅해도 오버라이딩된 값 반환
		fm.method(new SmartFan()); //업캐스팅해도 오버라이딩된 값 반환
		
		BasicFan bf = new BasicFan();
		
		//fan어댑터 클래스와 fan 인터페이스 포함하는지 확인
		System.out.println( bf instanceof FanAdapter);
		System.out.println( bf instanceof Fan);
	}
	
	void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
		
	}
}
