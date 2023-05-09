package j0508_01;

public class Class0508_03 {

	// 전역변수
	static int num; // 전역변수 - class영역에서도 변수선언 가능 
	
	public static void main(String[] args) {
		// 지역변수 
		int num = 100 ; 
		System.out.println("main method 지역변수 num 호출 : "+num);
		sub();
		
		
	}

	
	
	static void sub() {
//		System.out.println(num); // 지역변수 사용불가
		System.out.println("sub method num 호출 : "+num);
		
	}
}
