package j0522;


public class C0522_07 {

	int x ;
	int y = x; 
	char ch;
	String str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0 ; 
		int b= a;
		
		//a b x y 출력 하기
		C0522_07 c = new C0522_07();
		System.out.println(a+","+b+","+c.x+","+c.y);
		System.out.println(c.ch);
		System.out.println(c.str);
		
	}

}
