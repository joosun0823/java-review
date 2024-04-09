package tvTest;

public class Tv2 {
	//필드
	int ch; //채널
	int vol; //볼륨
	boolean power; //전원
	String color; //색깔
	
	//생성자
	//매개변수 4개 받는 생성자
	public Tv2(int ch, int vol, boolean power, String color) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}
	
	//메소드
	//전원키기 메소드
	void power() {
		if(!power) {			
			System.out.println("tv 전원을 킵니다");
		} else {
			System.out.println("tv 전원을 끕니다");
		}
	}
}
