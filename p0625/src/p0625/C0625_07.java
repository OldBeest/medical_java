package p0625;

public class C0625_07 {
	
	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 =null;
		
		// 다형성 : 부모의 참조변수로 자손의 객체를 다루는 것
		// 자손의 참조변수로 조상의 객체를 다룰 수 없다.
//		a2 = (Ambulance)c; // 자손참조변수 = 조상의 객체 (불가능)
		
		c = a; // 첫 객체 설정이 중요함.(자손 객체를 부모의 참조변수에 넣는다.)
		if(a instanceof Car) { // instanceof : 상속관계 확인
			System.out.println("가능합니다.");
			c = a;
		}
		a2 = (Ambulance)c;
		
		// 형변환 - 자손타입에서 조상타입으로 변경(Up-casting) : 형변환 타입 생략 가능
//		c2 = (Car)a;
//		c2 = a; // Ambulance -> Car
//		c2.drive();
//		// 조상타입에서 자손타입으로 변경(Down-casting)할 때 Car에서는 형변환 타입을 정해줘야 함.
//		a2 = (Ambulance)c2; // Car -> Ambulance
//		a2.siren();
		
	}

}
