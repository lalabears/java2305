package j0518;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5! = 5*4*3*2*1
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scan.nextInt();
		
		
		int result = 1;	
		
		for(int i = n ; i>0; i--) {
			result *= i ;
		}
		System.out.println(result);
		// 숫자를 입력받아. 해당되는 팩토리얼을 구현하세요 
		
		

	}

}
