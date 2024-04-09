package castingTest4;
//슈퍼클래스 Shape를 상속받은 서브클래스 Circle
public class Circle extends Shape{
	int radius; //반지름
	
	@Override
	//부모 클래스가 추상클래스이면 오버라이딩 필수
	double shapeArea() {
		return radius*radius*Math.PI;
	}

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("원을 그립니다");
	}
	
	//원 넓이 구하는 메소드
	void cirArea(double radius) {
		System.out.println("원의 넓이: " + radius*radius*Math.PI);
	}
	
}
