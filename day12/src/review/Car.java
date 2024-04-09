package review;

public class Car extends Vehicle {
   //Car 클래스 추상클래스 상속받는 클래스
   
   
   private int speed; //속도 필드(private)
   //추상클래스 메소드 오버라이딩
   @Override
   public void move() {
      System.out.println("자동차가 이동합니다");
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
