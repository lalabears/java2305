package j0531;

import java.util.*;
import java.io.*;

public class C0531_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File f = new File("C:/savedata/c.txt");
		
		// reader 
		
//		FileReader fr = null;  // 한byte씩 읽어옴 -> 한글을 읽을 수 없다 
//		BufferedReader br = null;  // 한줄씩 읽어옴 
//		try {
//			br = new BufferedReader(new FileReader(f));
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				System.out.println(line);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
		
		
		// writer 
		FileWriter fw = null;
		try {
			 fw = new FileWriter(f);
			 String data = "파일쓰기를 시작합니다\r\n";
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
