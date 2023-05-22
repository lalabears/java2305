package j0522;

import java.util.Scanner;

public class C0522_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 기본생성자사용- 출력
		Car c = new Car();
		System.out.println(c.color+c.gearType+c.door);
		// 매개변수 생성자 사용 red auto 5 출력
		
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color+c2.gearType+c2.door);
		
		
		
		Car c3 = new Car(c2);
		c3.color = "blue";
		c3.gearType = "stick";
		c3.door = 3;
		
		Car c4 = new Car(c3);
		c4.color = "yellow";
		
		
	}

}
