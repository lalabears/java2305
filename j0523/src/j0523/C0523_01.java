package j0523;

public class C0523_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		for(int i = 0; i<52;i++) {
			System.out.println(d.c[i].kind +Card.numbers[d.c[i].number-1]);
		}
	

	}

}
