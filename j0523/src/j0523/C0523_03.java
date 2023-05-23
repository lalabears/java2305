package j0523;

//import java.util.Date;
//import java.util.Scanner;

import java.util.*; // class 부분만 * 사용이 가능하다. 


public class C0523_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Date today = new Date();
		
		
		Card c = new Card("Heart",1);
		Card c2 = null;
		
		c2 = c; 
		
		Deck d1 = new Deck();
		Object o = null; // 범용적으로 사용할 목적일때.. 
		o = d1; // 조상 자손 관계
		
		
		
		
		
		
		
		
		int a = 5;
		String str = null;
//		str=a ; // type이 달라서 넣을 수 없다
		
		
		
		
		System.out.println(c.kind);
		
		
		
		int num = 5; 
		num = 10; 
		
		final int NUMBER = 1; // 상수는 대문자로 이름을 만들어라. 일반변수랑 헷갈리니까- 
//		NUMBER=10;
		
		

	}//main
	
	
	
	static void add() {
		
	}
	
	// overloading 
	static void add(int a, int b) {
		
	}

} // class

