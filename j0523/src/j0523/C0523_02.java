package j0523;

public class C0523_02 {

	public static void main(String[] args) {
	
		Deck d = new Deck();
		
		// pick() 카드뽑기 메서드
//		System.out.printf("%s %d\n",d.pick(13).kind,d.pick(13).number);
	
		d.shuffle();
//		System.out.printf("%s %d\n",d.c[0].kind,d.c[0].number);

		for(int i = 0; i<52;i++) {
			//System.out.println(d.c[i].kind +Card.numbers[d.c[i].number-1]);
			System.out.println(d.c[i]);
		}
		
	}

}
