package exceptionTask;


public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account();
		
		//try ~ catch : alt + shift + z 단축키
		try {
			ac.deposit(2000); //입금
			ac.withdraw(5000); //출금
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		
		
//		메소드에 try catch 썼을 때
//		ac.deposit(200);
//		ac.withdraw(5000);
		
	}
}
