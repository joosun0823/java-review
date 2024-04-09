package castingTest3;

public class Cat extends Animal{
	//animal클래스 상속
	//메소드 오버라이딩
   @Override
   void crying() {
      System.out.println("컄");
   }
   
   //생성자
   public Cat(String name) {
 		super(name);
 	}
}
