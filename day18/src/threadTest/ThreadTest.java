package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		//MyThread 객체 t1,t2생성
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
		//start()메소드로 실행시켜야 멀티쓰레드로 동작한다
		//run() 메소드는 단순히 재정의한 코드를 실행시킨것이다
//		t1.run();
//		t2.run();
		
		t1.start();
		t2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
