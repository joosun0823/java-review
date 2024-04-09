package tvTest;

public class Tv {
	//필드
	//tv 채널, 볼룸, 전원, 가격, 색상
	int ch; 
	int vol;
	boolean power; //boolean 기본값 false
	int price;
	String color;
	
	//메소드
	void powerOnOff() {
		if(!power) { 
			//power가 false일 때 출력
			System.out.println("tv 전원을 킵니다");
		}	else {
			//poser가 true일 때 출력
			System.out.println("tv 전원을 끕니다");
		}
	}
	
	void chUp() {
		if(!power) {
			//power가 false일 때 채널 올리는 메소드
			System.out.println("현재 채널: " + ch);
			ch++; //증감연산자로 ch+1
			System.out.println("채널을 1 올립니다. 현재 채널: " + ch);
		} else {
			System.out.println("tv 전원을 먼저 켜야합니다");
		}
	}
	
}
