package j0526;

import java.util.*;

public class C0526_09 {

	public static void main(String[] args) {
		String str = "    aaa  aaa     aaa                     ";
		String str2 = "bbb,bbb,bbb,bbb";
		
		// trim
		System.out.println(str + str.length());
		String result1 = str.trim();//앞뒤공백제거
		System.out.println(result1 + result1.length());
		
		// replace 
		System.out.println(str2);
		String result2 = str2.replace("bbb", "abc");
		System.out.println(result2);
		
		
		
		// Q 쉽표를 사이 띄우기로 변경하세요 
		String result3 = str2.replace(",", " ");
		System.out.println(result3);
		// Q 모든 공백제거 
		String result4 = str.replace(" ", "");
		System.out.println(result4 + result4.length());
		
		
		
		// split
		
		String[] arr = str2.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
