package j0522;


public class C0522_08 {

	static int cv = 1;
	int iv = 1; 
	
	static {
		cv = 2; // 클래스 초기화 블럭
	}
	
	{
		iv = 2; // 인스턴스 초기화 블럭
	}
	
	C0522_08(){
		iv = 3; 
	}
		
	public static void main(String[] args) {
		
		C0522_08 c = new C0522_08();
		
		c.iv = 4;
		
		//iv = 3;
		System.out.println(c.iv);
		// 초기화
		
		
		
	}

}
