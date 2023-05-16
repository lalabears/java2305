package j0516;

import java.util.Scanner;

public class C0516_01 {

	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int input = 0;
		int num = 10;
		int count = 0; // 입력된 학생 수 표시
		String modiName = "";
		String searName = "";
		String[] name = new String[num];
		int[][] score = new int[num][4];
		double[] avg = new double[num];
		int[] rank = new int[num];

		while (true) {

			// C0516_01.screen(); // 클래스명.메소드명();
			screen(); // 같은 클래스 내에선 클래스명을 사용하지 않아도 된다. 
			input = scan.nextInt();

			if (input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 3. 조건문

			switch (input) {
			case 1: // 성적 입력
				System.out.println();
				System.out.println(" [ 성적 입력 ] ");

				for (int i = count; i < num; i++) {
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 (0. 이전페이지 이동)");
					name[i] = scan.next();
					if (name[i].equals("0"))
						break;
					int sum = 0;
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
						sum += score[i][j];
					}
					score[i][3] = sum;
					avg[i] = sum / 3.0;

					count++;
				} // for

				break;

			case 2: // 성적 출력
				// 출력
				System.out.println();
				System.out.println(" [ 성적 출력 ] ");
				titleScreen();
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i], rank[i]);
					System.out.println();
				}
				break;
			case 3:
				System.out.println();
				System.out.println(" [ 성적 수정 ] ");
				System.out.println(" 수정할 학생의 이름을 입력하세요 ");
				modiName = scan.next();
				int chSub = 0;
				int chk = 0; // 찾을 학생이 있으면 1, 없으면 0;
				for (int i = 0; i < count; i++) {

					if (name[i].equals(modiName)) {
						chk = 1;
						System.out.println(name[i] + "을 찾았습니다 ");
						System.out.println(" 수정할 과목을 선택해주세요(1.국어,2.영어,3.수학,0.상위) ");
						chSub = scan.nextInt();
						if (chSub == 0)
							break;
						switch (chSub) {
						case 1:
						case 2:
						case 3:
							System.out.println(" [ " + title[chSub] + " 점수 수정 ] ");
							System.out.println(score[i][chSub - 1] + "점  입니다. ");
							System.out.println(" 수정할 점수를 입력하세요");
							score[i][chSub - 1] = scan.nextInt();
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3] / 3.0;
							break;
						default:
							System.out.println(" 잘못 입력하셨습니다. ");

						} // switch

					} // if

				} // for

				if (chk == 1) {

					System.out.println(" 수정되었습니다 ");
				} else {
					System.out.println(modiName + "이 존재하지 않습니다. \n 다시 입력해주세요");
				}

				break;
			case 4:
				System.out.println();
				System.out.println(" [ 등수 처리 ] ");

				break;
			case 5:
				System.out.println();
				System.out.println(" [ 학생 성적 검색 ] ");
				System.out.println(" 학생의 이름을 입력하세요 ");
				searName = scan.next();
				for (int i = 0; i < count; i++) {

					if (name[i].equals(searName)) {
						titleScreen();
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d", name[i], score[i][0], score[i][1],
								score[i][2], score[i][3], avg[i], rank[i]);
						System.out.println();

					} else {
						System.out.println(searName + "이 존재하지 않습니다. \n 다시 입력해주세요");

					}
				}
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");

			} // switch - end

		} // while(true) - end

	}// main

	// 클래스 메소드 - 객체선언없이 사용할 수 있다. [클래스이름.매소드명()]
	static void screen() {

		// 2. 화면 출력
		System.out.println();
		System.out.println(" [ 성적처리 프로그램 ] ");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 등수 처리 ");
		System.out.println(" 5. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println(" -------------------- ");
		System.out.println(" 원하는 번호를 입력하세요 ");

	}
	static void titleScreen() {
		
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------");
	}

}
