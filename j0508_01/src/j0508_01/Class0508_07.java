package j0508_01;

public class Class0508_07 {

	public static void main(String[] args) {
		// printf, println, print
		
		System.out.println( 10/3 ); // int / int    => 3
		System.out.println( 10/3.0 ); // int / double  => 3.333  15째짜리까지만 정확 
		
		// println -> 출력후 enter 포함 
		
		// \n 줄바꿈 (enter)  \t 탭 (tab)
		System.out.printf("%.2f \n",1000/3.0); // 소수점2 자리까지 표현 
		System.out.printf("%5d  \n",1000/3); // 정수는 d
		
		
		System.out.printf("%x  \n",16); // 16진수는 x
		System.out.printf("%o  \n",9); // 8진수는 o
		
		System.out.printf("당신의 나이 : %d세, 생년 : %d년  \n" , 25, 1986 );
		System.out.println("당신의 나이 : "+ 25 + "세, 생년 : "+1986+"년" );
		
		

	}

}
