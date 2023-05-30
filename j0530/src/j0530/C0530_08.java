package j0530;

import java.util.*;

public class C0530_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// set 
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
//		System.out.println(list.get(0));
		System.out.println("---------------------");
		
		HashMap map = new HashMap();
		map.put("id", "aaa");
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");
		System.out.println(map.get("id"));
		
		System.out.println("---------------------");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
