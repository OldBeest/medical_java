package p0627;

public class Scv extends GroundUnit{
	
	Scv(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit u = (Unit) r;
		while(u.hitPoint < u.MAX_HP) {
			System.out.println("에너지를 5씩 회복합니다.");
			u.hitPoint += 5;
			if(u.hitPoint >= u.MAX_HP) {
				u.hitPoint = u.MAX_HP;
			}
		}
	}
}
