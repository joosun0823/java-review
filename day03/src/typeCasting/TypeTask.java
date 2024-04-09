package typeCasting;

public class TypeTask {
	public static void main(String[] args) {
		//1. 올해 년도, 월, 일을 정수형 타입의 변수로 만들고
		//올해는 0000년, 0월, 0일 입니다 형태로 출력하기
		int year = 2024, month = 3, date = 12;
		//정수형 변수 year, month, date 선언하고 각각 2024, 3, 12를 넣어줌
		System.out.printf("올해는 %d년, %d월 %d일 입니다\n", year, month, date);
		System.out.println("올해는 " + year+"년, "+ month + "월, " + date  + "일입니다");
		//"올해는 2024년 3월 11일입니다"가 나올수 있도록 출력
		//2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
	      //24라는 값만 출력하기
	      
//	      문자열타입 year2 변수(값 year + "")
//	      문자형타입 변수(2개 index2, index3 저장) charAt()
//	      출력
	      String year2 = year + "";
	      //문자열 변수 year2 선언 정수형 변수 year를 +""를 붙여 형변환 시켜주고 값으로 대입
	      System.out.println(year2);
	      //year2의 값을 콘솔에 출
	      char ch1 = year2.charAt(2);
	      //문자형 변수 ch1 선언 , year2의 값에 0에서부터 2번째 문자를 값으로 대입
	      char ch2 = year2.charAt(3);
	      //문자형 변수 ch2 선언 , year2의 값에 0에서부터 3번째 문자를 값으로 대입
//	      System.out.print(ch1);
//	      System.out.print(ch2);
	      System.out.printf("%c%c\n", ch1, ch2);
	      //형식지정자에 맞춰 ch1과 ch2를 넣어 콘솔에 출력
	      System.out.printf("%c%c", year2.charAt(2), year2.charAt(3));

		
		
		
	      //3. 1번에서 만든 변수들중 월, 일을 문자열로 바꿔서
	      // result 변수에 저장하고 실수(3.12)로 변환하여 출력하기
	      
//	      변수 2개선언(String 타입)
//	      변수선언(변수명 result 타입 String 값 문자열)
//	      실수로 Double.parseDouble(result)
	      
	      String month1 = month + ".";
	      //문자열 변수 month1을 선언 정수형변수 month를 +""을 붙여 형변환 시켜주고 값으로 대입
	      String date1 = date + "";
	      //문자열 변수 date1을 선언 정수형 변수 date를 +""을 붙여 형변환 시켜주고 값으로 대입
	      System.out.println("\n"+month1 + date1);
	      //줄바꿈+month1+date1의 값을 출력 문자열 변수여서 붙어서 나옴
	      String result1 = month1 + date1;
	      //문자열 변수 result1 을 선언하고 month1 + date1의 값을 대입
	      Double result = Double.parseDouble(result1);
	      //실수형 변수 result를 선언 문자형 변수인 result1을 실수형으로 형변환 시키고 값으로 대입
	      System.out.println(result);
	      //result의 값을 콘솔에 추출
		

		
	}
}
