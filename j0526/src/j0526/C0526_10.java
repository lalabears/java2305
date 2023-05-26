package j0526;

import java.util.*;

public class C0526_10 {

	public static void main(String[] args) {
		String data1 = "1001,홍길동,100,100,99";
		
		String[] arr = data1.split(",");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int stuNo = Integer.parseInt(arr[0]);
		System.out.println(stuNo);
		String name = arr[1];
		int kor = Integer.parseInt(arr[2]);
		int eng = Integer.parseInt(arr[3]);
		int math = Integer.parseInt(arr[4]);
		
		Student s = new Student(stuNo,name,kor,eng,math);
		
		int total = s.getTotal();
		double avg = s.getAvg();
		System.out.println(total);
		System.out.println(avg);
		
		
		String[] chk_info = new String[3];
		chk_info[0] = "HTML";
		chk_info[1] = "CSS";
		chk_info[2] = "웹디자인";
		
		
		String info ="";
//		info = chk_info[0]+","+chk_info[1]+","+chk_info[2];
		for(int i = 0;i<chk_info.length;i++) {
			if(i == 0)
				info += chk_info[i];
			else
				info += ","+chk_info[i];
		}
		
		
		System.out.println(info);
		
		
		
		
	}

}
