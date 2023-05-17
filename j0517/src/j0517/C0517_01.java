package j0517;

public class C0517_01 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind="Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind="Spade";
		c2.number = 4 ;

		// static은 클래스명.변수명 으로 사용해주자 
		System.out.println("card 가로길이 : " + Card.width);
		System.out.println("card 세로길이 : " + Card.height);
		
		
		System.out.println("c1 카드종류 : " + c1.kind);
		System.out.println("c1 카드넘버 : " + c1.number);
		
		System.out.println("c2 카드종류 : " + c2.kind);
		System.out.println("c2 카드넘버 : " + c2.number);
	}

}
