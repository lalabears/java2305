package j0515;

import java.util.Scanner;

public class C0515_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[45];
		//Q. 1-10을 배열에 넣어주세요
		
//		
//		for(int i = 0 ; i <10 ; i++) {
//			arr[i]=i+1;
//		}
		
		Scanner scan = new Scanner(System.in);
		
		int random = 0; 
		int temp = 0; 
		
		// 1-45 넣기 
		for(int i = 0 ; i <45 ; i++) {
			arr[i]=i+1;
		}
		
		
		// 섞기 
		for(int i = 0 ; i <45 ; i++) {
			random = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[random];
			arr[random] =temp; 
		}
		
		
		int[] myNum =new int[6]; 
		// 번호 입력
		for(int i = 0 ; i <myNum.length ; i++){
			System.out.println(i+1+"번째 숫자를 입력해주세요 ");
			myNum[i]=scan.nextInt();
		}
		
		
		
		// 맞춘개수 출력
		int count = 0; 
		int[] lottoNum=new int[6];
		for(int i = 0; i<6;i++) {
			for(int j = 0 ; j<6 ; j++) {
				if(arr[i]==myNum[j]) {
					lottoNum[count]=arr[i];
					count++;
					continue;
				}
			}
		}
		
		
		
		
		
		
		// 출력
		System.out.print("당첨개수 : " + count +"\n당첨된 번호 : \t");
		for(int i = 0 ; i <count ; i++){
			System.out.print(lottoNum[i]+"\t");
		}
		System.out.println();
		System.out.println("입력한 번호");
		for(int i = 0 ; i <myNum.length ; i++){
			System.out.print(myNum[i]+"\t");
		}
		System.out.println();
		System.out.println("로또 번호");
		for(int i = 0 ; i <myNum.length ; i++){
			System.out.print(arr[i]+"\t");
		}
		
		
		
		
		

	}

}
