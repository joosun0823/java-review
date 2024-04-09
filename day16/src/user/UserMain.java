package user;

public class UserMain {
	public static void main(String[] args) {
		UserService us = new UserService();
		UserVO user1 = new UserVO("asd","1234","김주선",25);
		UserVO user2 = new UserVO("asds","123","긴주선",21);
		UserVO user3 = new UserVO("asdfg","1231","긴주선",21);
		us.idDuplicate("asdf");
		System.out.println(us.idDuplicate("asdf"));
		
		us.join(user1);
		us.join(user2);
		us.join(user3);
		
		System.out.println(us.idDuplicate("asd"));
		
		us.login("asd", "1234");
	}
}
