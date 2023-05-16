package j0515;

import java.util.Scanner;

public class C0515_02 {

	public static void main(String[] args) {
		// 10개의 상자 중 3개가 보물 
		// 보물을 찾아내는 게임 
		
		Scanner scan = new Scanner(System.in);
//		int[] box = new int[10];
		int[] box = {0,0,0,0,0,0,0,1,1,1};
		int num=0;
		
		// 섞기 
		int temp = 0 ,random=0;
		for(int i = 0; i<100;i++) {
			random = (int)(Math.random()*10);
			temp = box[0];
			box[0]=box[random];
			box[random] = temp; 	
		}
		
		
		String[] arr = new String[10];
		for(int i =0 ; i<10;i++) {
			arr[i] = "?";
			
			
		}
		


		int count=0;
		
		while(true) {
			
			
			// 출력
			System.out.println(" [ 보물찾기 프로그램 ] ");
			for(int i = 0 ; i <arr.length ; i++){
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			
			for(int i = 0 ; i <arr.length ; i++){
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			
			
			if(count==3) break;
			
			System.out.println("번호를 입력하세요 >> ");
			num = scan.nextInt();
			
			
			if(box[num] == 1) {
				arr[num] ="당첨";
				count++;
				
			}
			else {
				arr[num] ="꽝";
			}
			
			
			
		}

	}

}
