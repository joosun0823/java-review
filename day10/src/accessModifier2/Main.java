package accessModifier2;

import accessModifier.A; //import를 받아 퍼블릭인 A클래스 사용가능

public class Main {
	public static void main(String[] args) {
		A a = new A(); //A클래스 객체생성
		Child c = new Child(); //child클래스 객체 생성
		
		a.var1 = 9; //A클래스 변수에 대입
		System.out.println(a.var1);
		
		c.method(); //c 객체의 메소드 호출
		
	}
}
