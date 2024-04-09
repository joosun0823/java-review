package marvelHeroes;

public class IronMan extends Hero{
	//hero클래스를 상속
	
	//hero클래스에 있는 getname 메소드 오버라이딩
	public String getName() {
		return "아이언맨";
	}
	
	
	@Override //오버라이딩
	public void useSuperpower() {
		System.out.println(getName() + "가(이) 슈퍼파워를 사용합니다.");
	}



	@Override //오버라이딩
	public void sayCatchphrase() {
	       System.out.println(getName() + "가(이) 대사를 외칩니다.");
	}
	
	
}
