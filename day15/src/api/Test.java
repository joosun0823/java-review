package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2();
		System.out.println(at);
		
		
		//try catch : alt shift z
		try {
			at.div(10,0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("0으로 나올 수 없습니다");
		}
		//예외처리
	}
}
