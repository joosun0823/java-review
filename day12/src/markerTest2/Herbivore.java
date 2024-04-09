package markerTest2;

public class Herbivore extends Animal{

	public Herbivore(String name) {
		super(name);
	}

	//메소드
	public void graze() {
		System.out.println(getName() + "이/가 초원에서 풀을 뜯습니다");
	}
}
