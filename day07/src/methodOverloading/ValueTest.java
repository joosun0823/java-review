package methodOverloading;

public class ValueTest {
	public static void main(String[] args) {
		ValueTest vt = new ValueTest();
		
		int num = 1;	//기본자료형
		int[] arr = {1};  //reference 타입
		
		//변수 자체를 보냄(call by value)
		vt.add_value(num); //101
		System.out.println(num); //1 : 값 변화가 없다
		
		//배열 자체를 보냄(call by reference)
		vt.add_reference(arr);
		System.out.println(arr[0]); //101 : 값이 변화한다
		
	}
	
	void add_value(int num) {
		//100을 더하는 메소드
		num += 100;
		System.out.println(num);
	}
	
	void add_reference(int[] arNum) {
		//배열에 0번째 인덱스에 100더하는 메소드
		arNum[0] += 100;
		System.out.println(arNum[0]);
	}
	
}
