package j0519;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
		int choice = 0; 
		int count = 0; 
		String searchName="";

		
		
		int ck = 0; // 검색에 필요한 이름변수 
		
		loop:while(true) {

			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 입력
				System.out.println(" [ 성적 입력 ] ");
				for (int i = count; i < stu.length; i++) {
					stu[i] = new Student(); // 객체선언
					
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 (0. 이전페이지) ");
					stu[i].name = scan.next();
					if (stu[i].name.equals("0")) {
						System.out.println("이전페이지로 이동합니다. ");
						System.out.println();
						break;
					}
					System.out.println("국어점수를 입력해주세요. ");
					stu[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력해주세요. ");
					stu[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력해주세요. ");
					stu[i].math = scan.nextInt();
					stu[i].sum();
					stu[i].average();
					System.out.println((count + 1) + "번째 학생 등록");
					System.out.println();
					// 학생 수 1 증가
					count++;
				}
				
				break;
			case 2: // 출력
				
				System.out.println(" [ 성적 출력 ] ");
				recordTitle(count,stu);
				
				
				break;
				
				
				
				
			case 3: // 수정 
				System.out.println(" [ 성적 수정 ] ");
				System.out.println("수정할 학생의 이름을 입력하세요(0.이전페이지이동) ");
				searchName = scan.next();
				
				if (searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다. ");
					System.out.println();
					break;
				}
				
				
				ck = 0; 
				for (int i = 0; i < count; i++) {
					if (stu[i].name.equals(searchName)) {
						ck = 1;
						System.out.printf("[ %s 학생이 검색되었습니다] \n",stu[i].name);
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("------------------------------------");
						System.out.println("수정할 과목을 선택하세요 >> ");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1:
							System.out.printf("[현재 국어점수 : %d점] 입니다.\n",stu[i].kor);
							System.out.println("수정할 점수를 입력해주세요 >> ");
							stu[i].kor = scan.nextInt();
							stu[i].sum();
							stu[i].average();
							System.out.printf("[국어점수 : %d점]으로 수정되었습니다.\n",stu[i].kor);
							break;
						case 2:
							System.out.printf("[현재 영어점수 : %d점] 입니다.\n",stu[i].eng);
							System.out.println("수정할 점수를 입력해주세요 >> ");
							stu[i].eng = scan.nextInt();
							stu[i].sum();
							stu[i].average();
							System.out.printf("[영어점수 : %d점]으로 수정되었습니다.\n",stu[i].eng);
							break;
						case 3:
							System.out.printf("[현재 수학점수 : %d점] 입니다.\n",stu[i].math);
							System.out.println("수정할 점수를 입력해주세요 >> ");
							stu[i].math = scan.nextInt();
							stu[i].sum();
							stu[i].average();
							System.out.printf("[수학점수 : %d점]으로 수정되었습니다.\n",stu[i].math);
							break;
						default:
							System.out.println("잘못입력하셨습니다. 다시 확인해주세요 ");
							break;
								
						}
					}
				}
				if(ck == 0) {
						System.out.printf("[ %s 학생은 존재하지 않습니다] \n",searchName);
					}
				
				break;
			case 4: // 등수처리
				for (int i = 0; i < count; i++) {
					int rankCount = 1; 
					for (int j = 0; j < count; j++) {
						if(stu[i].total<stu[j].total) {
							rankCount++;
						}
					}
					stu[i].rank = rankCount;
				}
				System.out.println("[ 등수처리가 완료 되었습니다. ]");
				break;
			case 5: // 학생 검색
				System.out.println("[ 학생 검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요 ");
				searchName = scan.next();
				ck = 0;
				for (int i = 0; i < count; i++) {
					
					if(stu[i].name.contains(searchName)) {
						ck =1;
						for (int j = 0; j < Student.title.length; j++) {
							System.out.print( Student.title[j]+"\t");
						}
						System.out.println();
						System.out.println("----------------------------------");
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].total,stu[i].avg,stu[i].rank);
					}
						
					
				}
				if(ck == 0) {
					System.out.println("입력한 학생이 존재하지 않습니다. 다시 입력해주세요");
					System.out.println();
				}
				break;
			case 0: //종료
				System.out.println("[ 프로그램을 종료합니다 ]");

				break loop;
			
			default:
				System.out.println("잘못입력하습니다. 다시 입력해주세요");
				break;
			}// switch
			
			
			
			
			
			
		} // while

	}// main
	
	// 화면 출력 
	static void recordTitle(int count, Student[] stu) {

		for(int i = 0; i <Student.title.length;i++) {
			System.out.print(Student.title[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].total,stu[i].avg,stu[i].rank);
		}
	}

}// class 
