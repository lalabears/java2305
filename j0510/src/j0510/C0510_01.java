package j0510;

import java.util.Scanner;

public class C0510_01 {

	public static void main(String[] args) {

		
		
		int i  = 1; 
		i = i + 2; 
		i += 2; 
		i ++;
		i += 1; 
		i = i *5; 
		i *= 5; 
		
		
		// 입력한 글자가 문자인지 파악하는 프로그램
		// 1.변수선언, 
		char input = ' ';
		Scanner scan = new Scanner(System.in);
		// 2. 입력, 
		System.out.println("문자를 입력하세요 : ");			
		input = scan.next().charAt(0);
		System.out.println(input);
		// 3. 비교, 
		String result = ((input>='a' && input <='z') || (input>='A' && input <='Z')) ? "영문자":"영문자아님";
		
		// 4. 출력
		System.out.println(result);
		
		
		
		
//		char input = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요 : ");
//		
//		input = scan.next().charAt(0);
//		System.out.println(input);
//		
		
	}

}
