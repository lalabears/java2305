package j0525;

import java.util.*;

public class C0525_04 {
	
	public static void main(String[] args) {
		
		
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv(); 
		
		t1.hitPoint -= 10;  
		t1.hitPoint -= 10;  
		System.out.println(t1.hitPoint);
		
		// scv를 호출 
		s1.repair(t1);
		
		System.out.println(t1.hitPoint);
		
		m2.hitPoint -=10;
		m2.hitPoint -=10;
		m2.hitPoint -=10;
		System.out.println(m2.hitPoint);


		Vulture v1 = new Vulture();
		v1.hitPoint -=10;
		v1.hitPoint -=10;

		System.out.println(v1.hitPoint);
		s1.repair(v1);
		System.out.println(v1.hitPoint);
		
	}

}
