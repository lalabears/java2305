package j0508_01;

public class Class0508_05 {

	public static void main(String[] args) {
		// 오버플로우 : 
		// 2147483647 
		
		int num = 2147483647 ; 
		
		System.out.println(num+1);
		System.out.println(num+2);

		int num1 = 1000000;
		int num2 = 2000000;
		System.out.println(num1*num2); // 오버플로우 발생 
		
		int num3 = -2147483648; // 음수의 오버플로우
		System.out.println(num3-1);
		
	}

}
