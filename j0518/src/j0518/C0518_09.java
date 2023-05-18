package j0518;

import java.util.Scanner;

public class C0518_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 자판기 프로그램 
		// 1. 밀크커피(300) 2.헤이즐럿커피(500) 3.블랙커피(350) 4.코코아(300) 5.밀크(400) 6.잔액충전
		int choice = 0;
		int myMoney = 1000;
		
		loop:while(true) {
			
			System.out.println(" [ 우리동네 자판기 ] ");
			System.out.println(" 1.밀크커피(300원) ");
			System.out.println(" 2.헤이즐럿커피(500원) ");
			System.out.println(" 3.블랙커피(350원) ");
			System.out.println(" 4.코코아(300원) ");
			System.out.println(" 5.밀크(400원) ");
			System.out.println(" 6.잔액충전 ");
			System.out.println(" 0.프로그램종료 ");
			System.out.println("-------------------------");
			System.out.printf("현재 잔액: %,d ",myMoney);
			System.out.println("원하는 번호를 입력하세요 ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:// 1. 밀크커피(300) 
				myMoney = order(300, myMoney,"밀크커피");
				break;
			
			case 2://2.헤이즐럿커피(500) 
				myMoney = order(500, myMoney,"헤이즐럿커피");
				
				break;
				
			case 3://3.블랙커피(350)
				myMoney = order(350, myMoney,"블랙커피");
				break;
				
			case 4://4.코코아(300)
				myMoney = order(300, myMoney,"코코아");
				break;
				
			case 5:// 5.밀크(400)
				myMoney = order(400, myMoney,"밀크");
				break;
				
			case 6://6.잔액충전
				System.out.println("충전한 금액을 입력해주세요 ");
				int addMoney = scan.nextInt();
				if(addMoney>0) {
					System.out.println("결제 수단: 1. 카드결제");
					choice = scan.nextInt();
					if(choice == 1) {

						myMoney += addMoney;
						System.out.println(addMoney +"원 충전되었습니다. ");
						System.out.println("잔액은 : "+ myMoney +"원 입니다");
						
					}else {
						
						System.out.println(" [ 시스템 오류가 발생했습니다. 다시입력해주세요 ] ");
					}
				}
				
				break;
				
			
			
			case 0:
				System.out.println(" [ 프로그램 종료 ] ");
				break loop;
			default:
				System.out.println("잘못입력하셨습니다. ");
			}
			
			
		} // while - true
		
		
		
		
		
		
	}// main
	
	// 음료제조 메소드
static int order(int money, int myMoney, String title) {
		if(myMoney<money) {
			System.out.println("잔액이 부족합니다. ");
		}else {
			System.out.println(title+"가 자동으로 나옵니다 ");
			myMoney -= money;
		}
		return myMoney;
	}
	
	
	

}