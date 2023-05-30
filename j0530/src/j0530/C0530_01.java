package j0530;

import java.util.Scanner;

public class C0530_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("복권을 입력하세요 >> (ex. 1조1234567)");
		String input1 = scan.next();
		
		String output1 = input1.substring(0,input1.indexOf("조"));
		String output2 = input1.substring(input1.indexOf("조")+1,input1.length());
	
		
		
		// output2 숫자가 무엇인지 맞춰보세요
		int output3 = Integer.parseInt(output2);
		int random = (int)(Math.random()*1000000)+1000000;
		// 1234567을 정수타입으로 변경후 for 문을써서 0-9999999까지 비교해보세요 
		
		for( int i = 1000000 ; i<9999999 ; i++) {
			if( i == random) {
				System.out.println("입력한 숫자 : "+ i);
			}
		}

		
		
		
		
		
		
		
		
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(random);


//		String str = new String("abc");
//		char a = 'a';
//		char b = 'b';
//		char c = 'c';
//		String str2 = "abc";
//		
//		System.out.println(str.charAt(0));
//		
//		
//		
//		String str3 = "abcdefg";
//		System.out.println(str3.substring(3, 5));
//		
//		String str4 = "안녕하세요.반갑습니다";
//		System.out.println(str4.substring(2, 5));
//		
		
		
		
		
		
		
		
		
	}

}
