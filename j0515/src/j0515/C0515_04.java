package j0515;

public class C0515_04 {

	public static void main(String[] args) {

		// 2차원 배열 
		
		int[][] box = new int[4][3];
		int count = 0;
		for(int i = 0; i<box.length;i++) {
			for(int j = 0; j<box[i].length;j++) {
				
				box[i][j] = i*box[i].length+(j+1);
			}
		}
		
//		for(int i = 0; i<box.length;i++){
//			System.out.print(i+"\t");
//		
//		}
//		System.out.println();
		System.out.println("----------------------------------");
		
		
		for(int i = 0; i<box.length;i++) {
//			System.out.print(i + "|\t");
			for(int j = 0; j<box[i].length;j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
//		
//		for(int i = 1; i<10;i++) {
//			if(i%3==0) continue;
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.println();
//
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {3,9,8,2,1};
//		int count  = 0;
//		int[] arr3 = new int[5];
//
//		for(int i = 0; i<arr1.length;i++) {
//			for(int j = 0; j<arr2.length;j++) {
//				if(arr1[i] == arr2[j]) {
//					arr3[count] = arr1[i];
//					count++;
//					continue;
//				}
//				System.out.println("print"+i+","+j);
//			}
//		}
//		
//		for(int i = 0; i<count;i++) {
//			
//			System.out.print(arr3[i]+"\t");
//		}
//		
		
	}

}
