package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// 복습
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요 >> ");
		char ch = scan.next().charAt(0);
		
		if (ch>='A' && ch <='Z') /// 대문자
			System.out.println((char)(ch+32));
		else
			System.out.println((char)(ch-32));
		// 대문자를 입력하면 소문자로 , 소문자를 입력하면 대문자로 (if사용)

	}

}
