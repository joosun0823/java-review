package marvelHeroes;

public class Hero {
	// Hero.java - 기본 마블 히어로 클래스
    private String name; //이름 (프라이빗)
    public void useSuperpower() { //능력사용메소드
    	if(name != null) {
    		//name이 빈값일 때
    		System.out.println(name + "가(이) 슈퍼파워를 사용합니다.");    		
    	} else {
    		System.out.println("이름을 넣어주세요");
    	}
    }



	public void sayCatchphrase() {
		if( name != null) {
			//name이 빈값일 때
			System.out.println(name + "가(이) 대사를 외칩니다.");			
		} else {
			System.out.println("이름을 넣어주세요");
		}
    }

	//alt shift s r
	//get / set
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
// IronMan.java - 아이언맨 클래스 (Hero를 상속)
// Hulk.java - 헐크 클래스 (Hero를 상속)
// SpiderMan.java - 스파이더맨 클래스 (Hero를 상속)
// Main.java - 히어로 객체를 생성하고 슈퍼파워를 사용하기(업캐스팅, 다운캐스팅을 이용하여 슈퍼파워 메소드의 내용 출력하기)

//생성자 없이 이름이 같이 출력될 수 있도록해야함
}
