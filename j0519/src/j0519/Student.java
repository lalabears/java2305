package j0519;

public class Student {
	
	// 기본생성자
	Student(){
		// 생성자 
		// 없으면 자바가 알아서 넣어준다. 
	}
	// 오버로딩
	Student(String n, int k, int e, int m){
		// 매개변수가 있는 생성자 
		name = n;
		kor = k;
		eng = e;
		math = m;
		sum();
		average();
		
	}
	
	
	static String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	String name;
	int kor; 
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
		total = kor+eng+math;
	}
	
	void average() {
		avg = total/3.0;
	}
	
	

}
