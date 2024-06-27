package p0627;

abstract public class Unit {
	
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
	int x, y;
	
//	abstract void move(int x, int y); // 추상 메소드
	
	void stop() {
		
	}
}
