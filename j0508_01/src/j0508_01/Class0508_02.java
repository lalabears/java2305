package j0508_01;

public class Class0508_02 {
	public static void main(String[] args) {
		

		boolean power = true; 
		char ch = 'A'; // 문자가 아닌 숫자로 저장 
		char ch2 = '\u0041'; // 16진수
		char ch3 = 65; // 아스키코드
		
		System.out.println(power);
		System.out.println(ch);
		System.out.println(ch2);
//		System.out.println(ch3);
		
		char tab = '\t';
		System.out.println(""+tab+ch3);
		
		byte b = 127;
		short s = 32767; 
		int i = 100; 
		int oct = 0100; // 8 진수
		int hex = 0x100;  //16 진수
		
		long l = 10000000000L;
		float f = 3.14f; 
		double d =  3.14; 
		
		float f2 = 100f ; 
		System.out.println(f2);
		
		
		
	}

}
