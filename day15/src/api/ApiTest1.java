package api;

import java.util.Random;

public class ApiTest1 {
	public static void main(String[] args) {
		//내부 api
		//Random 클래스
		Random random = new Random();
		
		//nextInt(n) : n미만의 랜덤정수를 반환
		int num = random.nextInt();
		System.out.println(num);
		int num2 = random.nextInt(10);
		System.out.println(num2);
		
		//Math클래스
		//ceil() 올림
		System.out.println(Math.ceil(9.3));
		//floor() 내림
		System.out.println(Math.floor(9.9));		
		//round() 소수점 첫째 자리에서 반올림
		System.out.println(Math.round(9.5));		
	}
}
