package j0519;

import java.util.Scanner;

public class C0519_06 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String no = "1";
		String title = "홈페이지 오픈";
		String date = "2023-05-19";
		String name = "홍길동";
	
//		String content = "홈페이지를 개설합니다";
		
		
		
		Board b = new Board();
		
		String[] saveBoard = b.save(no, title, date, name);
		
		for (int i = 0; i < saveBoard.length; i++) {
			System.out.print(saveBoard[i]+"\t");
		}
		
		
		
	}// main
	
	static void board() {
		
	}
	


}
