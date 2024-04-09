package marvelHeroes;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hulk(); //업캐스팅 헐크
		Hero hero1 = new IronMan(); //업캐스팅 아이언맨
		Hero hero2 = new SpiderMan(); //업캐스팅 스파이더맨
		SuperPower(hero);
		SuperPower(hero1);
		SuperPower(hero2);
		
	}
	
	//스태틱 메소드
	static void SuperPower(Hero hero) {
		hero.useSuperpower();
		hero.sayCatchphrase();
	}	
}
