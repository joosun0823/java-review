package review;

public class Review {
	public static void main(String[] args) {
		//차량(Vehicle) 추상클래스
		//move() 이동하는 추상메소드
		//속도 설정 메소드(매개변수 int speed)
		//현재 속도 가져오는 메소드
		
		//Car 클래스 추상클래스 상속받는 클래스
		//속도 필드(private)
		
		//추상클래스 메소드 오버라이딩
		
		//Motorcycle 클래스 추상클래스 상속받는 클래스
		//속도 필드(private)
		//추상클래스 메소드
		
		//Truck 클래스 추상클래스 상속받는 클래스
		//속도 필드(private)
		
		//Review클래스
		//main 메소드
		//moveSpeed() : 매개변수 2개
		//모든 메소드 출력하기
		
		moveSpeed(new Car(), 60);
	}
	
	
	static void moveSpeed(Vehicle v, int speed ) {
		v.move();
		v.setSpeed(speed);
		v.getSpeed(); 
	}
}
