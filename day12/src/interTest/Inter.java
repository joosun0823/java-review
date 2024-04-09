package interTest;
//인터페이스
public interface Inter {
	//상수, 추상메소드
	public final static int VAR1 = 20;
	//상수 VAR1 값 20 선언
	int VAR2 = 30;
	//상수 VAR2 값 30 선언
	//public final 붙히지 않더라도 자동적으로 상수 선언됨
	public abstract void method1();
	//추상메소드도 public abstract 붙히지 않더라도 자동적으로 추상메소드로 선언됨
	void method2();
}
