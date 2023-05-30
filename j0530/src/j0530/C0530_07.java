package j0530;

import java.util.*;

public class C0530_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// set 
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		HashSet hs = new HashSet();
		hs.add("abc");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("abc");
		hs.add("bbb");
		hs.add("aaa");
	
		Iterator ht = hs.iterator();
		while(ht.hasNext()) {
			System.out.println(ht.next());
		}
		
		
		
	}

}
