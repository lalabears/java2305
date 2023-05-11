package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
		
		int input1 = 0 ;
		int input2 = 0 ;
		char ch = ' ';
		
		Scanner scan = new Scanner(System.in);
						
		System.out.println("숫자1 입력하세요 ");
		input1 = scan.nextInt();
		System.out.println("숫자2 입력하세요 ");
		input2 = scan.nextInt();
		System.out.println("사칙연산을 입력하세요 ");
		ch = scan.next().charAt(0);
		
		
		
		switch(ch) {
		case '+':
			System.out.println(input1+input2);
			break;
			
		case '-':
			System.out.println(input1-input2);
			break;
			
		case '*':
			System.out.println(input1*input2);
			break; 
			
		case '/':
			System.out.println(input1/(double)input2);
			break; 
		
		default:
			System.out.println("잘못입력하셨습니다");
			
}
		

	}

}
