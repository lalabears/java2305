package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		// 랜덤으로 1-100 사이의 숫자를 생성해서 숫자를 맞추는 프로그램 구현 
		
		Scanner scan = new Scanner(System.in);
		int j = 0;
		int random = (int)(Math.random()*100)+1;
		int input = 0;

		
		while(j<10) {
			System.out.println(j+1+"회 입력 : ");
			input = scan.nextInt();
			if(random == input) {
				System.out.println("당첨");
				break;
			}
			j++;
		}
		
		System.out.println(random);
		
	}
	
	
	

}
