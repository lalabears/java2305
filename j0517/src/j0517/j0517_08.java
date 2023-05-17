package j0517;

import java.util.Scanner;

public class j0517_08 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 작은순서부터 순차적으로 출력하세요 
		Scanner scan = new Scanner(System.in);
		
		int[] result = new int[3];
		int[] num = new int[3];
		
		for(int i = 0; i<num.length;i++) {
			num[i] = scan.nextInt();
		}

		calculator(num);
		System.out.println(num[0]+","+num[1]+","+num[2]);
	}
	static void calculator(int[] num ) {
		
		int min = Math.min(Math.min(num[0], num[1]),num[2]);
		int max = Math.max(Math.max(num[0], num[1]),num[2]);
		int middle = (num[0]+num[1]+num[2])-min-max;
		num[0] = min;
		num[1] = middle;
		num[2] = max;
	}
	static void calculatorMy(int[] num ) {
		
		int tmp = 0;
		for(int i = 0; i<num.length;i++) {
			for(int j = (i+1); j<num.length;j++) {
				if(num[i]>num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}			
		}
		
		
		
	}

}
