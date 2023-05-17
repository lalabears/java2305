package j0517;

public class C0517_07 {

	public static void main(String[] args) {
		
		
		int[] num = new int[2];
		
		int a = 10;
		int b = 5; 
		
		calculator(num,a,b);
		System.out.println("합계: "+num[0]+", 평균: "+num[1]);

	}
	
	static void calculator(int[] num, int a, int b){
		// 주소값은 return할 필요가 없다 
		// 배열은 주소값을 보내는 것이다. 
		num[0] = a+b;
		num[1] = (a+b)/2;
	}

}
