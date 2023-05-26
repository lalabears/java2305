package j0526;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C0526_02 {
	public static void main(String[] args) {
		
//		File dir = new File("C:/bbb");
//		dir.mkdirs();
//		System.out.println("폴더가 생성되었습니다. ");
//		
//		File f = new File("c:/bbb/text.txt");
//		
//		try {
//			f.createNewFile();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일이 생성되었습니다. ");		
		
		FileWriter fw = null;
		String str ="";
		
		try {

			fw = new FileWriter("c:/bbb/text.txt");
			for (int i = 0; i< 10; i++) {
				str = str + "글자를 저장합니다.\n";
				fw.write(str); // 글자를 저장하는 메소드
				fw.flush();// 버퍼에 있는 모든것들을 저장해라
			}
				
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		System.out.println("글자가 저장되었습니다. ");		
		
		
	}

//	public static void main(String[] args) throws Exception {
//		                                   // throws Exception 에러나면 난 몰라. 
//
//		FileWriter writer = null;
//		writer = new FileWriter("C:/data/test.txt"); // 글자를 저장
//		String str = "두산 베어스 포수 윤준호가 제법 ‘최강 몬스터즈’ 티를 벗었다. 이제 최강야구 윤준호보다 두산 베어스 윤준호가 더 입에 달라 붙는다.\r\n"
//				+ "\r\n"
//				+ "2023년 신인 5라운드 전체 49순위로 팀에 입단한 윤준호는 지난해 예능 프로그램 ‘최강야구’ 주전 포수를 맡아 프로 입단 전부터 큰 주목을 받았다. 공교롭게도 당시 최강 몬스터즈 사령탑이었던 이승엽 감독이 두산 사령탑으로 부임해 그 인연이 더 조명되기도 했다.";
//		writer.write(str);
//		writer.close();
//		
//		
//		System.out.println("종료");
		
		
		
				
//		File file = new File("C:/data/test.txt"); // file 생성
//		
//		try {
//			file.createNewFile(); // 파일을 생성해주세요 
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}	
//		System.out.println("파일이 생성되었습니다.");
		
		
		
		
		
		
		
//	}

}
