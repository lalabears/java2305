package C0512;

import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		// 배열의 활용 
		// 로또 프로그램 
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 생성
		int[] lotto = new int[45];
		int random = 0 ;  // 랜덤번호
		int temp = 0 ;    // 임시저장변수
		int count = 0; // 당첨번호 개수 
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		
		// 2. 로또 번호 생성
		for(int i = 0 ; i< lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		
		// 2-2 로또번호 입력
		for(int i = 0 ; i< 6; i++) {
			System.out.println("번호입력(6개)");
			myNum[i] = scan.nextInt();
		}
		
		
		
		// 3. 번호 섞기
		for(int i = 0 ; i< 1000; i++) {

			random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random]; 
			lotto[random] = temp; 
			
			
			
		}
		
		// 4. 로또번호 확인
		for(int i = 0 ; i<6; i++) {
			for(int j = 0 ; j<6; j++) {
				if(lotto[i]==myNum[j]) {
					lottoNum[count] = lotto[j];
					count++;
					continue;
				}
			}
		}

		
		// 출력
		System.out.println("당첨 개수 : "+ count);
		System.out.print("당첨 번호 :  " );
		for(int i = 0 ; i< count ; i++) {
			System.out.print(lottoNum[i]+" ");	
		}
		System.out.println();
		
		System.out.println("입력번호 출력");
		for(int i = 0 ; i< 6 ; i++) {
			System.out.print(myNum[i]+" ");	
		}
		System.out.println();
		System.out.println("로또번호 출력");
		for(int i = 0 ; i< 6 ; i++) {
			System.out.print(lotto[i]+" ");	
		}
		System.out.println();
		
		
		
		
		
		
		
		

	}

}
