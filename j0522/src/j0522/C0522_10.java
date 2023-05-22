package j0522;


public class C0522_10 {

	
		
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.stuNo);
		
		
		Student s2 = new Student();
		System.out.println(s2.stuNo);
		Student s3 = new Student();
		System.out.println(s3.stuNo);
		Student s4 = new Student();
		System.out.println(s4.stuNo);
		
		// 객체 선언.
		// 매개변수가 있는 생성자 호출
		Student s6 = new Student("홍길동",100,100,100);
	
		System.out.println(s6.avg);
		
		
		
		
	}

}
