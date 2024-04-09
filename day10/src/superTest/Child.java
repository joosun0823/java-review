package superTest;

public class Child extends Parents{
	//부모 클래스 상속받은 자식클래스
   //필드
   int chVal; //정수형 변수

   //생성자
   //매개변수 2개 있는 생성자 => 상속관계에서 부모클래스에 기본생성자가 없는 경우
   //자식클래스를 만들게되면 빨간 밑줄(오류)이 발생한다
   public Child(int val, int chVal) {
      super(val); //매개변수 한개를 부모 매개변수 1개있는 생성자에 대입
      this.chVal = chVal;
      System.out.println("자식 생성자 호출");
   }
   
   //메소드
   void chMethod1() {
      //부모클래스에 있는 메소드를 호출
      super.pMethod1();
      //부모의 변수에 10 대입
      super.pVal = 10;
      System.out.println(super.pVal);
      System.out.println(this.pVal);
      System.out.println("자식 클래스 메소드 호출");
   }
}
