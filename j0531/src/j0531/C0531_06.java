package j0531;

import java.util.*;
import java.io.*;

public class C0531_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File f = new File("C:/savedata/student.txt");
		List<Student> list = new ArrayList();
		BufferedReader br = null;  
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				list.add(new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
	
		
		
		
		
	}

}
