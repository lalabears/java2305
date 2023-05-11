package j0511;

import java.util.Scanner;

public class C0511_04 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,sum=0;
		int n1 = 10, n2 = 2;
		int input = 0;
		loop: while(true) {
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			System.out.println("입력하세요 : >> ");
			
			input = scan.nextInt();
			
			
			switch(input) {
			case 1:
				while(true) {
					
					System.out.println(" [더하기]  ");
					
					System.out.println("첫번째 숫자를 입력해주세요(0:이전, 1:종료)");
					n1 = scan.nextInt();
					if(n1==0) break;
					else if(n1==1) break loop;
					
					System.out.println("두번째 숫자를 입력해주세요");
					n2 = scan.nextInt();
					
					
					System.out.printf("%d + %d = %d ", n1,n2,n1 + n2);
					System.out.println();
					
				}
				
//				break;
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
			case 0:
				break loop;
			default:
				System.out.println(" 숫자를 잘못입력하셨습니다  ");
				break;			
				
			}
			
			
			
			
		}
		
		
		
		
//		for(int i = 0 ; i <= 10 ; i++) {
//			if(i%2==1) continue;
//			System.out.println(i);
//		}
		
		
		
		// 구구단 출력. 5단만빼고 출력 
//		
//		
//		loop:for(int i = 2 ; i<=9 ; i++) {
////			if(i==6) break;
//			System.out.println("[ "+i+ " 단 ]");
//
//			for(int j = 1 ; j<=9 ; j++) {
//				if(j==6) break loop; // 제일 가까운 for문 나오기 
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}

		
		
		
		
//		for(int i = 2 ; i<=9 ; i++) {
//			if(i%2!=0) continue;
//			System.out.println("[ "+i+ " 단 ]");
//			
//			for(int j = 1 ; j<=9 ; j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
//		
		
		
//		
//		for(int i = 1 ; i<=9 ; i++) {
//			// System.out.println("[ "+i+ " 단 ]");
//			
//			for(int j = 2 ; j<=9 ; j++) {
//				if(j==5) continue;
//				System.out.printf("%d * %d = %d \t",j,i,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}
	

}
