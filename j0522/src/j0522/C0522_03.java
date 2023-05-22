package j0522;

import java.util.Scanner;

public class C0522_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Data[] d = new Data[2];
		
		for (int i = 0 ; i<2 ; i++) {
			d[i] = new Data();
			
			System.out.println("입력:");
			d[i].num1 = scan.nextInt();
			System.out.println("입력:");
			d[i].num2 = scan.nextInt();
			
			d[i].data1 = d[i].num1+d[i].num2;
			d[i].data2 = d[i].num1-d[i].num2;
			d[i].data3 = d[i].num1/d[i].num2;
			d[i].data4 = d[i].num1%d[i].num2;
					
			
			System.out.printf("%d+%d=%d\n",d[i].num1,d[i].num2,d[i].data1);
			System.out.printf("%d-%d=%d\n",d[i].num1,d[i].num2,d[i].data2);
			System.out.printf("%d*%d=%d\n",d[i].num1,d[i].num2,d[i].data3);
			System.out.printf("%d/%d=%d\n",d[i].num1,d[i].num2,d[i].data4);
		
		}

	}

}
