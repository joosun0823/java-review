package musicInter;

public class HipHop implements Music{

	@Override
	public void mode() {
		System.out.println("힙합 모드");	
	}

	public void onlyHipHop() {
		System.out.println("힙합 음악이 실행됩니다");
	}
}
