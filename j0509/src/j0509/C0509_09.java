package j0509;

import java.util.Scanner;

public class C0509_09 {

	public static void main(String[] args) {
		// 1개의 글자를 입력받아 숫자로 변환하시오 
		// "15784" 1 문자를 숫자로 변환 
		
		Scanner scan = new Scanner(System.in);
		
		char ch = ' ';
		System.out.println("문자열을 입력하세요 ");

		char input = scan.next().charAt(0); // charAt(n) n번째 문자를 가져옴 
		
		System.out.println(input);
		
		int result = input-'0'; // input-0 과의 차이 ? 
		
		String content = (result%2==0) ? "짝":"홀";
		System.out.println(content);
		
		
		
	}

}
