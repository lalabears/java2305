package j0530;

import java.util.*;

public class C0530_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ColClass c = new ColClass();
		ColClass2 c2 = new ColClass2();
		ColClass3 c3 = new ColClass3();
		ColClass4 c4 = new ColClass4();
		
		Map<String, Object> map = new HashMap<>();
		
		map = c.execute();
		
		
		System.out.println(map.get("startRow"));
//		System.out.println(map.get("list"));
		
		ArrayList l = (ArrayList)map.get("list");
		
		Student s = (Student)l.get(0);
		System.out.println(s.getName());
		
		// 메소드에서 1개만 리턴 
		
		int a = c2.execute2();
		System.out.println(a);
		
		
		ArrayList list = new ArrayList(); 
		
		list = c3.execute3();
		System.out.println(((Student)list.get(0)).getName());
		
		//
		Map<String, Object> map1 = new HashMap<>();
		
		map1 = c4.execute4();
		System.out.println(map1.get("startRow"));
		
		
	}

}
