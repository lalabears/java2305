package j0525;

//import java.util.ArrayList;
import java.util.*;

public class C0525_01 {
	
	public static void main(String[] args) {
	
		Card[] c = new Card[3];
		
		
		Card c1 = new Card(Card.kinds[0],1);
		Card c2 = new Card(Card.kinds[1],1);
		Card c3 = new Card(Card.kinds[2],1);
		Card c4 = new Card(Card.kinds[3],1);
		
		c[0]=c1;
		c[1]=c2;
		c[2]=c3;
		
		// 배열은 3으로 크기를 설정했을때 3개까지만 담을 수 있다. 
		//c[3]=c4; // error.. !! 배열의 크기를 바꿔주면된다. 
		
//		// arraylist를 사용하는 이유? -> 배열의 크기가 정함이 없이 사용할 수 있다 
//		ArrayList list = new ArrayList();
//		// Arraylist 추가
//		list.add(c1); // add()매개변수의 type: Object 
//					  // Object o = new Card(Card.kinds[0],1);
//		list.add(c2);
//		list.add(c3);
//		list.add(c4);
//		
//		// Arraylist 읽기
//		list.get(0);
//		System.out.println(c1);
//		System.out.println(list.get(0));
//		
//		Card card = (Card)list.get(0);
//		System.out.println(card.kind+card.number);
//		
		
		// 형변환없이 사용하려면.. 
		
		ArrayList<Card> list = new ArrayList();
		list.add(c1); 
		list.add(c2);
		list.add(c3);
		list.add(c4);
//		list.add( new Card(Card.kinds[3],1));
//		
//		list.remove(4);
//		
		
		for(int i = 0 ; i < list.size() ; i++) {	
//			if(list.get(i).kind == Card.kinds[1]) {
//				list.remove(i);
//			}
			if(list.get(i).number == 4) {
				list.remove(i);
			}
		}
		for(int i = 0 ; i < list.size() ; i++) {	
			System.out.println(list.get(i).kind+list.get(i).number);
		}
		
		
		// Arraylist : 삭제햇을때 공간 삭제. 정렬가능
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
