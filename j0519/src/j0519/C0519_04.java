package j0519;

import java.util.Scanner;

public class C0519_04 {

	
	public static void main(String[] args) {
		
		// 번호, 국,영,수 점수를 입력받아 calculate() 
		// 합계, 평균 (int) 을 구해서 return 
		
		Scanner scan = new Scanner(System.in);
		String[] title = {"번호","국어","영어","수학","합계","평균"};
		int[] arr = new int[6];
		for(int i = 0 ; i<4;i++) {
			System.out.println(title[i]+"를 입력하세요");
			arr[i] = scan.nextInt();
		}
		
		calculate(arr);
		for(int i = 0; i <title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}// main
	
	static void calculate(int[] arr) {
		arr[4] = arr[1]+arr[2]+arr[3];
		arr[5] = arr[4]/3;
		
	}

}
