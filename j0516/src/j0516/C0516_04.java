package j0516;

public class C0516_04 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name="홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
		s1.sum();
		s1.average();
		
		System.out.println(s1.avg);
		
		Student s2 = new Student();
		
		s2.name="유관순";
		s2.kor = 99;
		s2.eng = 99;
		s2.math = 99;
		s2.sum();
		s2.average();
		
		
		
		
	}

}
