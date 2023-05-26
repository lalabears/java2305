package j0526;

public class C0526_04 {

	public static void main(String[] args)  {

		Person p1 = new Person(8801011111111L);
		Person p2 = new Person(8801012111111L);
		Person p3 = new Person(8801011111111L);
		
		
		// 객채는 == 으로 비교할 수 없다.
		if(p1.equals(p3)) {
			System.out.println("같다");
		}else {
			System.out.println("다름");
			
		}
		
		
		Person p4 = new Person(p1);
		
		System.out.println(p1);
		System.out.println(p4);
		
		
		System.out.println(p1.id);
		System.out.println(p2.id);
		System.out.println(p3.id);
		
		
		
	}

}
