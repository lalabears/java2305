package j0525;

public class Scv extends GroundUnit{
	
	Scv(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	// 사람을 고칠 수 없다. 
	void repair(Repairable g) {
		// Repairable g = new Tank(); // 다형성
		// 
//		Tank t = (Tank)g;
		Unit u = (Unit)g;
		
		
		
		
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		System.out.println("수리가 완료되었습니다. ");
	}

}
