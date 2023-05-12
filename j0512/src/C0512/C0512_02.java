package C0512;

import java.util.Scanner;

public class C0512_02 {

	public static void main(String[] args) {
		// 학생 성적 프로그램 
		
		// 1. 성적 입력
		// 2. 성적 출력
		// 3. 성적 수정
		// 4. 등수 처리
		// 5. 학생 성적 검색
		// 0. 프로그램 종료
		
		// 10명 (이름국영수합평)
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 선언 
		int input=0; 
		int num = 10 ;
		int count = 0; // 입력된 학생 수 표시 
		
		String[] name=new String[num];
		int[] kor =  new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		int[] total = new int[num]; 
		double[] avg = new double[num]; 
		
		
		while(true) {
			
			// 2. 화면 출력 
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			input = scan.nextInt();
			
			if(input == 0 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 3. 조건문 
			
			switch(input) {
			case 1: // 성적 입력 
				
				System.out.println(" [ 성적 입력 ] ");
	
				for(int i = count ;i<num;i++) {
					System.out.println((i+1)+"번째 학생의 이름을 입력하세요 (0. 이전페이지 이동)");
					name[i] = scan.next();
					if(name[i].equals("0"))	break;		
					System.out.println("국어점수를 입력하세요");
					kor[i]=scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i]=scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					math[i]=scan.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					
					count++;
				} // for 
				
				
				
				break;
				
			case 2: // 성적 출력
				// 출력 
				System.out.println(" [ 성적 출력 ] ");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------------");
				for(int i = 0 ;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
					System.out.println();
				}
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
					
			} // switch - end 
			
			
			
		} // while(true) - end 
		
		
		

	}// main - end
 
}// class - end
