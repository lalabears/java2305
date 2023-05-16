package j0516;

public class Tv {
	// class 변수 (instance 변수)
	String color;
	boolean power; // 디폴트:false
	int channel;
	int volume =10;
	
//	final int NUM = 0; // 상수 변경불가 
	
	void power() {
		power = !power;
	}
	void channelUp() {
		if(channel>999) {
			channel=1;
		}
		channel++;
	}
	void channelDown() {
		channel--;
		if(channel<0) {
			channel=999;
		}
	}
	void volumeUp() {
		if(volume>=30) {
			volume=30;
			return;
		}
		volume++;
	}
	void volumeDown() {
		if(volume<=0) {
			volume=0;
			System.out.println("볼륨은 0이하로 내려가지 않습니다");
			return;
		}
		volume--;
	}

}
