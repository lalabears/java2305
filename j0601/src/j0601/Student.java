package j0601;

public class Student {
	
	
	static String[] title = { "학번","이름", "국어", "영어", "수학", "합계", "평균","등수" };
	static int count =1000 ; // 클래스 변수
//	String stuNo = "2023";
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String createDate;
	private String updateDate;
	
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor>100 || kor<0) {
			return;
		}
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	{  
		++count;
		stuNo = count;
	}
	
	Student() {
		
	} 
	Student(int stuNo, String name, int kor, int eng, int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.total = kor+eng+math;
		this.avg= this.total/3.0;
	}
	
	Student(int stuNo, String name, int kor, int eng, int math, String createDate){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.total = kor+eng+math;
		this.avg= this.total/3.0;
		this.createDate = createDate;
	}
	Student(int stuNo, String name, int kor, int eng, int math, String createDate, String updateDate){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.total = kor+eng+math;
		this.avg= this.total/3.0;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	

	
	

} // student
