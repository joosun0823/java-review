package task01;

public abstract class Food {
	//추상 메소드
	abstract int calculatePrice();
	abstract String getFoodName();
	
	//일반 메소드
	void display() {
		System.out.println("주문한 음식 : " + getFoodName() + ", 주문한 가격 : " + calculatePrice() );
	}

}
