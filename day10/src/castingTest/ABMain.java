package castingTest;

public class ABMain {
   public static void main(String[] args) {
	   //B는 A를 상속받은 클래스
      A a = new A();
      //A클래스 객체
      System.out.println(a);
      B b = new B();
      //B클래스 객체
      System.out.println(b);
      A ab = new B(); //업캐스팅
      //자식의 생성자를 부모 타입으로 형변환
      System.out.println(ab);
      
      //instanceof 타입을 포함하고있는지 확인
      System.out.println(a instanceof A);
      System.out.println(a instanceof B);
      System.out.println(b instanceof B);
      System.out.println(b instanceof A);
      
   }
}
