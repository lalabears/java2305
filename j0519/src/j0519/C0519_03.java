package j0519;

import java.util.Scanner;

public class C0519_03 {

	
	public static void main(String[] args) {
		
		// 문제 3
		// A. 두 수를 입력받아 사칙연산하는 프로그램을 만드세요 
		// 예) 6 , 3 을 입력받으면 
		// 출력 :
		//  6 + 3 = 9 
		//  6 - 3 = 3 
		//  6 * 3 = 18 
		//  6 / 3 = 2.00 
		// ---------------------------------------
		// B. 사칙연산을 함수로 만들어서 출력하세요  
		// 메서드 총 4개 add(), sub(), multi(), div()
		// 예) 6 , 3 을 입력받으면 
		// 출력 :
		//  6 + 3 = 9 
		//  6 - 3 = 3 
		//  6 * 3 = 18 
		//  6 / 3 = 2.00 	
		// ---------------------------------------
		// c. 사칙연산을 함수로 만들어서 출력하세요  메서드 총 1개 calculator() 만들어서 출력 
		// (나눗셈결과도 int type)
		// (힌트: int[] result = new int[n] )
		// 예) 6 , 3 을 입력받으면 
		// 출력 :
		//  6 + 3 = 9 
		//  6 - 3 = 3 
		//  6 * 3 = 18 
		//  6 / 3 = 2.00 	
			

			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int[] result = new int[4];
			
			calculator(a,b,result);
			for(int i = 0 ; i<result.length;i++) {
				System.out.printf(" %d + %d = %d \n",a,b,result[i]);
			}
			
//			
//			System.out.printf(" %d + %d = %d \n",a,b,add(a,b));
//			System.out.printf(" %d - %d = %d \n",a,b,sub(a,b));
//			System.out.printf(" %d * %d = %d \n",a,b,multi(a,b));
//			System.out.printf(" %d / %d = %.2f \n",a,b,div(a,b));
//			
		}
	
		static void calculator(int a, int b, int[] result) {
			result[0] = a+b;
			result[1] = a-b;
			result[2] = a*b;
			result[3] = a/b;
			
		}
		static int add(int a, int b) {
			return a+b;
		}
		static int sub(int a, int b) {
			return a-b;
		}
		static int multi(int a, int b) {
			return a*b;
		}
		static double div(int a, int b) {
			return a/(double)b;
		}

}
