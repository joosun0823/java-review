package music;

public class MusicMain {
	public static void main(String[] args) {
		Music m = new Music(); 
		Music b = new Ballad(); 
		Music h = new HipHop(); 
		Music r = new Rock(); 
		
		
//		check(m);
//		check(b);
//		check(h);
//		check(r);
		
//	    MusicMain mm = new MusicMain();
		 check(new Ballad());
	      check(new HipHop());
	      check(new Rock());

		
	}
	
//	static void check(Music music) {
//		if(music instanceof Ballad) {
//			((Ballad) music).mode();
//			((Ballad) music).onlyBallad();
//		} else if( music instanceof HipHop) {
//			((HipHop) music).mode();
//			((HipHop) music).onlyHipHop();
//		} else if( music instanceof Rock) {
//			((Rock) music).mode();
//			((Rock) music).onlyRock();
//		} else {
//			System.out.println("모드가 켜져있지 않습니다");
//		}
//	}
	
	static void check(Music music) {
		if(music instanceof Ballad) { //매개변수가 Ballad 클래스 포함하는지 확인
			Ballad ballad = (Ballad) music; //다운캐스팅
			ballad.mode(); //다운캐스팅 하여 ballad 메소드 사용가능
			ballad.onlyBallad();
		} else if( music instanceof HipHop) { //매개변수가 HipHop 클래스 포함하는지 확인
			HipHop hiphop = (HipHop) music;  //다운캐스팅
			hiphop.mode();  //다운캐스팅 하여 hiphop 메소드 사용가능
			hiphop.onlyHipHop();
		} else if( music instanceof Rock) {  //매개변수가 Rock 클래스 포함하는지 확인
			Rock rock = (Rock) music; //다운캐스팅
			rock.mode(); //다운캐스팅 하여 Rock 메소드 사용가능
			rock.onlyRock();
		}
	}
	
	
}
