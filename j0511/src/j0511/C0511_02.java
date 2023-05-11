package j0511;

import java.util.Scanner;

public class C0511_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);

		int n1 = 0 , n2 = 0; 
		
		while(true) {
			System.out.println(" [ 사칙연산 프로그램 ] ");
			System.out.println(" 1. 더하기  ");
			System.out.println(" 2. 빼기  ");
			System.out.println(" 3. 곱하기  ");
			System.out.println(" 4. 나누기  ");
			System.out.println(" 원하는 번호를 입력하세요 >>  (0종료) ");

			int num = scan.nextInt();
			
			if(num==0) break;
			System.out.println(" 연산 할 숫자 입력  ");
			System.out.println("첫번째 숫자를 입력해주세요");
			n1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력해주세요");
			n2 = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.println(" [더하기]  ");
				System.out.printf("%d + %d = %d ", n1,n2,n1 + n2);
				System.out.println();
				
				break;
			case 2:
				System.out.println(" [빼기]  ");
				System.out.printf("%d - %d = %d ", n1,n2,n1 - n2);
				System.out.println();
				break;
			case 3:
				System.out.println(" [곱하기]  ");
				System.out.printf("%d * %d = %d ", n1,n2,n1 * n2);
				System.out.println();
				break;
			case 4:
				System.out.println(" [나누기]  ");
				System.out.printf("%d / %d = %.2f ", n1,n2, n1/(double)n2);
				System.out.println();
				break;
			default:
				System.out.println(" 숫자를 잘못입력하셨습니다  ");
				break;			
				
			}
//			if(num == 1) {
//				System.out.println(" [더하기]  ");
//			
//			}else if(num == 2) {
//				System.out.println(" [빼기]  ");
//				
//			}else if(num == 3) {
//				System.out.println(" [곱하기]  ");
//				
//			}else if(num == 4) {
//				System.out.println(" [나누기]  ");
//				
//			}else{
//				break;
//				
//			}
		}
		
		
		
		
		
		
		
		
//		for(;;) {
//			System.out.println("enter num : ");
//			int num = scan.nextInt();
//			if(num == 0) break;
//			
//			
//		}
//		while(true) {
//			System.out.println("enter num : ");
//			int num = scan.nextInt();
//			if(num == 0) break;
//		}
		
		//		
//		int i = 10 ; 
//		do {
//			System.out.println("do-while : i = "+i);
//		}while(i<0);
//		
//		
//		while(i<0) {
//			System.out.println("while : i = "+i);
//		}

	}

}
