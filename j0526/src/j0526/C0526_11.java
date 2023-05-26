package j0526;

import java.util.*;
import java.util.Arrays;   

public class C0526_11 {

	public static void main(String[] args) {
		String str1 = "https://semiconductor.samsung.com/kr";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756";
		
		String result1 = lotto.substring(2); // 2 번부터 끝까지 
		String result2 = test.substring(3,6); // 3부터 6번 앞까지 잘라라  
		
		
		System.out.println(result1);
		System.out.println(result2);
		
		// dream-jsp까지 
		int n1 = str2.indexOf("/d");
		int n2 = str2.indexOf("jsp");
		String result3 = str2.substring(n1+1,n2+3);
		System.out.println(result3);
		
		// foundary/ 까지
		
		int n3 = str3.indexOf("/f");
		int n4 = str3.indexOf("/p");
		String result4 = str3.substring(n3+1,n4+1);
		System.out.println(result4);
		
		// str1을 사용 해서 /dram/ddr.jsp 가져오기 
		String result5 = str2.substring(str1.length());
		System.out.println(result5);
	
		

		
	}

}
