package castingTest4;
//슈퍼클래스 Shape를 상속받은 서브클래스 Rectangle
public class Rectangle extends Shape{
	int width; //가로
	int height; //높이
	
	@Override
	//부모 클래스가 추상클래스이면 오버라이딩 필수
	double shapeArea() {
		return width*height;
	}

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("사각형을 그립니다");
	}
	
	//사각형 넓이 구하는 메소드
	void rectArea(int width, int height) {
		System.out.println("사각형 넓이: " + width*height);
	}
}
