
public class Student {
	
	
	static String[] title = { "학번","이름", "국어", "영어", "수학", "합계", "평균","등수" };
	static int count =1000 ; // 클래스 변수
//	String stuNo = "2023";
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{  
		++count;
		stuNo = count;
	}
	
	Student() {
		
	} 
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.total = kor+eng+math;
		this.avg= this.total/3.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균","등수" };
//	String name;
//	int kor;
//	int eng;
//	int math;
//	int total;
//	double avg;
//	int rank;
//	
//	void sum() {
//		total = kor+eng+math;
//	} // sum
//	void average() {
//		avg=total/3.0;
//	} // avg

} // student
