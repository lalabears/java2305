package j0511;

public class C0511_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0, sum = 0;
//		
//		while(true) {
//			if(sum>100) break; 
//			
//			
//			i++;
//			sum = sum+i;
//			
//			
//		}
//		
//		System.out.println(i);
//		System.out.println(sum);
		
		int i, sum = 0 ;
		for (i = 0 ;;i++) {
			if(sum>100) break;
			sum = sum+ i;
		}
		System.out.println(i);
		System.out.println(sum);

	}

}
