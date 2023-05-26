package j0526;

import java.io.FileWriter;

public class C0526_03 {

	public static void main(String[] args) throws Exception {

		FileWriter fw = null;
		fw = new FileWriter("c:/bbb/ttt.txt");
		
		String str = "";
		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		for (int i = 0; i< name.length; i++) {
			str = str + (1001+i) +"," + name[i] + ",100,100,100 \r\n";
		}
		fw.write(str);
		fw.flush();// 버퍼에 있는 모든것들을 저장해라
		fw.close();
		
		
		
		
		
		
	}

}
