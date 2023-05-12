package C0512;

import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		//다차원 배열
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		
//		for(int i = 0; i <num.length ; i++)
//		{
//			System.out.println("점수를 입력하세요 >> ");
//			num[i] = scan.nextInt();
//		}
//		
//		
		boolean b = true;
		boolean b1 = false;
		boolean[] b2 = {true, true, false};
		
		int a = 1; 
		int[] a1 = {1,2,3};
		
		
		int[][] score = new int[3][4];
		
		for(int i = 0; i <score.length ; i++)
		{
			
			for(int j = 0 ; j < score[i].length ; j++) {
				
				System.out.println("점수를 입력하세요 >> ");
				score[i][j] = scan.nextInt();
			}
		}
		
		
		
		for(int i = 0; i <score.length ; i++)
		{
			
			for(int j = 0 ; j < score[i].length ; j++) {
				
				System.out.print(score[i][j] +" " );
				
			}
			System.out.println();
		}
		
		
		

	}

}
