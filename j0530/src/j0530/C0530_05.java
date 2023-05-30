package j0530;

import java.util.Scanner;

public class C0530_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "abc";
		System.out.println(str+1);
		
		StringBuffer sb = new StringBuffer("abc");
//		sb = sb+1;
		sb = sb.append(1);
		System.out.println(sb);
		
		
		
		
	}

}
