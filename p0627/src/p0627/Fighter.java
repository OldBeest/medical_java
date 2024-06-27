package p0627;

// 클래스를 상속받아 구현 extends
// 인터페이스를 상속받아 구현 implements
// 상속과 구현을 동시에 할 수 있음.
// 인터페이스의 장점 : 개발시간 단축, 표준화, *서로 관계없는 클래스들에게 관계를 맺어줌, 독립적인 프로그래밍 가능
public class Fighter extends Unit implements Fightable { // 인터페이스 상속

	Fighter(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack(Unit u) {
		
	}
	@Override
	public void move(int x, int y){ // 일부만 구현하면 추상메소드 형태로 남아야 함.
	}

}
