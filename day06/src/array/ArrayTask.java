package array;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		// 1.3명의 학생 java 점수를 입력받아 배열에 저장하고
		// 평균점수 출력하기

		// 입력클래스
		// 입력 받을 점수 3개 => 크기 3인 배열 생성
		// "숫자 입력" 출력
		// for문으로 입력 메소드를 써서 배열에 넣어줌
		// 배열에 넣어준 값 총합 변수 선언
		// 총합으로 평균값 출력

		Scanner sc = new Scanner(System.in);
		//입력클래스
		int[] ar = new int[3];
		//크기가 3인 배열 변수 ar 선언
		int total = 0;
		//총합 변수 total 기본값 0

		System.out.println("숫자 입력: ");

		for (int i = 0; i < ar.length; i++) {
			//입력한 값 배열 ar에 순서대로 넣어줌
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			total += ar[i];
			//배열의 총합 구하기
			
		}

		System.out.println(total);
		System.out.println((double) (total / ar.length));

//		===========================

		// 1) 변수, 배열(int 총합, String 번학생 점수), int 배열 3칸 선언
		// 2) 반복문(for문 - 점수 입력받을 반복문)
		// 3) 반복문(for문 - 합계 구할 반복문)
		// 4) 평균 출력(총합/배열명.length)

		int total1 = 0;
		int[] score = new int[3];
		String msg = "번 학생의 java 점수: ";
		Scanner sc2 = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + msg);
			score[i] = sc2.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			total1 += score[i];
		}

		System.out.println(total1);

//	=================================================	

		// 2. 0,1,2,3,4,0,1,2,3,4 배열에 담고 출력하기
		// 단, 칸수를 이용해서 배열 생성

		// 크기가 10인 배열 생성
		// 반복문 (int i = 0, i < length, i++){
		// if(i >= 5) {
		// 조건문
		// }
		// }

		int[] ar1 = new int[10];
		//크기가 10인 ar1 배열 선언
		for (int i = 0; i < ar1.length; i++) {
			//조건문 i 기본값 0선언 배열길이보다 작고 증감연산자
			ar1[i] = i;
			//ar1배열에 값 대입
			if (i >= 5) {
				ar1[i] = i - 5;
				//i가 5보다 클때 i에서 5뺀 값을 대입
			}
		}
		
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}

//	================================================

		// 1)배열3칸 생성
		// 2)반복문 (for
		// 3)나머지 연산자를 이용(5개마다 값이 반복됨)
		// 4)반복문(출력을 위한 for문)

		int[] ar3 = new int[10];
		//크기가 10인 정수형 배열 ar3 선언
		
		for (int i = 0; i < ar3.length; i++) {
			//정수형 변수 i 기본값 , ar3배열길이보다 작고 증감연산자
			//ar3 배열에 i를 5로 나눈 나머지값 대입
			ar3[i] = i % 5;
		}
		

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "");
		}

//		===================================

		// 3. A~F까지 중 c만 제외하고 배열에 담고 출력하기

		// 크기가 5인 배열 생성

		int[] ar2 = new int[5];
//		
//		for (int i=0; i<= ar2.length; i++) {
//			ar2[i] = (char) (i+65);
//			
//			if( i == 3) {
//				continue;
//			}
//		}

//		=====================================

		// 1) 문자형 배열 생성 5칸
		// 2) 임시 변수 정수형
		// 3) 반복문(for문)
		// 4) 임시변수 = i
		// 5) if (i > 1)
		// 6) 임시변수++;
		// 7) 배열에 값대입 => 배열[i] = (char) (temp + 65)

		char[] ar4 = new char[5];
		//크기가 5인 문자형배열 ar4 선언
		int temp = 0;
		//정수형 변수 temp 기본값
		for (int i = 0; i < ar4.length; i++) {
			//정수형 변수 i 기본값 ar4 배열길이 증감연산자
			temp = i;
			//temp 변수에 i값 대입
			if (temp > 1) {
				temp++;
				//temp의 값이 1보다 클 때 1씩 증가
			}
			ar4[i] = (char) (temp + 65);
		}

		
		for (int i = 0; i < ar4.length; i++) {
			System.out.println(ar4[i]);
		}		
		
//		====================================

		// 4. 5칸의 정수배열을 만들고 입력받아 최대값과 최소값 출력하기
		
		//1) 정수형 배열 5칸
		//2) 입력클래스 import
		//3) 변수 String msg; int min, max;
		//4) 반복문(for문) - 입력받기 위한 반복문
		//5) min = 배열[0], max = 배열[4]
		//6) 반복문(for문) - 조건문(if문 최소값, if문 최대값)
		//7) 출력
		
		int[] ar5 = new int[5];
		
	      Scanner sc3 = new Scanner(System.in);

	      for(int i = 0; i < ar5.length; i++) {
	         ar5[i] = sc.nextInt();
	      }
	      int min = ar5[0], max = ar5[0];
	      for(int i=0; i < ar5.length; i++) {
	         if(min > ar5[i]) {
	            min = ar5[i];
	         }
	         if(max < ar5[i]) {
	            max = ar5[i];
	         }
	      }
	      
	      System.out.println("최대값 : " + max);
	      System.out.println("최소값 : " + min);

		
	}
}
