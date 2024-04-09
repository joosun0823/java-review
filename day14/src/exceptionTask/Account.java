package exceptionTask;


public class Account {
//은행계좌 클래스
	
//필드 : 잔고 balance private
	private int balance;

	

	//생성자 : 기본 생성자 추가
	public Account() {
		super();
		this.balance = 2000;
	}
	
	//set
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//get
	public int getBalance() {
		return balance;
	}
	
	
//출금메소드 : withdraw 매개변수 1개
	void withdraw(int money) throws MyException{
		if( this.balance < money ) {
			throw new MyException((money-this.balance) + "원이 부족합니다");
			
//			메소드에 예외 처리를 미리 정의 해놓았을 때
			
//			try {
//				throw new MyException((money-this.balance) + "원이 부족합니다");
//			} catch(MyException e) {
//				System.out.println(e.getMessage());
//			}
//			
			
		} else {
			int result = this.balance - money;
			System.out.println(money + "를 출금하여 현재 잔고는 " + result + "원입니다");			
		}
	
	}
	
// 잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는_ 원입니다. 출금 금액의 _원이 부족하여 출금 불가능합니다
	


	//입금메소드 : deposit 매개변수 1개
// 잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력
	void deposit(int money) {
		int result = this.balance + money;
		System.out.println("현재 잔고는 " + result + "원입니다");
	}
	
	
// 모든 예외처리는 메소드를 사용하는 쪽으로 던지기
	
	//AccountMain 클래스
//	메인메소드
//	입금메소드 호출
//	출금메소드 호출
	
	//사용자 예외 정의 클래스
	//MyException extends Exception
}
