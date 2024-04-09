package fanTest;

public class SmartFan implements Fan{
	//Fan을 구현
	//<오버라이딩>
	@Override
	public void on() {
		System.out.println("음성인식으로 전원 켜기");
		
	}

	@Override
	public void off() {
		System.out.println("음성인식으로 전원 끄기");
		
	}

	@Override
	public void turbo() {
		System.out.println("터보");
		
	}
	
}
