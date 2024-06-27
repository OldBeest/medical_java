package p0627;

public interface Fightable {// 다중상속 가능
	void move(int x, int y);
	void attack(Unit u);
}
