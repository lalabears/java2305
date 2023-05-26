package j0526;

public class Person {
	
	long id; // 주민번호 880101 1111111 (13자리) 21억보다 커서 long
	
	Person() { }
	Person(long id){
		this.id = id;
	}
	
	
	Person(Person p) {
		this.id = p.id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean chk = false;
		if(id == ((Person)obj).id) {
			chk = true;
		}
		return chk;
	}
//
//	@Override
//	public String toString() {
//		String str = "주민번호 : "+id;
//		return str;
//	}

}
