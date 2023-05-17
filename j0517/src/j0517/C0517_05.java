package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		//3개의 수를 입력받아 평균 60점 이상이면 합격을 출력 
		Scanner scan = new Scanner(System.in);
		C0517_05 c = new C0517_05();
		int[] num = new int[3];
		for(int i = 0;i<num.length;i++) {
			num[i] = scan.nextInt();
		}
		System.out.println(c.avg(num[0], num[1], num[2]));
		System.out.println(c.avg(num));
		
	}// main
	
	String avg(int a, int b, int c) {
		String result = "불합격";
		double avg = (a+b+c)/3.0;
		if (avg>=60) result ="합격";
		return result;
	}
	
	String avg(int[] a) {
		String result = "불합격";
		int sum = 0; 
		for(int i = 0; i<a.length;i++)
		{
			sum+=a[i];
		}
		double avg = sum/3.0;
		if (avg>=60) result ="합격";
		return result;
	}
	
	

}
