package music;

public class HipHop extends Music{
	//music 클래스를 상속
	@Override
	void mode() {
		System.out.println("힙합 모드가 켜졌습니다");
	}
	
	void onlyHipHop() {
		System.out.println("힙합 음악을 실행합니다");
	}

	
}
