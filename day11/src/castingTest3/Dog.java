package castingTest3;

public class Dog extends Animal{
	//animal 클래스를 상속

	//메소드
   //메소드 오버라이딩
   @Override
   void crying() {
      System.out.println("왈");
   }
   
   void walk() {
      System.out.println("산책");
   }
   
   //생성자
   public Dog(String name) {
		super(name);
	
	}

}
