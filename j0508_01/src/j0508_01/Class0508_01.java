package j0508_01;

public class Class0508_01 {
	public static void main(String[] args) {
		
		// 논리형 
		boolean temp = true;    // 바로 넣기
		boolean temp2 = false; 
		
		// 선언하고 넣기
		boolean temp3; 
		temp3 = true;
		
		
		// 문자형
		// char 문제 한개만 => 무조건 홋따옴표, 공백없이는 사용 불가능.
		// 저장은 숫자로 된다.  
		char ch1 = ' ';
		char ch2 = 'a';
		char ch3 = 'A';
		
		// 정수형 
		byte num1 = 1; 
		byte num3 = 127; // 127 까지의 숫자를 표현하기 때문에 그 이상을 입력하면 에러 

		short num2 = 10;
		short num4 = 32767; //  32767 까지의 숫자를 표현하기 때문에 그 이상을 입력하면 에러 
		
		
		int num5 = 21; 
		int num6 = 2147483647; //2147483647 까지의 숫자를 표현하기 때문에 그 이상을 입력하면 에러 
		
		long num7 = 21; 
		long num8 = 2147483648L; // L을 꼭 붙여줘야함. 롱은 인트를 포함시킬 수 있기때문에 인트에 해당하면 l을 안붙여도 되나 그 이상은 붙여아함
		
		
		//실수형 
		float num9 = 3.14f; // f를 꼭 붙여야 함 
		float num10 = 3.1234567891234f; // f를 꼭 붙여야 함 
		float num10_1 = 987.654321f; // f를 꼭 붙여야 함 
		
		System.out.print(num10); // 총 8자리 정확한 표현 가능 
		
		double num11 = 1.123456789012345; // d를 붙여도되고 안붙여도된다. 
		                                  // 실수형 16자리까지 정밀도 표현 가능 
		
		
		
		// 문자열
		String str1 = new String("abc"); // 원래 사용하는 방법 . 생성자를 사용.  
		String str = "abc"; // 예외. 기본형 타입으로 선언 (많이 사용되기때문에 스트링의 경우 간단하게 사용할 수 있게 제공해줌) 
		
		
		char str3 = ' ';
		String str4 = ""; // 빈공백을 안넣어주어도된다. 
		
		// 변수 
		int score = 100; 
		score = score+200; //score 300이라는 값이 들어감. 
		
		// 상수 
		final int SCO = 100; 
		// SCO = 200; // 값을 변경할 수 없기때문에 error
		
		
		
		
		
		
		
		
		
		
	}

}
