package j0522;

import java.util.Scanner;

public class C0522_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Data[] d = new Data[2];
		int n1=0, n2=0;
		for (int i = 0 ; i<2 ; i++) {
			System.out.println("입력:");
			n1 = scan.nextInt();
			System.out.println("입력:");
			n2 = scan.nextInt();
			
			d[i] = new Data(1,2);
			d[i] = new Data(n1,n2);
			System.out.printf("%d+%d=%d\n",d[i].num1,d[i].num2,d[i].data1);
			System.out.printf("%d-%d=%d\n",d[i].num1,d[i].num2,d[i].data2);
			System.out.printf("%d*%d=%d\n",d[i].num1,d[i].num2,d[i].data3);
			System.out.printf("%d/%d=%d\n",d[i].num1,d[i].num2,d[i].data4);
		
		}

	}

}
