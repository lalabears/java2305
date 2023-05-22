package j0522;

import java.util.Scanner;

public class C0522_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Data d1 = new Data();
		// num1 num2 data1 data2 data3 data4 가 만들어짐 
		
		Data d2 = new Data();
		// num1 num2 data1 data2 data3 data4 가 만들어짐 
		
		Data d3 = new Data(1,2);
		
		// 배열에 대한 선언
		Data[] d = new Data[5];
		
		//d[0] = d1; // 객체선언된 변수 넣기 
		d[0] = new Data(); // 객체 선언하는 것을 넣기 
		
		d[1] = d2;
		d[2] = d3;
		
		d[3].num1 = 10;
		d[3].num2 = 30;
		
		
		
		
		
		
		
		
	}

}
