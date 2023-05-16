package j0515;

public class C0515_05 {

	public static void main(String[] args) {
		// 5,4 배열 1-20까지 수 넣기
		// 2차원 배열 
		
		int[][] box = new int[5][4];
		int[] num = new int[20];
		
		for(int i = 0; i<num.length;i++) {
//			num[i]=i+1;
			if(i<16) num[i]=0;
			else num[i]=1;
			
		}
		int random=0, temp=0;
		for(int i = 0; i<100;i++) {
			random = (int)(Math.random()*20);
			temp = num[0];
			num[0]=num[random];
			num[random] = temp; 	
		}
		
		// 1 차원 배열 섞기
		
		
		
//		for(int i = 0; i<num.length;i++) {
//
//			System.out.print(num[i]+"\t");
//		}
//		
//		System.out.println();
		
		
		
		

		for(int i = 0; i<box.length;i++) {
			for(int j = 0; j<box[i].length;j++) {
				
//				box[i][j] = i*box[i].length+(j); //0-19
				box[i][j] = num[i*box[i].length+j]; //0-19
			}
		}
		
		for(int i = 0; i<box[0].length;i++){
			System.out.print("\t"+i);
		
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		
		for(int i = 0; i<box.length;i++) {
			System.out.print(i + "|\t");
			for(int j = 0; j<box[i].length;j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

	}

}
