package j0508_01;

public class Class0508_08 {

	public static void main(String[] args) {
		// num1 변수 10, num2 변수 3을 소수점 2자리 까지 출력하세요 
		// int로 선언. 
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%d / %d = %.2f \n ",num1,num2,(double)num1/num2);
		
		// 변수 n1  = 3.14 변수 n2 = 5
		// n1+n2 결과값 = 7.14

		double n1 = 3.14;
		int n2 = 5; 
		System.out.printf("[%.2f + %d = %.2f] \n",n1,n2,n1+n2);
		
		int kor = 100;
		int eng = 100; 
		int math = 99;
		
		System.out.printf("[합계 : %d , 평균: %.2f] ",(kor+eng+math),(kor+eng+math)/3.0);
		System.out.println();
		
		
	
	}

}
