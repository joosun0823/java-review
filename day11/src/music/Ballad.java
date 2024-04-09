package music;

public class Ballad extends Music{
	//music 클래스를 상속
	@Override
	void mode() {
		System.out.println("발라드 모드가 켜졌습니다");
	}
	
	void onlyBallad() {
		System.out.println("발라드 음악를 실행합니다");
	}

}
