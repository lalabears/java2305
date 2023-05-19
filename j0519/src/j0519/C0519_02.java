package j0519;

import java.util.Scanner;

public class C0519_02 {

	
	public static void main(String[] args) {
//	문제
//  열 크기와 행 크기를 입력받아 . 배열에  a-z까지 채워 넣으세요 
//  4, 5 를 입력 받으면  
//  출력 :
//	a b c d e 
//	f g h i j 
//	k l m n o 
//	p q r s t 

		// 순서 : 
		// 1. 변수선언
		// 2. 숫자 두개 입력받기
		// 3. char 배열 생성 
		// 4. 이중for문을 사용해서 넣기. 
		// 5. 이중for문을 사용해서 출력 
		// --------------
		// char 배열이 어려우면, int배열로 만들어서 숫자로 채우기 (3.번에서char배열대신 int배열생성)
		// 예. 4, 5 입력시 아래와 같이 출력 
		// 1 2 3 4 5 
		// 6 7 8 9 10 
		// 11 12 13 14 15 
		// 16 17 18 19 20 
		
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0; 
		a = scan.nextInt();
		b = scan.nextInt();
		int count = 0; 
		
		char[][] ch = new char[a][b];
		int [][] num = new int[a][b];
		for(int i = 0 ; i < a ; i ++) {
			for(int j = 0;j<b; j++) {
				ch[i][j] = (char)('a'+count);
				num[i][j] = 1+count;
				count++;
			}
		}
		
		for(int i = 0 ; i < a ; i ++) {
			for(int j = 0;j<b; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
