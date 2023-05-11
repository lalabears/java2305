package j0510;

import java.util.Scanner;

public class C0510_04 {

	public static void main(String[] args) {

		// m,f (M,F) 문자로 입력받아 남자, 여자 출력하기 - charAt() 사용 


		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요 ");
		input = scan.next();

		
		switch(input) {
		case "m":
		case "M":
			System.out.println("남");
			break;
		default:
			System.out.println("잘못입력하셨습니다");
		}
		
		
//		int input = 0 ; 
//		Scanner scan = new Scanner(System.in);
//						
//		System.out.println("숫자를 입력하세요 ");
//		input = scan.nextInt();
//
//		switch(input) {
//		case 1:
//			System.out.println("1");
//			break;
//			
//		case 6:
//			System.out.println("6");
//			break;
//			
//		case 9:
//			System.out.println("9");
//			break; 
//			
//		default:
//			System.out.println("other");
//			
//		}
		
		
//		if(input == 1) {
//					System.out.println("1");
//		}else if(input == 6){
//					System.out.println("6");
//		}else {
//					System.out.println("9");
//		}
	}

}
