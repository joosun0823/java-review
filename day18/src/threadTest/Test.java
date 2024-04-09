package threadTest;

public class Test implements Runnable{
	//필드
	private int number;

	public Test() {
		super();
		this.number = 100;
	}

	//run메소드 오버라이딩
	@Override
	public /*synchronized*/ void run() {
		//run 메소드에서 동기화 처리 시 싱글쓰레드로 작동된다
		for(int i = 0; i < 5; i++) {
			sub(10);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//메소드
//	public void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + ": - " + number);
//		System.out.println("현재 number : " + this.number);
//	}
	
	//sub메소드에 동기화 키워드를 붙이면 => 동기화 메소드
//	public synchronized void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + ": - " + number);
//		System.out.println("현재 number : " + this.number);
//	}
	
	//동기화 블록 이용
	public void sub(int number) {
		String name = Thread.currentThread().getName();
		synchronized(this) {
			this.number -= number;			
		}
		System.out.println(name + ": - " + number);
		System.out.println("현재 number : " + this.number);
	}
}
