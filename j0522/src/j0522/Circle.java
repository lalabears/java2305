package j0522;

public class Circle extends Shape {
	
	// 다른 클래스를 사용하려면 객체선언 후 참조변수명.변수명
	Point center; // 변수만 선언
	int r ; 
	
	Circle(){
		this(new Point(0,0),100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("");
	}
	
	
	
	
	
	
	
//	Point p = new Point();
	
//	center = p; 
	
	
	
	
	
	

}
