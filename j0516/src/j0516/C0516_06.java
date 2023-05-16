package j0516;

import java.util.Scanner;

public class C0516_06 {

	public static void main(String[] args) {
		// 학생성적 - 객체이용
		
		Scanner scan = new Scanner(System.in);
		
		// 참조변수 10개 생성
		Student[] s = new Student[10];
//		// 객체 선언
//		s[0] = new Student();
		
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균","등수" };
		int choice = 0; // 선택번호
		int count = 0; // 성적입력 학생수
		String modiName="";
		String searName="";
		int chk = 0; // 존재유무
		
		
		while (true) {
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
				for (int i = count; i < s.length; i++) {
					s[i] = new Student(); // 객체 선언 
					
					// 이름입력부분
					System.out.println((count+1)+"번째 학생의 이름을 입력하세요.>>(0.이전페이지)");
					s[i].name = scan.next();
					if(s[i].name.equals("0")) break;
					System.out.println("국어점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					s[i].math = scan.nextInt();
					s[i].sum();
					s[i].average();
					
					count++;
				}
				
				
				
				
				
				
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
