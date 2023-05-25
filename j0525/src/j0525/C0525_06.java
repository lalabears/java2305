package j0525;

import java.util.*;

public class C0525_06 {
	
	public static void main(String[] args) {
		

		System.out.println(1);
		System.out.println(2);
		try { // 예외가 일어날 부분에 적용 
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception e) {
			
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
