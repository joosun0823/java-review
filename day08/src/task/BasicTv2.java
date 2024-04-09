package task;

public class BasicTv2 {
   //필드
   String color; //색상
   int inch; //인치
   int price; //가격
   boolean power; //true : on, false : off
   int channel = 1; //채널
   
   //매개변수 3개 받는 생성자(색상, 인치, 가격)
   public BasicTv2(String color, int inch, int price) {
      this.color = color;
      this.inch = inch;
      this.price = price;
   }

      
   //매개변수 4개 받는 생성자(색상, 인치, 가격, 채널)
   public BasicTv2(String color, int inch, int price, int channel) {
      this.color = color;
      this.inch = inch;
      this.price = price;
      this.channel = channel;
   }
   
   //메소드
   //전원 켜는 메소드 powerOnOff() 매개변수 x, 리턴값 x
   void powerOnOff() {
      power = !power;
      //전원메소드 호출하면 키거나 끄기
      //true일때 켜짐 false일 때 꺼짐
      if(power) {
         System.out.println("tv 전원이 켜졌습니다");
      }else {
         System.out.println("tv 전원이 꺼졌습니다");
      }
   }
   
   //채널올리는 메소드 channelUp() 매개변수 x, 리턴값 o
   int channelUp() {
      return ++channel;
   }
   
   //채널내리는 메소드 channelDown() 매개변수 x, 리턴값 o
   int channelDown() {
      return --channel;
   }
   
}