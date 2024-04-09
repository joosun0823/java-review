package castingTest4;
//슈퍼클래스 Shape를 상속받은 서브클래스 Triangle
public class Triangle extends Shape{

	int base; //밑변
	int height;  //높이
	
	@Override
	//부모 클래스가 추상클래스이면 오버라이딩 필수
	double shapeArea() {
		return base*height*0.5;
	}	
	
	@Override
	void draw() {
		System.out.println("삼각형을 그립니다");
	}
	


	//삼각형 넓이 구하는 메소드
	void triArea(int base, int height) {
		System.out.println("삼각형의 넓이: " + base*height*0.5);
	}

}
