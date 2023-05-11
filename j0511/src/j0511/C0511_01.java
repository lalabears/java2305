package j0511;

import java.util.Scanner;

public class C0511_01 {

	public static void main(String[] args) {
		// hw
		
		int i = 0;
//		int n = 0; 
//		int sum = 0; 
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(i<10) {
//			System.out.println("enter num :");
//			n = scan.nextInt();
//			sum += n;
//			i++;
//		}
//		
//		System.out.println(sum);
		
		
		// 구구단을 출력하세요 
		// 단 표시
		// 가로로 출력되게 
		for(i = 1 ; i<=9 ; i++) {
		  // System.out.println("[ "+i+ " 단 ]");

		for(int j = 2 ; j<=9 ; j++) {
			System.out.printf("%d * %d = %d \t",j,i,i*j);
		}
		System.out.println();
	}
		

	}

}
