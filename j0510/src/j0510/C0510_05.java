package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		// 90이상이면 a 아니면 b
		int input = 0 ; 
		Scanner scan = new Scanner(System.in);
						
		System.out.println("점수를 입력하세요 ");
		input = scan.nextInt();
		
		if(input >= 90 ) {
			System.out.print("A");
			if(input>=97) {
				System.out.println("+");
			}else if(input <= 93) {
				System.out.println("-");
			}else {
				System.out.println();
			}
		}else if(input >= 80 )  {
			System.out.println("B");
		}else if(input >= 70 )  {
			System.out.println("C");
		}else if(input >= 60 )  {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		// 97점 이상 A+ 93점 이상 A- 
		
		
	}

}
