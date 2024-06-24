package p0624;

public class C0624_09 {

	public static void main(String[] args) {
		
//		Data d = new Data();
//		Data2 d2 = new Data2();		
//		Data2 d3 = new Data2(10);
		
		Car c1 = new Car();
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "auto", 5);
		Car c3 = new Car("blue", "auto", 3);
		
		System.out.printf("Car1 : %s, %s, %d\n", c1.color, c1.gearType, c1.door);
		System.out.printf("Car2 : %s, %s, %d\n", c2.color, c2.gearType, c2.door);
		System.out.printf("Car3 : %s, %s, %d\n", c3.color, c3.gearType, c3.door);
		
		
		
	}

}
