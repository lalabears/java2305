package j0510;

import java.util.Scanner;

public class C0510_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 0; 
//		int sum = 0; 
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i = 0; i<10; i++) {
//			System.out.println("enter num :");
//			n = scan.nextInt();
//			sum += n;
//		}
//		System.out.println(sum);

		
	
		int i = 0;
		int n = 0; 
		int sum = 0; 
		
		Scanner scan = new Scanner(System.in);
		
		while(i<10) {
			System.out.println("enter num :");
			n = scan.nextInt();
			sum += n;
			i++;
		}
		
		System.out.println(sum);
	}

}
