package j0526;

import java.util.Scanner;

public class C0526_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자하는 문자를 입력하세요 >>");
		String input=scan.next();
		
		String str1 = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		
		
		if(str2.endsWith(input)) {
			System.out.println("jsp로 끝");
		}else {
			
			System.out.println("jsp로 끝나지 않음");
		}
		
		// contains
		
//		if(str1.contains(input)) {
//			System.out.println(input+" 잇음");
//		}else {
//			System.out.println(input+" 없음");
//		}
		
	}

}
