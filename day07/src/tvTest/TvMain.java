package tvTest;

public class TvMain {
	public static void main(String[] args) {
		//Tv 객체
		Tv samsungTv = new Tv();
		System.out.println(samsungTv);
		
		System.out.println(samsungTv.ch); //객체 초기값
		System.out.println(samsungTv.power); //객체 전원 초기값
		
		samsungTv.ch = 10; //채널에 10값 대입
		samsungTv.vol = 15; //볼륨에 15값 대입
		
		samsungTv.powerOnOff(); //전원키기 메소드 호출
		samsungTv.chUp(); //채널 올리기 메소드 호출
		//객체에 값을 저장하는 방법이 불편하다. 이럴 때 생성자를 이용한다.

	}
}
