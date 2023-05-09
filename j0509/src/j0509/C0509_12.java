package j0509;

import java.util.Scanner;

public class C0509_12 {

	public static void main(String[] args) {
		
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영문자를 입력하세요");
		ch = scan.next().charAt(0);
		
		// a(97)  
		String str = ( (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <='z') ) ? "영문자" : "영문문자가 아님";
//		String str = ( ch >= 'a' && ch <='z' ) ? "영문 소문자" : "영문소문자가 아님";
		System.out.println(str);
		
		

	}

}
