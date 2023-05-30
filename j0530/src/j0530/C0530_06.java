package j0530;

import java.util.*;

public class C0530_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		
		System.out.println(list.size() + " : " + list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		Enumeration e = Collections.enumeration(list);

		
//		for(int i = 0 ; i< list.size();i++) {
//			System.out.println(list.get(i));
//		}

//		System.out.println("---------------------------");
//		list.remove(3);
//		list.remove(4);
//		for(int i = 0 ; i< list.size();i++) {
//			System.out.println(list.get(i));
//		}
//
//		for(int i = list.size()-1 ; i>=0;i--) {
//			list.remove(i);
//		}
//		System.out.println(list);
//		
		
	}

}
