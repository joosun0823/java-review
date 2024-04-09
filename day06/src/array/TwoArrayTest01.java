package array;

public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] twoAr;
		twoAr = new int[4][4];
//		
//		System.out.println(twoAr);
//		System.out.println(twoAr[0]);
//		System.out.println(twoAr[0][0]);
//		System.out.println(twoAr[0][1]);
//		System.out.println(twoAr[0][2]);
//		System.out.println(twoAr[1][0]);
//	    System.out.println(twoAr[1][1]);
//	    System.out.println(twoAr[1][2]);
//	    System.out.println(twoAr[2][0]);
//	    System.out.println(twoAr[2][1]);
//	    System.out.println(twoAr[2][2]);
		
		 for(int i = 0; i < 4; i++) { //행을 의미
	         for(int j = 0; j < 4; j++) { //열을 의미
//	            System.out.println("i = " + i + ", j = " + j);
	            twoAr[i][j] = i * 4 + j + 1;
	            System.out.print(twoAr[i][j] + "\t");
	         }
	         System.out.println();
	      }

		
		


	}
}
