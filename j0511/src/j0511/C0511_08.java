package j0511;

import java.util.Scanner;

public class C0511_08 {

	public static void main(String[] args) {
		// 랜덤 숫자 맞추기
		// 10번 기회. 정답 확인시 입력한 번호 출력
		
		int input = 0; 
		int count = 0;
		int random = 0; 
		int[] num = new int[10]; // 입력한 숫자 저장 
		
		random = (int)(Math.random()*100)+1;
		
		
		System.out.println("정답: " + random);
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			if(count>=9) {
				System.out.println("10번 초과" );
				System.out.println("정답: " + random);
				break;
			}
			System.out.println("입력하세요");
			num[count]=scan.nextInt();
			
			if(num[count] == random) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답");
				
			}
			count++;
		}
		
		System.out.println(count);
		
		for(int i = 0 ; i <count+1 ; i++) {
			if (i == 0)
			{
				System.out.print(num[i]);
			}else
			{
				System.out.print(", "+num[i]);
			}
			
			
		}
		
		
		
		
		
		

	}

}
