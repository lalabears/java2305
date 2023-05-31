package j0531;

import java.util.*;
import java.io.*;

public class C0531_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File f = new File("C:/savedata/student.txt");
		
		List<Student> list = new ArrayList();
//		BufferedReader br = null;  
//		try {
//			br = new BufferedReader(new FileReader(f));
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				String[] str = line.split(",");
//				list.add(new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4])));
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//			
//		}
		
		list.add(new Student(1,"홍길동",100,100,100 ));
		list.add(new Student(2,"이순신",99,98,99 ));
		list.add(new Student(3,"유관순",100,99,99 ));
		list.add(new Student(4,"김구",99,100,98 ));

		
		// writer 
		FileWriter fw = null;
		String data = "";
		try {
			 fw = new FileWriter(f);
			 for(int i = 0 ; i<list.size();i++) {
				 data +=  list.get(i).getStuNo()+","+
						 list.get(i).getName()+","+
						 list.get(i).getKor()+","+
						 list.get(i).getEng()+","+
						 list.get(i).getMath()+"\r\n"
						 ;
				 
			 }
			 fw.write(data);
				 
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
