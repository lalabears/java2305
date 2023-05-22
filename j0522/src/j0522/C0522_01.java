package j0522;

import java.util.Scanner;

public class C0522_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 두 수를 입력받아 더하기, 빼기, 곱하기, 나누기
		// 생성자 활용
		
		
		System.out.println("입력:");
		int num1 = scan.nextInt();
		System.out.println("입력:");
		int num2 = scan.nextInt();
		
		int data1 = num1+num2;
		int data2 = num1-num2;
		int data3 = num1*num2;
		int data4 = num1/num2;
		
		
		System.out.printf("%d+%d=%d\n",num1,num2,data1);
		System.out.printf("%d-%d=%d\n",num1,num2,data2);
		System.out.printf("%d*%d=%d\n",num1,num2,data3);
		System.out.printf("%d/%d=%d\n",num1,num2,data4);
		
		
		
		
		
		

	}

}
