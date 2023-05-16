package j0515;

import java.util.Scanner;

public class C0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 5 by 5 배열 만들기 
		int[][] box = new int[5][5];
		int[] num = new int[25];
		String[][] box1 = new String[5][5];
		for(int i = 0; i<num.length;i++) {
			num[i]=i+1;
			
			
		}
		int random=0, temp=0;
		for(int i = 0; i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0]=num[random];
			num[random] = temp; 	
		}
		
		
		for(int i = 0; i<box.length;i++) {
			for(int j = 0; j<box[i].length;j++) {
		
				box[i][j] = num[i*box[i].length+j]; //0-19
				box1[i][j] = ""+num[i*box[i].length+j]; //0-19
			}
		}
		
		
		
		while(true) {
			
			for(int i = 0; i<box[0].length;i++){
				System.out.print("\t"+i);
				
			}
			
			
			
			
			
			System.out.println();
			System.out.println("----------------------------------");
			
			
			for(int i = 0; i<box1.length;i++) {
				System.out.print(i + "|\t");
				for(int j = 0; j<box1[i].length;j++) {
					System.out.print(box1[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("----------------------------------");
			
			System.out.println("좌표를 입력하세요 ");
			int input = scan.nextInt();
			loop: for(int i = 0; i<box1.length;i++) {
				for(int j = 0; j<box1[i].length;j++) {
					if(box1[i][j].equals(input+"")) {
						System.out.println(i+","+j);
						box1[i][j]="X";
						break loop;
					}
						
				}
			}
			
			
			
		} // while
	}

}
