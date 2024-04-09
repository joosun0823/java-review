package inheritanceTest3;

public class Child extends Parents{
	//parents 클래스를 상속
   //필드
   int number;
   
   //메소드
   void printInt(int num) {
      System.out.println(num);
   }

   //생성자
   public Child() {
      super(10); //부모클래스의 매개변수 1개 있는 생성자 즉 parents클래스의 생성자
      System.out.println("Child 생성자 호출");
   }

   public Child(int number) {
      super(); //부모클래스의 기본 생성자, parents의 기본 생성자
      this.number = number;
   }
   
}