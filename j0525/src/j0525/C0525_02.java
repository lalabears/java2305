package j0525;

//import java.util.ArrayList;
import java.util.*;

public class C0525_02 {
	
	public static void main(String[] args) {
		
		ArrayList<Card> list = new ArrayList();
	
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[0],2);
//		Card c3 = new Card(Card.kinds[0],3);
//		
//		list.add(c1); 
//		list.add(c2);
//		list.add(c3);

		// Q1. 1-13 넣기 
//		for(int i = 1; i<14;i++) {
//			list.add(new Card(Card.kinds[0],i)); 
//		}
//		
		
		
		// Q2. card 4개를 만들어, 4가지 종류를 넣으시오 넣기
//		for(int i = 0; i<4;i++) {
//			list.add(new Card(Card.kinds[i],2)); 
//		}
//		
	
		
		for(int i =0; i<52 ; i++) {
			list.add(new Card(Card.kinds[i/13],(i%13)+1)); 
		}

		
		// 출력 
		
		for(int i = 0 ; i < list.size() ; i++) {	
			System.out.println(list.get(i).kind+Card.numbers[list.get(i).number]);
		}
		
		
		
		
		
	}

}
