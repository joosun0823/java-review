package task;

public class BasicTv {
	//필드
	String color; //색상
	int inch; //인치
	int price; //가격
	boolean power; //true : on, false: off
	int channel = 1; //채널
	//매개변수 3개 받는 생성자(색상, 인치, 가격)
	public BasicTv(String color, int inch, int price) {
		this.color = color;
		this.inch = inch;
		this.price = price;
	}
	
	//매개변수 4개 받는 생성자(색상, 인치, 가격, 채널)
	public BasicTv(String color, int inch, int price, int channel) {
		this(color, inch, price);
		this.channel = channel;
	}

	
	
	//메소드
	//전원 켜는 메소드 powerOnOff() 매개변수 X, 리턴값 X
	void powerOnOff() {
		if(power) {
			//전원이 true일때 켜진 상태
			System.out.println("Tv전원이 켜졌습니다");
		} else {
			//false일때 꺼진 상태
			System.out.println("Tv전원이 꺼졌습니다");
		}
	}
	
	//채널올리는 메소드 channelUp() 매개변수 X, 리턴값 O
	void channelUp() {
		System.out.println("채널 번호: " + ++channel);
		//전원이 꺼져있다면 전원키기 출력
		if(power == false) {
			System.out.println("tv전원을 켜주세요");
		}
	}
	
	//채널내리는 메소드 channelDown() 매개변수 X, 리턴값 O
	void channelDown() {
		System.out.println("채녈 번호: " + --channel);
		//전원이 꺼져있다면 전원키기 출력
		if(power == false) {
			System.out.println("tv전원을 켜주세요");
		}
	}
}
