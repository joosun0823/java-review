package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ArrayListTask {
	public static void main(String[] args) {
		//1부터 20까지의 난수를 만들어서 ArrayList에 5개만 저장한다
		//nextInt(20) -> 0부터 19까지의 값
		//nextInt(20) + 1 -> 1부터 20까지의 값
		
		//1. 중복 X
		//2. 정렬
		
		ArrayList<Integer> list = new ArrayList<>();
		Random random  = new Random();
		
		
//		for(int i = 0; i < 5; i ++) {
//			int num = random.nextInt(20)+1;
//			if(!list.contains(num)) {
//				list.add(num);
//				continue;
//			}
//			i--;
//		}
//
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		
		while ( list.size() < 5 ) {
			int num = random.nextInt(20)+1;
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
}
