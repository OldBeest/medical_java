package p0627;

public class C0627_01 {

	public static void main(String[] args) {
		
//		Unit u = new Unit(); // 객체선언 불가
		Marine m = new Marine(); // 객체선언 가능
		System.out.println("현재 체력 : " + m.hitPoint);
		Tank t = new Tank();
		System.out.println("현재 체력 : " + t.hitPoint);
		DropShip d = new DropShip();
		System.out.println("현재 체력 : " + d.hitPoint);
		
		System.out.println("탱크가 포탄을 맞았습니다.");
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		System.out.println("현재 체력 : " + t.hitPoint);
		hpDown(d);
		hpDown(d);
		System.out.println("현재 체력 : " + d.hitPoint);
		hpDown(m);
		hpDown(m);
		hpDown(m);
		System.out.println("현재 체력 : " + m.hitPoint);
		
		
		Scv s = new Scv(); // 수리할 수 있는 능력
		System.out.println("탱크 수리를 진행합니다.");
		s.repair(t);
		System.out.println("현재 탱크 체력 : " + t.hitPoint);
		System.out.println("수송선 수리를 진행합니다.");
		s.repair(d);
		System.out.println("현재 수송선 체력 : " + d.hitPoint);
//		s.repair(m);
		System.out.println("현재 해병 체력 : " + m.hitPoint);
	}
	
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
	}
}
