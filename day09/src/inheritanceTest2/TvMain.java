package inheritanceTest2;

public class TvMain {
   public static void main(String[] args) {
      Tv tv = new Tv();
      //부모클래스의 객체
      Tv2 tv2 = new Tv2();
      //자식클래스의 객체
      SmartTv st = new SmartTv();
      //자식클래스2의 객체
      System.out.println(tv);
      System.out.println(tv2);
      System.out.println(st);
      st.mode();// 자식2 객체 부모의 mode메소드 출력
      tv.chUp(); //부모 객체의 채널올리기 메소드 출력
      tv2.volUp(); //자식1 객체 부모의 볼륨올리기 메소드 출력
      st.netflix(); //자식2 객체의 넷플릭스모드 메소드 출력
   }
}
