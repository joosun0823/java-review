package accessTask;

public class Cat extends Animal{
	//필드
	private String color;
	//프라이빗 변수 색깔 같은 클래스내에서만 사용가능 get,set이용
	//기본 생성자
	public Cat() {
		super();
	}
	
	//메소드
	//get,set
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	//프라이빗 메소드
	private void play() {
		System.out.println( this.color + "색 고양이 " +
				super.name + "이/가 놀고있습니다" );
	}
	
	

	void scratch() {
		System.out.println( super.name + "이/가 스크래치를 긁습니다");
		//프라이빗 메소드를 디폴트 메소드에 넣어 호출 가능
		play();
	}
	
	
}
