package j0523;

public class Card{
	
	static String[] kinds = {"Spade","Heart","Diamond","Clover"};
	static String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	                        // 0   1   2   3
							 //1   2   3   4
	                               
	
	String kind; // 무늬
	int number;  // 숫자 
	

	Card(){}
	Card(String kind){
		this.kind = kind;
		
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	// object 꺼 
	@Override
	public String toString() {
		String str =kind+","+number;
		return str;
//		return super.toString();
	}
}
