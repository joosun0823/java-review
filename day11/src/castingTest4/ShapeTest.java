package castingTest4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape r = new Rectangle(); //업캐스팅
		
		System.out.println(r);

		polymorphism(new Circle());
		polymorphism(new Triangle());
		polymorphism(new Rectangle());

//		downCasting(r);
		downCasting(new Triangle());

	}

	// 참조변수의 다형성 기능을 할 메소드
	static void polymorphism(Shape shape) {
		// 업캐스팅된 메소드 호출
		shape.draw();
	}

	// 다운캐스팅 기능을 할 메소드
	// instanceof 연산자를 사용하여 객체의 실제 타입을 확인
	// 넓이 구하는 메소드 호출
//	static void downCasting(Shape shape) {
//		if (shape instanceof Rectangle) {
//			((Rectangle) shape).rectArea(4, 5);
//		} else if (shape instanceof Circle) {
//			((Circle) shape).cirArea(3);
//		} else if (shape instanceof Triangle) {
//			((Triangle) shape).triArea(3, 4);
//		} else {
//			System.out.println("모르겠눈뒈?");
//		}
//	}
	
	static void downCasting( Shape shape ) {
		if(shape instanceof Circle) { //매개변수가 Circle 타입을 포함하고있는지 확인
			//포함할 때 실행
			double result = ((Circle) shape).shapeArea(); // 다운캐스팅 후 메소드호출
			System.out.println(result);
		} else if ( shape instanceof Rectangle) {//매개변수가 Rectangle 타입을 포함하고있는지 확인
			//포함할 때 실행
			((Rectangle)shape).width = 4; //다운캐스팅 후 변수 대입
			((Rectangle)shape).height = 4; //다운캐스팅 후 변수 대입
			double result = ((Rectangle)shape).shapeArea(); // 다운캐스팅 후 메소드호출
			System.out.println(result);
		} else if ( shape instanceof Triangle) {//매개변수가 Triangle 타입을 포함하고있는지 확인
			((Triangle)shape).base = 4;//다운캐스팅 후 변수 대입
			((Triangle)shape).height = 7;	//다운캐스팅 후 변수 대입		
			double result = ((Triangle)shape).shapeArea();// 다운캐스팅 후 메소드호출
			System.out.println(result);
		} else {
			System.out.println("XXX");
		}
	}
	
}
