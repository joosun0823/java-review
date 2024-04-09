package inheritanceTest3;

public class Parents {
   //필드
   int number;
   
   //메소드
   void printStr(String str) {
      System.out.println(str);
   }

   //생성자
   public Parents() {
      super(); //부모 생성자
      System.out.println("Parents 생성자 호출");
   }

   //매개변수 1개있는 생성자
   public Parents(int number) {
      super();//부모 생성자
      this.number = number;
      System.out.println(number);
   }
   
   
}
