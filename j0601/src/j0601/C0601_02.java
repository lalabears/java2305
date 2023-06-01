package j0601;

import java.text.SimpleDateFormat;
import java.util.*;

public class C0601_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		
		System.out.println("학번 입력 : >> ");
		int stuNo = scan.nextInt();
		System.out.println("이름 입력 : >> ");
		String name = scan.next();
		System.out.println("국어 입력 : >> ");
		int kor = scan.nextInt();
		System.out.println("영어 입력 : >> ");
		int eng = scan.nextInt();
		System.out.println("수학 입력 : >> ");
		int math = scan.nextInt();
		
		String createDate =sdf.format(today);
		String updateDate =sdf.format(today);
		
		
		Student s = new Student(stuNo, name, kor, eng, math, createDate,updateDate);
		
		System.out.println(s.getCreateDate());
		System.out.println("Saved --------");
		
		
	}

}
