package j0509;

import java.util.Scanner;

public class C0509_10 {

	public static void main(String[] args) {
		//
		
//		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		
//		System.out.println(result);

		
		double num = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요: ");
		num = scan.nextDouble();
		System.out.println((int)(num*10000)/10000.0);
		
	}

}
