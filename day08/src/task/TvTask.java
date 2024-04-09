package task;

import java.util.Scanner;

public class TvTask {
	public static void main(String[] args) {
		String msg = "1. 전원버튼\n" + "2. 채널 올리기\n"
				+ "3. 채널 내리기\n" + "0. 프로그램 종료\n" + "번호 입력: ";
		//객체는 tv라는 객체 1개 생성
		BasicTv tv = new BasicTv("black", 75, 500, 1);
		//while문을 통해서 프로그램을 무한반복
		//사용자에게 옵션메뉴를 출력하고 번호를 입력받는다
		//선택한 옵션에 따라 수행한다
		//1번 선택시 : Tv전원을 on,off한다 => 켜졌을 경우 Tv전원이 켜졌습니다 출력
		//			꺼졌있을 경우 Tv전원이 꺼졌습니다 출력
		//2번 선택시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 올린 채널 출력
		//			꺼져있을 경우 Tv전원을 먼저 켜주세요 출력
		//3번 선택시 : Tv전원이 켜져있을 겨우 현재 채널을 출력하고 내린 채널 출력
		//			꺼져있을 경우 Tv전원을 먼저 켜주세요 출력
		//0번 선택시 : 프로그램 종료한다
		//그외 선택시 : 다시 번호를 입력하세요
		
		int num =  0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//while true 무한반복
			System.out.println(msg);
			num = sc.nextInt();
			//입력메소드
			switch (num) {
			//스위치문
			case 1:
				//num이 1일 때 전원버튼 메소드 호출
				tv.power = !tv.power;
				tv.powerOnOff();
				break;
			case 2:
				//num이 2일 때 채놀올리기 메소드 호출
				tv.channelUp();
				break;
			case 3:
				//num이 3일 때 채널내리기 메소드 호출
				tv.channelDown();
				break;
			case 0:
				//num이 0일 때 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default:
				//num이 0,1,2,3이 아닌 값일 때 출력
				System.out.println("다시 번호를 입력하세요");
				break;
			}
		}
		

		
		
	}
}
