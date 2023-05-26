package j0526;

import java.util.*;
import java.util.Arrays;   

public class C0526_12 {

	public static void main(String[] args) {
		
		String lotto1 = "1";
		String lotto2 = "1조12587";
		
		// 0 - 9 
		// 1-9조 00000-99999
		// 입력을 두개 받아 몇개 맞추는지 
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요");
		String str = scan.next();

		String str_1 = str.substring(0,str.indexOf("조"));
		System.out.println(str_1);
		
		
		// ex. 1 . 0 -9 랜덤 숫자. 맞추는 게임 구현하세요 . 
		int random = (int)(Math.random()*10);
		
		
		
//		
		String lotto0 = String.valueOf(random);
		
		if(str_1.equals(lotto0)) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}

		System.out.println(lotto0);
//		
	}

}
