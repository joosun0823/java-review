package accessTask;

public class MainTask {
	public static void main(String[] args) {
		//Animal 클래스
		//필드 : protected name
		//생성자 : 매개변수 X 기본생성자
		//메소드 : eat() => 00이가 먹이를 먹습니다 출력
		
		//Cat 클래스
		//Animal 클래스를 상속받는 클래스
		//필드 : private 색상 color
		//생성자 : 매개변수 X 기본생성자
		//메소드 : play(매개변수 x, 리턴값 x) => 00색 고양이 00가 놀고있습니다 출력
		// scratch(매개변수x, 리턴값 x) => 00이가 스크래치를 긁습니다
		
		
		Animal ani = new Animal();
		//animal 클래스 객체생성
		ani.name = "콩이";
		ani.eat();
		
		Cat cat = new Cat();
		//cat클래스 객체생성
		cat.name = "네로";
		cat.setColor("검정");
		//set으로 프라이빗 변수 색깔 대입
//		System.out.println(cat.getColor());
		
//		cat.play();
		cat.scratch();
		//디폴트 메소드로 프라이빗 메소드까지 같이 호출
	}
}
