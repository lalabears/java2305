package j0530;

import java.util.Scanner;

public class C0530_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		String input = scan.next();
		
		for(int i = 0 ; i<input.length();i++){
			
			if(input.charAt(i) >='a' && input.charAt(i) <='z') {
				System.out.print((char)(input.charAt(i)-32));
			}else if(input.charAt(i) >='A' && input.charAt(i) <='Z'){
				System.out.print((char)(input.charAt(i)+32));
			}
			
		}
		System.out.println();
		String str = "ABCDEF";
		System.out.println(str.toUpperCase());
		String str2 = "abcdef";
		System.out.println(str2.toLowerCase());
//		char input = scan.next().charAt(0);
//		
//		// Q. 소문자 -> 대문자, 대문자 -> 소문자
//		if((input >='a' && input <='z')) {
//			System.out.println((char)(input-32));
//		}else if(input >='A' && input <='Z'){
//			System.out.println((char)(input+32));
//		}else {
//			System.out.println("잘못입력하셧습니다. ");
//		}
		
		
//		// 소문자를 입력하면 대문자를 출력하세요 a=97 A=65 0=48
//		System.out.println("소문자입력");
//		char input = scan.next().charAt(0);
//		System.out.println((char)(input-32));
		
	}

}
