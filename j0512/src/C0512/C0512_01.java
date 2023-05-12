package C0512;

import java.util.Scanner;

public class C0512_01 {

	public static void main(String[] args) {
		// 학생 성적 프로그램 
		
		// 1. 성적 입력
		// 2. 성적 출력
		// 3. 성적 수정
		// 4. 등수 처리
		// 0. 프로그램 종료 
//				System.out.println(" 3. 성적 수정 ");
//				System.out.println(" 4. 등수 처리 ");
//				System.out.println(" 0. 프로그램 종료  ");
				
				
				
				Scanner scan = new Scanner(System.in);
				int input =0;   // 성저처리 옵션 선택
				int count = 0 ; // 입력된 학생 수 
				
				int num = 10;
				String[] name=new String[num];
				int[] kor =  new int[num];
				int[] eng = new int[num];
				int[] math = new int[num];
				int[] total = new int[num]; 
				double[] avg = new double[num]; 
				
				while(true) {
					
					System.out.println(" [ 성적처리 프로그램 ] ");
					System.out.println(" 1. 성적 입력 ");
					System.out.println(" 2. 성적 출력 ");
					System.out.println(" -------------------- ");
					System.out.println(" 원하는 번호를 입력하세요 ");
					
					input = scan.nextInt();
					
					switch(input) {
					case 1:
						System.out.println(" [ 성적 입력 ] ");
						for(int i = count ;i<num;i++) {
							System.out.println((i+1)+"번째 학생의 이름을 입력하세요 (0. 이전페이지 이동)");
							name[i] = scan.next();
							if(name[i].equals("0")){
								break;
								
							}
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
					case 2:
						System.out.println(" [ 성적 출력 ] ");
						System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
						System.out.println("----------------------------------------------------");
						for(int i = 0 ;i<count;i++) {
							System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
							System.out.println();
						}
						
						
						break;
					default:
						System.out.println(" 잘못입력하셨습니다.  ");
						
						
					
					}//switch-end
					
					
					
					
					
				}// while-end
				

	}

}
