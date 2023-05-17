package j0517;

public class C0517_06 {

	public static void main(String[] args) {
		C0517_06 c = new C0517_06();
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10; 
		System.out.println("d.x : "+ d.x);
		System.out.println("----------------");
		change(d.x); //1000
		int num = add(1,2);
		System.out.println("after change d.x : "+ d.x);
		
		System.out.println("----------------");
		change(d); // 주소 값을 보냄 
		System.out.println("after change d.x : "+ d.x);
		
		
		

	}
	static void change(int x) {
		x = 1000;
		System.out.println("x : "+x);
//		return x;
	}
	static void change(Data k) {
		k.x = 1000;
		System.out.println("x : "+k.x);
//		return x;
	}
	static int add(int a , int b) {
		return a+b; 
	}

}
