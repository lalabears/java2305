package j0511;

import java.util.Scanner;

public class C0511_09 {

	public static void main(String[] args) {
		// 성적처리 프로그램
		// 1. 이름, 2.국어, 3.영어, 4.수학, 합계, 평균 자동으로 들어갈 수 있도록 함 
		
		Scanner scan = new Scanner(System.in);
		int num = 3;
		String[] name=new String[num];
		int[] kor =  new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		int[] total = new int[num]; 
		double[] avg = new double[num]; 
		
		
		for(int i = 0 ;i<num;i++) {
			System.out.println("[학생 성정 프로그램]");
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i]=scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i]=scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i]=scan.nextInt();
			
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0; 
		}
		
		
		int a ; 
		a = 0; 
		a= 1; 
		
		int[] b = new int[10];
		
		
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0 ;i<num;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			System.out.println();
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		String name="";
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0; 
//		double avg = 0; 
//		
//		System.out.println("[학생 성정 프로그램]");
//		System.out.println("이름을 입력하세요");
//		name = scan.next();
//		System.out.println("국어점수를 입력하세요");
//		kor=scan.nextInt();
//		System.out.println("영어점수를 입력하세요");
//		eng=scan.nextInt();
//		System.out.println("수학점수를 입력하세요");
//		math=scan.nextInt();
//		
//		
//		total = kor+eng+math;
//		avg = total/3.0; 
//		
//		
//		// 출력
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("----------------------------------------------------");
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name,kor,eng,math,total,avg);
//		System.out.println();
//		
		
		
		
		

	}

}