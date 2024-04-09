package review;

public class TvMain {
	public static void main(String[] args) {
		//객체화작업(인스턴스화)
		Tv sTv = new Tv();
		System.out.println(sTv.power);
		//필드에 있는 논리형 변수 power true값 대입
		sTv.power = true;
		System.out.println(sTv.power);
		System.out.println(sTv.ch);
		//필드에 있는 변수 ch 22대입
		sTv.ch = 22;
		System.out.println(sTv.ch);
		//chUp() 매개변수 X, 리턴값 X => 객체.메소드명();
		sTv.chUp();
		
		//sTv2 객체 매개변수 4개 있는 생성자로 만들기
		Tv sTv2 = new Tv(10, 15, true, "");
		System.out.println(sTv2);
		System.out.println(sTv2.ch);
	}
}
