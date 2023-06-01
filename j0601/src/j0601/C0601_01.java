package j0601;

import java.text.SimpleDateFormat;
import java.util.*;

public class C0601_01 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today.toString());
		
		// simple dateformat : 날짜 형태를 지정하는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(today));
		
		// 줄: 왠만하면안썻음좋겟다 
		System.out.println(today.getDate()); // 일
		System.out.println(today.getDay()); // 요일 0-일.  
		System.out.println(today.getHours()); // 요일 0-일.  
		
		// 객체선언- 싱글톤 패턴 
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		Date date1 = cal.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date1));
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // 0월부터 시작
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
