package j0517;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C0517_03 cC0517_03 = new C0517_03();
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();
		
		int r = cC0517_03.add3(num[0], num[1], num[2]);

		System.out.println(r);
		
	}// main
	
	int add3(int a, int b, int c) {
		return a+b+c ;
	}

}
