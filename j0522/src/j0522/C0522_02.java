package j0522;

import java.util.Scanner;

public class C0522_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 두 수를 입력받아 더하기, 빼기, 곱하기, 나누기
		// 생성자 활용
		
		int[] num = new int[4];
		int[] data = new int[8];
		
		for( int j = 0 ; j<2 ; j++ ) {
			
			for(int i = 0; i<2 ; i++) {
				System.out.println("입력:");
				num[i+j*2] = scan.nextInt();
			}
			// j 0 :  i 2 3 
			data[4*j+0] = num[2*j+0]+num[2*j+1];
			data[4*j+1] = num[2*j+0]-num[2*j+1];
			data[4*j+2] = num[2*j+0]*num[2*j+1];
			data[4*j+3] = num[2*j+0]/num[2*j+1];

			
			System.out.printf("%d+%d=%d\n",num[2*j+0],num[2*j+1],data[4*j+0]);
			System.out.printf("%d-%d=%d\n",num[2*j+0],num[2*j+1],data[4*j+1]);
			System.out.printf("%d*%d=%d\n",num[2*j+0],num[2*j+1],data[4*j+2]);
			System.out.printf("%d/%d=%d\n",num[2*j+0],num[2*j+1],data[4*j+3]);
		
		
		}// for j 
		
		
		

	}

}
