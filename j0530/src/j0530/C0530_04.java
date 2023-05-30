package j0530;

import java.util.*;

public class C0530_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// list :객체들의 집합, 데이터 이동 및 저장용도로 사용
		Student s = new Student();
		
		
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");
		list.add("ccc");
		list.add(3); // Integer type
//		System.out.println(list.get(2));
		
		
		for(int i = 0 ; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
//		
//		ArrayList<Student> list2 = new ArrayList(); // 특정 클래스만입력 
////		ArrayList list2 = new ArrayList();
//		list2.add(new Student(1,"홍길동",100,100,100));
//		list2.add(new Student(2,"유관순",90,90,99));
//		list2.add(new Student(3,"이순신",80,80,87));
//		
//		for(int i = 0 ; i< list2.size();i++) {
//			
////			System.out.println(((Student)list2.get(i)).getName());
//			System.out.print(list2.get(i).getStuNo()+"\t"+list2.get(i).getName()+"\t"+list2.get(i).getKor()+"\t");
//			System.out.printf("%.2f\n",list2.get(i).getAvg());
//			
//		}
	}

}
