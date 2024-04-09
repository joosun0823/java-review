package review;

public class Tv {
	// 필드
	int ch; //채널
	int vol; //볼륨
	boolean power; //전원
	String color; //색상

	// 메소드
	//전원키기 메소드
	void powerOnOff() {
		System.out.println("Tv 전원을 켜고 끕니다");
	}

	//채널올리기 메소드
	void chUp() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널을 1올립니다" + ++ch);
	}
	
	//채널내리기 메소드
	void chDown() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널으 1내립니다" + --ch);
	}


	//생성자 : alt + shift + s + o
	//생성자 오버로딩 : 같은 이름의 생성자로 매개변수의 
	//타입, 개수, 순서가 다르면 선언이 가능하다
	public Tv() {

	}
	
	//매개변수 3개받는 생성자(오버로딩)
	public Tv(int ch, int vol, boolean power) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
	}
	
	//매개변수 4개받는 생성자(오버로딩)
	public Tv(int ch, int vol, boolean power, String color) {
		this(ch, vol, power); //자기자신의 매개변수 3개받는 생성자
		this.color = color;
	}

	
}
