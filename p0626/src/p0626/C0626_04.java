package p0626;

import java.util.ArrayList;

public class C0626_04 {

	public static void main(String[] args) {
		
		ArrayList<Car> list = new ArrayList<Car>();
		
		list.add(new Car("white", 4));
		list.add(new Car("red", 5));
		list.add(new Car("blue", 4));
		list.add(new Car("gray", 3));
		list.add(new Car("black", 5));
		
		for(int i=0; i<list.size(); i++) {
			Car c = list.get(i);
			System.out.printf("SerialNo : %s | Color : %s | Door : %d\n", c.serialNo, c.color, c.door);
		}
		
	}

}
