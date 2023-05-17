package j0517;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		C0517_02  c = new C0517_02();
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(10/(double)3);
		
		
		int[] num = new int[2];
		for(int i = 0 ; i <num.length;i++) {
			System.out.println((i+1)+" 번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		
		System.out.println("두수의 합은 : "+c.add(num[0],num[1]));
		System.out.println("두수의 차는 : "+c.sub(num[0],num[1]));
		

	}// main
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	int sub(int num1, int num2) {
		return num1-num2;
	}

}
