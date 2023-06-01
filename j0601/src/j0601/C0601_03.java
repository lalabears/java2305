package j0601;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class C0601_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		File f = new File("C:/savedata/a.txt");
		FileWriter fw = null;
		String data = "\r\nhello";
		try {
			 fw = new FileWriter(f,true);
			 
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
