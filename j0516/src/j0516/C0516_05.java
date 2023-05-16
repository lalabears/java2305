package j0516;

import java.util.Scanner;

public class C0516_05 {

	public static void main(String[] args) {
		// 리모콘
		// 1,2,3,4,5  채널
		// 채널up, 채널down, 이전보기, 자막 
		// 볼륨up, 볼륨down, 음소거
		// 전원
		Scanner scan = new Scanner(System.in);
		Tv t = new Tv();
		int choice = 0;
		int tmpVol = 0;
		
		while(true) {
			System.out.println("[리모콘 프로그램]");
			System.out.println("1. 전원 on/off");
			System.out.println("2. 채널 up ");
			System.out.println("3. 채널 down ");
			System.out.println("4. 볼륨 up ");
			System.out.println("5. 볼륨 down ");
			System.out.println("6. 음소거 ");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 전원버튼
				t.power();
				if(t.power==true) {
					System.out.println("전원 ON");					
				}else {
					System.out.println("전원 OFF");										
				}
				System.out.println();
				break;
			case 2: // 채널 업
				if(t.power==false) {
					System.out.println("전원을 ON 해 주세요");
					break;
				}
				t.channelUp();
				System.out.println("현재 채널 : "+t.channel);
				System.out.println();
				break;
				
			case 3: // 채널 다운
				if(t.power==false) {
					System.out.println("전원을 ON 해 주세요");
					break;
				}
				t.channelDown();
				System.out.println("현재 채널 : "+t.channel);
				System.out.println();
				break;
			
			case 4: //볼륨 업
				if(t.power==false) {
					System.out.println("전원을 ON 해 주세요");
					break;
				}
				t.volumeUp();
				System.out.println("현재 볼륨 : "+t.volume);
				System.out.println();
				break;
				
			case 5: // 볼륨 다운
				if(t.power==false) {
					System.out.println("전원을 ON 해 주세요");
					break;
				}
				t.volumeDown();
				System.out.println("현재 볼륨 : "+t.volume);
				System.out.println();
				break;
			case 6: // 음소거
				
				if(t.volume==0) {
					t.volume = tmpVol;
					System.out.println("음소거 해제");
					
				}else {
					tmpVol = t.volume; 
					t.volume = 0; 
					System.out.println("음소거 실행");
				}
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				
			}
		}

	}

}
