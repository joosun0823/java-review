package inheritanceTest;

public class TvMain {
	public static void main(String[] args) {
		//Tv객체
		Tv tv = new Tv();
		//Tv2객체
		Tv2 tv2 = new Tv2();
		//SmartTv객체
		SmartTv smartTv = new SmartTv();
		
		System.out.println(tv);
		System.out.println(tv2);
		System.out.println(smartTv);
		
		tv.ch = 10;
		tv.chUp();
		
	}
}
