package j0509;

import java.util.Scanner;

public class Class0509_07 {

	public static void main(String[] args) {
//		// 숫자를 입력받아 짝수인지 홀수인지 출력하세요 
//		
//		// 1. 변수선언
//		
//		int n = 0; 
//		
//		// 2. 입력
//		Scanner scan = new Scanner(System.in);
//		n = scan.nextInt();
//		
//		// 3. 출력 
//		String ans = (n%2==0) ? "짝":"홀";
//	
//		System.out.println(ans);

//		// 이항연산자 
//		
//		int num = 10; 
//		double num2 = 10; 
//		num = (int)(num+num2);
//		double num3= num + num2;
		
//		char ch = 'A';
//		int num = ch+1;
//		System.out.println(num);
//		System.out.println((char)num);
		
		// 대문자 입력시 소문자로 출력하시요 
		// 1. 변수 선언 
		char ch = ' ';
		
		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("대문자를 입력하세요");
		ch = scan.next().charAt(0); // 문자열에 첫번째 문자를 가져옴 
		
		// 3. 출력 
		System.out.println((char)(ch+32));
		
		
		
		
	}

}
