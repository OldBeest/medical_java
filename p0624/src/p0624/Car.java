package p0624;

public class Car {
	
	static int count = 0;
	String serial_no;
	String color;
	String gearType;
	int door;
	
	//초기화 블럭 : 생성자 호출하기 이전에 항상 먼저 실행 시킴
	{		
		count += 1;
		this.serial_no = "Hyundai" + String.format("%04d", count);
	}
	
	
	Car(){ // 기본 생성자
//		this("white", "auto", 4); // 생성자 호출이 최우선이 되어야함.
	}
	
	Car(String color){
		this.color = color;
		
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
