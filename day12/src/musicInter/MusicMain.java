package musicInter;

public class MusicMain {
	public static void main(String[] args) {
//		System.out.println(new Rock() instanceof Music);
		
		
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
	}
	
	static void check(Music music) {
		music.mode(); //mode 오버라이딩
		if( music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		} else if (music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		} else if (music instanceof Rock ) {
			((Rock)music).onlyRock();
		}
	}
}
