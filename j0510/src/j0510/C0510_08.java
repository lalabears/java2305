package j0510;

import java.util.Scanner;

public class C0510_08 {

	public static void main(String[] args) {
		

		
		// 1-100 사이의 랜덤숫자 1개를 출력하세요 
		int ran_num = (int)(Math.random()*100)+1;
//		System.out.println(ran_num);
		
		int input = 0 ; 
		Scanner scan = new Scanner(System.in);
		
		
		int i = 1; 
		while(i<=10) {
			System.out.println(i + "번째: 1-100 사이의 숫자를 입력해주세요");
			input = scan.nextInt();
			if(input == ran_num) {
				System.out.println("당첨"); 
				break;
			}else if(input>ran_num) {
				System.out.println("꽝 : 입력한 숫자보다 작은 수 입니다 ");
			}
			else {
				System.out.println("꽝 : 입력한 숫자보다 큰 수 입니다 ");
			}
			i++;			
		}
//		while(input != ran_num ) {
//			System.out.println("1-100 사이의 숫자를 입력해주세요"); 
//			input = scan.nextInt();
//			
//		}
//		System.out.println("당첨"); 
		
//		System.out.println("for");
//		for(int i = 1; i<=10; i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println("while");
//		
//		int i = 0 ; // 초기화
//		while(i<10) { //조건식
//			System.out.println(i);
//			i++; //증감식
//		}
//		
//		
//		for(int i = 10 ; i > 0 ; i=i-2) {
//			System.out.println(i);
//		}
		
//		for(int i = 0 ; i<=9 ; i++) {
//			for(int j = 1 ; j<=9 ; j++) {
//				System.out.printf("%d%d ",i,j);
//			}
//			
//		}
		
		
		
//		for(int i = 2 ; i<=9 ; i++) {
//			System.out.println("[ "+i+ " 단 ]");
//
//			for(int j = 1 ; j<=9 ; j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
//		
//		int sum = 0;
//		for(int i = 1; i<=10; i++)
//		{
//			sum = sum+i; 
////			System.out.println(i + ":" + sum);
//		}
//		System.out.println(sum);
//		
		
		
		
//		// 숫자를 3번 반복해서 입력받아 합을 출력
//		int num1=0,num2=0,num3=0;
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i = 1; i<4;i++)
//		{
//			System.out.println(i+"번째 숫자 입력");
//			num1 = scan.nextInt();
//			num2 +=num1;
//		}
//		
//		System.out.println(num2);
//		

	}

}
