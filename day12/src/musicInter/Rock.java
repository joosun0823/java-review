package musicInter;

public class Rock implements Music{

	@Override
	public void mode() {
		System.out.println("락 모드");
	}
	
	public void onlyRock() {
		System.out.println("락 음악이 실행됩니다");
	}
}
