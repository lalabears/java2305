package j0523;

public class Deck {

	Card[] c = new Card[52];
	
	Deck() {		
		for(int i =0; i<4 ; i++) {
			for (int j = 0 ; j<13; j++) {
				c[i*13+j] = new Card(Card.kinds[i],j+1);
			}
		}
		
//		for(int i =0; i<52 ; i++) {
//			c[i] = new Card();
//			c[i].kind =Card.kinds[i/13];
//			c[i].number = (i%13)+1;
//		}
			
			
	}// 생성자
	
	// 카드뽑기
	Card pick(int index) {
		return c[index];
	}
	
	// 섞기
	void shuffle() {
		int random = 0;
		Card temp=null;
		for(int i = 0; i<1000;i++) {
			random = (int)(Math.random()*52);
			temp = c[0];
			c[0]=c[random];
			c[random] = temp;
		}
	}
	
	
}
