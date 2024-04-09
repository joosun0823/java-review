package castingTest4;
//슈퍼클래스 Shape
public abstract class Shape {
	//추상클래스 안에서 일반 메소드도 가능
	void draw() {
		System.out.println("도형을 그립니다");
	}
	
	//추상메소드 => 추상클래스 안에서만 가능
	abstract double shapeArea();
}
