package p0625;

public class C0625_02 {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		
		Card card = d.pick();
		System.out.printf("카드1 : %s, %d\n", card.kind, card.number);
		Card card1 = d.pick(3);
		System.out.printf("카드2 : %s, %d\n", card1.kind, card1.number);
//		d.shuffle();
		Card card2 = d.pick();
		System.out.printf("카드3 : %s, %d\n", card2.kind, card2.number);
		
		Card[] six_pick = d.n_pick(6);
		for(int i=0; i<six_pick.length; i++) {
			System.out.printf("Card %d : %s, %d\n", i+1, six_pick[i].kind, six_pick[i].number);			
		}
		Card[] six_pick2 = d.n_pick(6);
		for(int i=0; i<six_pick2.length; i++) {
			System.out.printf("Card %d : %s, %d\n", i+1, six_pick2[i].kind, six_pick2[i].number);			
		}
		
		System.out.println("card 객체 : " + six_pick2[0]);
//		for(int i=0;  i<d.c.length; i++)
//			System.out.printf("Card %d : %s %d\n", i + 1, d.c[i].kind, d.c[i].number);
//		for(int i=0;  i<d.c.length; i++)
//			System.out.printf("Card %d : %s %d\n", i + 1, d.c[i].kind, d.c[i].number);
	}

}
