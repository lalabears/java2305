package j0517;

import java.util.Scanner;

public class C0517_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C0517_04 cC0517_04 = new C0517_04();
		Scanner scan = new Scanner(System.in);
		
		
		
		int a = 10; 
		int b = 35; 
		int c= 2;
		int re = a>=b? a>=c?a:c : b>=c? b:c;
		System.out.println(re);
		int max = Math.max(Math.max(a, b), c);		
		System.out.println(max);
		
		int[] num = new int[3];
		
		
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();
		
		int r = cC0517_04.numMin(num[0], num[1], num[2]);

		System.out.println(r);
		
		
		
	}// main
	
	int max2(int n1, int n2) {
		int result;
		
		if(n1>n2) {
			result = n1;
		}else {
			result = n2;
		}
		
		return result; 
	}
	
	
	
	
	
	int numMax(int a, int b, int c) {
		if(a>=b) {
			if(a>=c) return a ;
			else if(b>=c) return b;
			else return c;
		}
		else{
			if(b>=c) return b ;
			else if(a>=c) return a;
			else return c;
			
		}
		
	}
	int numMin(int a, int b, int c) {
		if(a<=b) {
			if(a<=c) return a ;
			else if(b<=c) return b;
			else return c;
		}
		else{
			if(b<=c) return b ;
			else if(a<=c) return a;
			else return c;
			
		}
		
	}
	
	void print() {
		System.out.println("출력");
	}
}
