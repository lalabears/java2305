package C0512;

import java.util.Arrays;
import java.util.Collections;

public class C0512_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,11,23,45,2,3,9,5};
//		Arrays.sort(arr1); // 오름차순 
		
		Integer[] arr = {1,11,23,45,2,3,9,5};
		
		Arrays.sort(arr,Collections.reverseOrder()); // 내림차순
		
		for(int i = 0 ; i< arr.length ; i=i+2) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("단순 for ");
		
		// 단순 for
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		

//		System.out.print("print");
//		System.out.print("\n");
//		
//		System.out.println("한줄띄기 \t ㅈㄷㄷㄷ");
//		
//		int n = 10;
//		System.out.println(n);
//		System.out.println("한줄띄기 \t ㅈㄷㄷㄷ    n "+ n +"  " );
//
//		
//		
//		
//		System.out.printf("%d \t %.2f",10,0.1234); // format이 있는print 
//		System.out.printf("%d", n);
//		System.out.printf("%d", n+10);
//		System.out.printf("%d", n+100);
//		System.out.printf("%d", n);
	}

}
