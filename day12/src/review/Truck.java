package review;

public class Truck extends Vehicle{
	//추상클래스 상속받는 Truck클래스
	private int speed;//속도 필드(private)

	//추상클래스 메소드 오버라이딩
	@Override
	public void move() {
	      System.out.println("트럭이 이동합니다");
		
	}

   @Override
   public void setSpeed(int speed) {
      this.speed = speed;
      System.out.println("현재 속도 : " + speed);
   }

   @Override
   public int getSpeed() {
      return this.speed;
   }  

	
}