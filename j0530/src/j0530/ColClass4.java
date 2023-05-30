package j0530;

import java.util.*;

public class ColClass4 {
	
	
	Map<String, Object> execute4(){
		
		ArrayList<Student> list = new ArrayList(); 
		
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,98,99));
		list.add(new Student(3,"이순신",90,91,90));
		list.add(new Student(4,"강감찬",90,91,90));

		int nowPage = 1; 
		int startRow = 1; 
		int endRow = 10; 
		Map<String, Object> map = new HashMap<>();
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", startRow);
		
		return map;
	}
		
	
	
	
	

}
