package j0522;

public class Triangle extends Shape {
	
	// 삼각형은 점이3개 필요
	
	Point[] p ;
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[] {p1,p2,p3};
	}
	
	
	
	
	

}
