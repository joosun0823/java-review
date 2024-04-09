package castingTest;

public class Tv {
	//필드
	int ch; //채널
	int vol; //볼륨
	boolean power; //전원
	
	//메소드
	void chUp() {
		//채널올리기
		System.out.println("현재 채널: " + this.ch);
	}
	
	void chDown() {
		//채널내리기
		System.out.println("현재 채널: " + this.ch);
	}
	
	void powerOnOff() {
		//전원키고끄기
		System.out.println("tv 전원을 키고 끕니다");
	}
	
}
