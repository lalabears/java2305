package j0518;

import java.util.Scanner;

public class C0518_10 {
	
	int iv;
	static int cv;
	
	void i_Method() {
		System.out.println(iv);
		System.out.println(cv);
		
	}
	static void c_Method() {
		// 할 수 는 있으나 굳이 안쓴다
//		C0518_10 c2 = new C0518_10();
//		System.out.println(c2.iv);
//		System.out.println(iv);
		System.out.println(cv);
		
	}

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		C0518_10.cv = 50; 
		System.out.println(cv);
		
		C0518_10 c = new C0518_10();
		c.iv = 100;
		System.out.println(c.iv);
		

	}

}
