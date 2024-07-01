package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		
		Card c = new Card();
		
		//c.number = 5; // private
		
		//getter & setter
		c.setPassword("1111");
		c.setNumber(5);
		c.setNumber(15);
		System.out.println(c.getNumber());
	}

}
