import java.util.Scanner;

public class StuMain {
	
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학,합계,평균 - 10명
		int choice = 0; // 선택번호
		int count = 0; // 성적입력 학생수
		String modiName = "";
		String searName = "";
		int chk = 0; // 존재유무

		Student[] s = new Student[10];

		loop: while (true) {
			// 화면출력부분
			choice = stuScreen(); // 메소드 호출
			
			switch (choice) {
			case 1: // 성적입력
				count = stuInput(s, count);
				break;
			case 2: // 성적출력
				break;
			case 3: // 성적수정
				break;
			case 4: // 등수처리
				break;
			case 5: // 학생성적검색
				break;
			case 0: // 성적입력
				System.out.println("프로그램을 종료합니다... ");
				break loop;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요 >> ");
			}// switch
		} // loop - while
		
	} // main

	static int stuInput(Student[] s, int count) { // 학생 성적 입력 메소드
		for (int i = count; i < s.length; i++) {
			s[i] = new Student(); // 객체선언
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 (0. 이전페이지) ");
			s[i].name = scan.next();
			if (s[i].name.equals("0")) {
				System.out.println("이전페이지로 이동합니다. ");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력해주세요. ");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력해주세요. ");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력해주세요. ");
			s[i].math = scan.nextInt();
			s[i].sum();
			s[i].average();
			System.out.println((count + 1) + "번째 학생 등록");
			System.out.println();
			// 학생 수 1 증가
			count++;
		}
		return count;

	}// stuInput- method
	
	static int stuScreen() {

		// 2. 화면 출력
		System.out.println("-------------------- ");
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 등수 처리 ");
		System.out.println(" 5. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println("-------------------- ");
		System.out.println("원하는 번호를 입력하세요 ");
		int choice = scan.nextInt();
		return choice;
	} //screen

}// class
