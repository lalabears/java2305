package j0531;

import java.util.*;

public class C0531_01 {

	public static void main(String[] args) {
		// 다형성 부모의 참조변수로 자손의 객체를 다루는 것 
		
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		System.out.println(list.get(1));
		
		for(int i = 0 ; i <list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		List list2 = new ArrayList();
		list2.add(new Student(1,"홍길동",100,100,100));
		list2.add(new Student(2,"유관순",90,90,100));
		
		System.out.println(  ((Student)list2.get(1)).getName()  );
		
		
		List<Student> list3 = new ArrayList();
		list3.add(new Student(1,"홍길동",100,100,100));
		list3.add(new Student(2,"유관순",90,90,100));
		
		System.out.println( list3.get(1).getName() );
		
		
		Student ss = list3.get(0); 
		System.out.println( ss.getName() );
		
		
	}

}
