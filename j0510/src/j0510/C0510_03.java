package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		

		// m,f (M,F) 문자로 입력받아 남자, 여자 출력하기  
		
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요 ");
		input = scan.next();
		
		if(input.equals("m") || input.equals("M")) {
			System.out.println("남자입니다");
		}else if(input.equals("f") || input.equals("F")) {
			System.out.println("여자입니다");
		}else {
			System.out.println("잘못입력하셧습니다");			
		}
		
		// 입력한 숫자가 1,6,9 만 입력받아 출력하세요 1입니다. 6입니다. 9입니다. 
		
		
//		int input = 0 ; 
//		Scanner scan = new Scanner(System.in);
//				
//		System.out.println("숫자를 입력하세요 ");
//		input = scan.nextInt();
//
//		if(input == 1) {
//			System.out.println("1");
//		}else if(input == 6){
//			System.out.println("6");
//		}else {
//			System.out.println("9");
//			
//		}
//		
//		
		
		
		
//		int input = 0 ; 
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("점수를 입력하세요 ");
//		input = scan.nextInt();
//		
//		if(input>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
	}

}
