package j0522;

public class Car {
	
	String color;
	String gearType;
	int door; 
	
	// 기본생성자
	Car(){ 
		this("white", "auto",4);
	}
	// 매개변수가 있는 생성자 
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	
	}
	// 매개변수로 객체 참조변수를 받는다. 
	Car(Car c){
		this(c.color,c.gearType,c.door);
//		color = c.color;
	}

}
