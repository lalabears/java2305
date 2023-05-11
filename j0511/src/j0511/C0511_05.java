package j0511;

import java.util.Scanner;

public class C0511_05 {

	public static void main(String[] args) {
		// 1. 랜덤 숫자 생성
		// 2. 숫자 맞추기 10까지 사용
		// 0. 종류
		
		
		Scanner scan = new Scanner(System.in);
		int random = 0 , input = 0 , num = 0; 
		int count = 1;
		random = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.println(" [ 숫자맞추기 프로그램 ] ");
			System.out.println(" 1. 랜덤숫자 생성 ");
			System.out.println(" 2. 숫자맞추기 게임 ");
			System.out.println(" 3. 종료 ");
			System.out.println(" ------------------ ");
			System.out.println(" 원하는 번호를 입력하세요 >> ");
			
			input = scan.nextInt();
			
			
			switch(input) {
			case 1:
				// 1- 100 까지 랜덤숫자 생성 
				random = (int)(Math.random()*100)+1;
//				System.out.println(random);
				System.out.println("랜덤숫자가 생성되었습니다. ");
				break;
			case 2:
				count = 1;
				while(count<4) {
					System.out.println("1-100까지 숫자를 입력하세요  "+ (count) +"차시도");
					count++;
					num = scan.nextInt();
					if(input == random)	{
						System.out.println("정답");
						break;
					}else{
						System.out.println("오답");
						if(count ==3) System.out.println("정답"+random);
					}//if
				}		// while			
				break;
				
			case 3:
				break;
			default:
				System.out.println("잘못입력하셨습니다. ");
				break; 
			}
			
		} // while
		
		
		

	} //main

} // class 
