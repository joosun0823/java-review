package music;

public class Rock extends Music{
	//music 클래스를 상속
	@Override
	void mode() {
		System.out.println("락모드가 켜졌습니다");
	}
	
	void onlyRock() {
		System.out.println("락 음악을 실행합니다");
	}
	
}
