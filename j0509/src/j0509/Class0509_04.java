package j0509;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하세요 
		// 문자열, 정수형, 문자열
		// 출력 : 
		// 아이디 패스워드 이름 
		// aaaa  1234  홍길동
		
		String id="";
		int pw = 0;
		String name="";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id : ");
		id = scan.next();
		System.out.println("pw : ");
		pw = scan.nextInt();
		System.out.println("name : ");
		name = scan.next();
		
		System.out.println("----------------------------------------------");
		System.out.println("id\tpw\tname");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%s",id,pw, name);
		System.out.println();
		
		
		// pw에 0을 출력하고싶으면 string 타입으로 받으면된다. 

	}

}
