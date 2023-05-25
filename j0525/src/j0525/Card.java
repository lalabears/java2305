package j0525;

public class Card {
	
	static String[] kinds = {"Spade","Heart","Diamond","Clover"};
	static String[] numbers= {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String kind; // 무늬
	int number;  // 숫자 

	Card(){
		this(kinds[0],1); // 기본생성자: spade A
	}
	Card(String kind){
		this.kind = kind;
		
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
//	@Override
//	public String toString() {
//		String str =kind+","+number;
//		return str;
//	}

}
