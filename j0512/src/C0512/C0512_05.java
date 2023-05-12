package C0512;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
//		int[] data = {0,10,20,30,40,50,60,70,80,90};
		String[] data = {"0","10","20","30","40","50","60","70","80","90"};
		
		
		String[] binary = {"0000","0001","0010","0011",
							"0100","0101","0110","0111",
							"1000","1001","1010","1011",
							"1100","1101","1110","1111"	};
		
		
		
		for(int i = 0 ; i< num.length; i++) {
			System.out.println("번호입력 : ");
			num[i] = scan.nextInt();
		}
		
		
		
		
		
		
		
//		//10진수를 2진수로 
//		
//		String[] binary = {"0000","0001","0010","0011",
//							"0100","0101","0110","0111",
//							"1000","1001","1010","1011",
//							"1100","1101","1110","1111"	};
//		
//		int[] num = new int[4];
//		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		for(int i = 0 ; i< num.length; i++) {
//			System.out.println("번호입력 : ");
//			num[i] = scan.nextInt();
//		}
//		
//		System.out.println("10진코드 출력");
//		for(int i = 0 ; i< num.length ; i++) {
//			System.out.print(num[i]+" ");	
//		}
//		System.out.println();
//		System.out.println("2진코드 출력");
//		for(int i = 0 ; i< num.length ; i++) {
//			System.out.print(binary[num[i]]+" ");	
//		}
		
		

	}

}
