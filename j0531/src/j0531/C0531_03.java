package j0531;

import java.util.*;
import java.io.*;

public class C0531_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 외부 접속시 try catch
		
		// output stream 
		
		OutputStream os=null;
		
		try {
			os = new FileOutputStream("C:/savedata/a.txt");
			String str = "감사합니다. 반갑습니다.\r\n안녕하세요.\r\n";
			System.out.println("원하는 글자를 입력하세요");
//			str = scan.nextLine();
			byte[] bs = str.getBytes();
			os.write(bs);
			
		} catch (Exception e) {
			
			e.printStackTrace();

		
		}finally {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
//		// input stream
		InputStream is = null;
		try {
			is = new FileInputStream("C:/savedata/a.txt"); // 1byte => 한글은 처리할 수 없다. 
			int i=-1;
			while(true) {
				if((i = is.read()) == -1) break;
				System.out.println((char)i);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
			
			
		
		
		
		
	}

}
