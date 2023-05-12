package C0512;

import java.util.Scanner;

public class C0512_08 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		String[] title = {"국어","영어","수학","합계"};

		int[][] score = new int[2][4];
		
		for(int i = 0; i<score.length;i++) {
			int total = 0 ;
			System.out.println((i+1)+"번째 학생 : ");
			for(int j = 0 ;j<score[i].length-1;j++) {
				System.out.println(title[j] +" 점수를 입력하세요 >> ");
				score[i][j] = scan.nextInt();
				total += score[i][j];
								
			}
			score[i][score[i].length-1] = total;
		}
		
		
		
		
		for(int i = 0; i <title.length ; i++)
		{
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i <score.length ; i++)
		{
			
			for(int j = 0 ; j < score[i].length ; j++) {
				
				System.out.print(score[i][j] +"\t" );
				
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
