package j0519;

import java.util.Scanner;

public class C0519_08 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// student 의 객체선언. 기본생성자 호출
		Student s = new Student();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 100;
		s.sum();
		s.average();
		
		Student s1 = new Student();
		s1.name = "유관순";
		s1.kor = 90;
		s1.eng = 90;
		s1.math = 90;
		s1.sum();
		s1.average();
		
		Student s2 = new Student();
		s2.name = "이순신";
		s2.kor = 80;
		s2.eng = 80;
		s2.math = 80;
		s2.sum();
		s2.average();
		
		Student s3 = new Student("홍길자",100,100,100);
		
		
		
		
		
	}// main
	
	


}
