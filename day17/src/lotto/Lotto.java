package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	//필드
	HashSet<Integer> number;
	

	//생성자
	public Lotto() {
		super();
		this.number = new HashSet<>(); //미리 hashSet 생성
		
	}	
	
	
	//로또 번호 생성 메소드
	void createNumber() {
		Random r = new Random();//랜덤 생성자
		
		for(int i = 0; i < 6; i++) {
			int num = r.nextInt(45)+1; //1~45까지 숫자 중 하나
			if(!number.contains(num)) {
				this.number.add(num); //number리스트에 포함되있지 않다면 리스트에 추가
				continue;
			}
			i--; //포함되있을 경우 한번더 실행시켜주기 위해 i를 -1해준다
		}
		ArrayList<Integer> lottoNum = new ArrayList<>(number);	
		Collections.sort(lottoNum);
		System.out.println(lottoNum);
	}
	
	
	
	//수를 입력받아 반복문으로 번호생성 메소드 호출
	//반복문에 넣으면 Set에 계속 쌓이기 때문에
	//중간에 한번씩 모든 요소 제거하고 다시 쌓아주기 위해
	//clear() 사용
	
	void round(int num) {
		for(int i = 0; i < num; i++) {
			number.clear();
			createNumber();	
		}
	}
	
	
}
