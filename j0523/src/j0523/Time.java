package j0523;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(){}
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// getter - hour 
	public int getHour() {
		return hour;
	}
	// setter - hour 
	public void setHour(int hour) {
		if(hour>24 || hour<0) {
			System.out.println("데이터가 잘못 입력되었습니다. ");
			return;
		}
		this.hour = hour;
	}
//if(minute>60 || minute<0) return;
//if(second>60 || second<0) return;

}//class