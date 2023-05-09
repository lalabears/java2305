package j0508_01;

public class Class0508_06 {

	public static void main(String[] args) {
		// 형변환 
		// 기본형 - 8가지 
		// 논리형 1바이트 - boolean
		// 문자형 2바이트 - char
		// 정수형 1바이트 - byte, 2바이트 - short, 4바이트 - int, 8바이트 - long
		// 실수형 4바이트 - float, 8파이트 - double 
		// 문자열 String 
		
		
		// 자동 형변환 : 작은거 -> 큰거 넘어갈 때 
		
		// 강제 형변환 : 큰거 -> 작은거로 변환할때 (잘라내기) type을 꼭 붙여야 한다. 
		
		int num = 10; 
		double d = num; // 자동형변환 
		System.out.println(d); // 10.0

		
		float f = 1.6f; 
		int i = (int)f; // 강제형변환 
		System.out.println(i); // 1
		
		
		// String > double > float > long > int > char, byte, short 
		
		char ch = 'A'; //  아스키코드 : A(65) a(97)
		int n = ch; 
		System.out.println(n);
		
		int n2 = 97; 
		char ch2 = (char)n2;
		System.out.println(ch2);
		

	}

}
