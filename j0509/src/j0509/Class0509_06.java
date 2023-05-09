package j0509;

import java.util.Scanner;

public class Class0509_06 {

	public static void main(String[] args) {
		//
		
		int num = 5 ; 
		// num = num + 1;
		// num++;
		++num;
		
		System.out.println(num);

		
		int result = 0;
//		result = ++num; 
		result = num++; 
		System.out.println(result);
		
		// 삼항식 
		String str ; 
		str = (num>1) ? "1보다 큽니다":"1보다 작습니다" ;
		System.out.println(str);
		
		// 한개의 정수형을 입력받아 10 보다 큰 수인지 출력하시오 
		// 1. 변수선언
		// 2. 입력
		// 3. 확인 출력 
		
		// 정수를 입력받아 음수면 양수로, 양수면 음수로 변경하세요 
		int input=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");
		input = scan.nextInt();
		int result2 = (input>0) ? -input:-input;
		System.out.println(result2);
		
		
		
		
	}

}
