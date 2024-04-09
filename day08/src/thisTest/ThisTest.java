package thisTest;

class Car {
	// 필드
	String brand; //브랜드
	String color; //색상
	int price; //가격

	// 메소드
	void carInfo() {
		System.out.println(this.brand + "의 색깔은 " + this.color + "입니다");
	}

	// 생성자
	public Car() {
		this("벤틀리", "red", 50000); //자기 자신의 생성자 중 매개변수 3개받는 생성자에 대입
	}
	//매개변수 2개받는 생성자
	public Car(String brand, String color) {
		this(brand, color, 10000);
		System.out.println("생성자 실행");
//		this.brand = brand;
//		this.color = color;
	}
	//매개변수 3개받는 생성자
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

}

public class ThisTest {
	public static void main(String[] args) {
		Car car1 = new Car(); //기본 생성자의 객체 
		Car car2 = new Car("BMW", "white"); //매개변수 2개받는 생성자의 객체
		Car car3 = new Car("KIA", "black", 2000); //매개변수 3개받는 생성자의 객체
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car3.brand);
		
		System.out.println(car1.price);
		System.out.println(car2.price);
		System.out.println(car3.price);
		
		
		
	}
}
