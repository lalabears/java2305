package j0526;

import java.util.*;
import java.util.Arrays;   

public class C0526_13 {

	public static void main(String[] args) {
		
		String lotto1 = "1";
		String lotto2 = "1조12587";
		
		// 0 - 9 
		// 1-9조 00000-99999
		// 입력을 두개 받아 몇개 맞추는지 
		
		Scanner scan = new Scanner(System.in);
	
		// ex. 1 . 0 -9 랜덤 숫자. 맞추는 게임 구현하세요 . 
		int random = (int)(Math.random()*10);
		int random5 = (int)(Math.random()*100000);
		
		String lotto0 = String.valueOf(random);
		String lotto5 = String.format("%05d", random5);
		
		String lottoNum = lotto0+lotto5;
//		
		System.out.println(lotto0);
		System.out.println(lotto5);

		System.out.println("숫자를 입력하세요");
		String str = scan.next();

		String str_1 = str.substring(0,str.indexOf("조"));
		String str_2 = str.substring(str.indexOf("조")+1,str.length());
		System.out.println(str_1);
		System.out.println(str_2);
		
		String str0 = str_1+str_2;
		
		
		if(str_1.equals(lotto0)) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		String chk = str_2.substring(0,1);
		String lck = lotto5.substring(0,1);
		if(chk.equals(lck)) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
		int count = 0; 
		for(int i = 0 ; i<lottoNum.length();i++) {
			if(  lottoNum.charAt(i) == str0.charAt(i) ) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		int[] lnum = new int[6];
		for(int i = 0 ; i<lottoNum.length();i++) {
			if(  lottoNum.charAt(i) == str0.charAt(i) ) {
				lnum[i] = 1;
			}
			else {
				lnum[i] = 0;
			}
		}
		
//		System.out.println("당첨배열 ");
//		for(int i = 0 ; i<lottoNum.length();i++) {
//			System.out.print(lnum[i]+",");
//		}
//		
		int[] money = {100000,10000,1000,100,10,0};
		

	}

}
