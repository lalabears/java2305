package j0511;

import java.util.Scanner;

public class C0511_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
