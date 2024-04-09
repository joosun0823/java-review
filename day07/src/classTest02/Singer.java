package classTest02;

public class Singer {
	//필드
	String artist; //가수이름
	String title; //제목
	String album; //엘범명
	
	//메소드
	//정보출력 메소드
	void artistInfo() {
		System.out.println("노래 제목: " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨범명 : " + album);
	}
}
