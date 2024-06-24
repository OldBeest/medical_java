package p0621;

public class C0621_02 {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c1.number = 7;
		

		//참조변수명.변수명 으로 변경가능하나, 클래스명.변수명으로 변경을 권장
//		c1.width = 50;
//		c1.height = 80;
		Card.width = 50;
		Card.height = 80;
		
		System.out.printf("Card1 : %s, %d\n", c1.kind, c1.number);
		System.out.printf("Card1 width, height : %s, %d\n", c1.width, c1.height);
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("Card2 : %s, %d\n", c2.kind, c2.number);
		System.out.printf("Card2 width, height : %s, %d\n", c2.width, c2.height);
		
	}

}
