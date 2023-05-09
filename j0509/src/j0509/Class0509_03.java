package j0509;

import java.util.Scanner;

public class Class0509_03 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int kor = 0; 
		int eng = 0; 
		int math = 0;
		
		// 입력 받기 Scanner
		Scanner scan = new Scanner(System.in); 
//		String str = new String("aaa");
		
		System.out.println("이름을 입력하세요: ");
		name=scan.nextLine();
		
		System.out.println("국어점수를 입력하세요 : ");
		kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하세요 : ");
		eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요 : ");
		math = scan.nextInt();
		
		
		
		
		
		
		
		int total = kor + eng + math;
		double avg =  total / 3.0 ;
		
		System.out.println("----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name,kor, eng, math, total, avg);
		System.out.println();

		
		
	}

}
