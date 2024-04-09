package superTest;

public class Parents {
	//필드
	int pVal; //부모 변수
	
	//메소드
	void pMethod1() {
		System.out.println("슈퍼클래스 메소드 호출");
	}
	
	//생성자
	//매개변수 1개 받는 생성자
	public Parents(int val) {
		this.pVal = val;
		System.out.println("부모 생성자 호출");
	}
}
