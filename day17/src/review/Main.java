package review;

public class Main {
   public static void main(String[] args) {
      // UserVO 객체 생성
      // 필드는 private이지만 생성자를 통해서 값을 초기화할 수 있으므로 세터를 사용하지 않는다
      UserVO user = new UserVO("abc1", "1234", "홍길동", 20);
      System.out.println(user);

      // UserService의 객체 생성
      UserService service = new UserService();

      // 조건문 id 중복검사를 하고 true라면 회원가입 메소드 호출
      // 가입완료되었습니다 출력
      // id중복검사의 값이 false라면 이미 있는 아이디이므로 중복된 아이디가 존재합니다 출력
      if (service.checkId(user.getId())) {
         service.join(user);
         System.out.println(user.toString());
         System.out.println("가입완료되었습니다");
      } else {
         System.out.println("중복된 아이디가 존재합니다");
      }

      user = service.login("abc1", "1234");
      if (user != null) {
         System.out.println(user.getName() + "님 환영합니다");
      } else {
         System.out.println("로그인에 실패했습니다");
      }
   }
}
