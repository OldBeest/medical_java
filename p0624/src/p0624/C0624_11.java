package p0624;

public class C0624_11 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car("pink");
		Car cc1 = new Car("blue", "auto", 5);
		Car cc2 = new Car("red", "auto", 4);
		Car cc3 = new Car("gray", "auto", 3);
		
		System.out.println("Serial c1 : " + c1.serial_no);
		System.out.println("Serial cc3 : " + c4.serial_no);
		System.out.println("Serial cc3 : " + cc3.serial_no);
		
		
	}

}
