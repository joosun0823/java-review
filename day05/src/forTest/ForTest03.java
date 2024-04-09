package forTest;

public class ForTest03 {
	public static void main(String[] args) {
		//초기식 : int i =0
		//1~100 짝수만 출력 tab키 적용
		//A~F 출력
		//aBcDe...Z출력
		
		//초기식 i=0
		//조건식 i<100
		//증감식	i++
		
		//조건식: i<= 100; or i<= 50;
		//증감식 i++ or i+=2
		//조건문 if(i%2==0 && i!=0)
		for(int i=0; i<=100; i++) {
			if(i%2==0 && i!=0) {
				System.out.print(i+"\t");
			}
		}	
		
//		-------------------------------------------
		
		
		////ABCDEF
		
		//초기식 i=0
		//조건식 i<100
		//증감식 i++
		//유니코드 이용해서해야됨
		//인트를 문자열로 형변환
		
//		
//		for(char c = 'A'; c <= 'F'; c++) {
//			System.out.println(c);
//		}

		
		
		int al = 'F';//65~70
		System.out.println("\n"+al);
		
		for(int i=0; i<=5; i++) {
			System.out.print((char)(i+65));
		}
		
		System.out.println();

		
//		-------------------------------------------
		
		
		//aBcDeF....Z
		
		for(int i=0; i<26; i++) {
			if(i%2 ==0) {
				System.out.print((char)(i+97));
			} else {
				System.out.print((char)(i+65));
			}
			
//			System.out.print((char)(i%2==0 ? i+97 : i +65));
		}
		
		
	}
}



