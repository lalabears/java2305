package j0519;

import java.util.Scanner;

public class C0519_05 {

	static String[] title = {"번호","국어","영어","수학","합계","평균"};
	public static void main(String[] args) {
		// 입력을 받는 메소드를 만드세요 
		
		int[] arr = new int[6];
		
		// 입력 
		input(arr);
		// 출력
		for(int i = 0; i <title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
	}// main
	static void input(int[] arr) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 4 ; i++) {
			
			System.out.println(title[i]+"입력");
			arr[i] = scan.nextInt();
		}
		// 합계
		arr[4] = arr[1]+arr[2]+arr[3];
		// 평균
		arr[5] = arr[4]/3;
		
		
	}
	


}
