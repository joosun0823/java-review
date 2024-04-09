package staticTest;

public class MathUtils {
	public static int getMax(int num1, int num2) {
		return (num1 > num2 ? num1 : num2); //삼항연산자
		//num1이 num2보다 클 때 num1 리턴, 작으면 num2 리턴
	}
	
	public static double round(double num) {
		return Math.round(num);
	}
	
}
