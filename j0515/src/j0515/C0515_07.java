package j0515;

import java.util.Scanner;

public class C0515_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] arr = new int[5][5];
//		// 1 2 3
//		// 4 5 6
//		// 7 8 9 
//		for(int i = 0 ; i <arr.length;i++) {
//			for(int j =0 ;j<arr[i].length;j++) {
////				arr[i][j] = i*arr[i].length+j+1;
//				arr[i][j] = i*arr[i].length+j;
//				// i =0 j = 0 =>1
//				// i =0 j = 1 =>2
//				// i =0 j = 2 =>3
//				// i =1 j = 0 =>4
//				// i =1 j = 1 =>5
//				// i =1 j = 2 =>6
//				
//			}
//		}
//		// 출력
//		for(int i = 0 ; i <arr.length;i++) {
//			System.out.print(i+"번째 보물 |\t");
//			for(int j =0 ;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		
		
//		int[] arr = new int[6];
//		int count = 0;.
//		for(int i = 0; i<10;i++) {
//			// i = 0
//			// i = 1
//			// i = 3 i=4
//			if(i%3 == 0) continue; //3의배수 
//			arr[count] = i;
//			count++;
//		}
		
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		
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
			System.out.print(" |\t");
			for(int i = 0; i<box[0].length;i++){
				System.out.print(i+"\t");
				
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
			String input = scan.next();
			if(input.equals("-1")) {
				break;
			}
			int n1 = input.charAt(0)-'0';
			int n2 = input.charAt(1)-'0';
			System.out.println(n1);
			box1[n1][n2]="X";
			
			
			
		} // while
	}

}
