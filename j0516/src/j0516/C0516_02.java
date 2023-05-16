package j0516;

import java.util.Scanner;

public class C0516_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학,합계,평균 - 10명
		Scanner scan = new Scanner(System.in);
		int choice = 0; // 선택번호
		int count = 0; // 성적입력 학생수
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균","등수" };
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String modiName="";
		String searName="";
		int chk = 0; // 존재유무

		
		// 무한반복
		loop: while (true) {
			// 화면출력부분
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				for (int i = count; i < name.length; i++) {
					// 이름입력부분
					System.out.println((count+1)+"번째 학생의 이름을 입력하세요.>>(0.이전페이지)");
					name[i] = scan.next();
					if(name[i].equals("0")) break;
					int sum=0;
					for(int j = 0; j<score[i].length-1;j++) {
						System.out.println(title[j+1]+" 점수를 입력해주세요>>");
						score[i][j] = scan.nextInt();
						sum += score[i][j];
					}
					score[i][3] = sum;
					avg[i] = sum/3.0;
					count++;
				}
				break;
				
			case 2:
				
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------");

				for (int i = 0; i < count; i++) {
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f\t",avg[i]);
					System.out.print(rank[i]);
					System.out.println();
				}
				break;

			case 3:
				System.out.println("수정할 학생의 이름을 입력하세요 ");
				modiName = scan.next();
				chk = 0;
				for (int i = 0; i < count; i++) {
					if(name[i].equals(modiName)) {
						chk =1;
						// 수정할 과목 선택
						System.out.println("수정할 과목을 선택하세요(1.국어 2.영어 3.수학 0.이전 ");
						int chSub=scan.nextInt();
						if(chSub==0) break;
						System.out.println(" [ " + title[chSub] + " 점수 수정 ] ");
						System.out.println(score[i][chSub - 1] + "점  입니다. ");
						System.out.println(" 수정할 점수를 입력하세요");
						score[i][chSub - 1] = scan.nextInt();
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;
						
					}
				}
				
				// 찾는 학생이 없을 경우. 
				if(chk == 0) {
					System.out.println("입력한 학생이 존재하지 않습니다. 다시 입력해주세요");
					System.out.println();
				}
				break;
			case 4:
				for (int i = 0; i < count; i++) {
					int rankCount = 1; 
					for (int j = 0; j < count; j++) {
						if(score[i][3]<score[j][3]) {
							rankCount++;
						}
					}
					rank[i] = rankCount;
				}
				break;
			case 5: // 학생 검색 
				System.out.println("[ 학생 검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요 ");
				searName = scan.next();
				chk = 0;
				for (int i = 0; i < count; i++) {
					
					if(name[i].contains(searName)) {
						chk =1;
						for (int j = 0; j < title.length; j++) {
							System.out.print(title[j]+"\t");
						}
						System.out.println();
						System.out.println("----------------------------------");

						System.out.print(name[i]+"\t");
						for (int j = 0; j < score[i].length; j++) {
								System.out.print(score[i][j]+"\t");
						}
						System.out.printf("%.2f\t",avg[i]);
						System.out.print(rank[i]);
						System.out.println();
					}
						
					
				}
				if(chk == 0) {
					System.out.println("입력한 학생이 존재하지 않습니다. 다시 입력해주세요");
					System.out.println();
				}
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;

			}// switch

		} // while

	}

}
