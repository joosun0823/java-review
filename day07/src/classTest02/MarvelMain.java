package classTest02;

public class MarvelMain {
	public static void main(String[] args) {
		MarvelHero ironMan = new MarvelHero("아이언맨", "에너지빔", 20);
		//객체 생성	생성자에 매개변수 3개 대입
		System.out.println(ironMan);
		
		MarvelHero hulk = new MarvelHero();
		//기본 객체 생성
		System.out.println(hulk);
		
		ironMan.name = "아이언맨"; //아이언맨 이름 대입
		ironMan.superpower = "에너지 빔"; //아이언맨 능력 대입
		ironMan.age = 40; //아이언맨 나이 대입
		
		hulk.name = "헐크"; //헐크 이름 대입
		hulk.superpower = "근력파워"; //헐크 능력 대입
		hulk.age = 35; //헐크 나이 대입
		
		ironMan.heroInfo(); //아이언맨 객체 영웅정보 메소드호출
		hulk.heroInfo(); //헐크 객체 영웅정보 메소드 호출
		
		hulk.performAction(); //능력사용 메소드 호출
	}
}
