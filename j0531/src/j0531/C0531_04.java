package j0531;

import java.util.*;
import java.io.*;

public class C0531_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File f = new File("C:/savedata/b.txt");
		
		// reader 
		
		FileReader fr = null;  // 한byte씩 읽어옴 -> 한글을 읽을 수 없다 
		BufferedReader br = null;  // 한줄씩 읽어옴 
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
//		// writer 
//		FileWriter fw = null;
//		try {
//			 fw = new FileWriter(f);
//			 for (int i = 0 ; i<10;i++) {
//				 String data = i+"th line\r\n";
//				 fw.write(data);
//				 
//			 }
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}finally {
//			try {
//				fw.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
	}

}
