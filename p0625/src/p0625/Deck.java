package p0625;

public class Deck {
	
	Card[] c = new Card[52];
	int count = 0;
	
	Deck() {
		String[] shape = {"SPADE", "HEART", "CLOVER", "DIAMOND"};
		for(int i=0; i<52; i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}
	}
	
	void shuffle() {
		for(int i=0; i<100; i++) {
			int ran_idx = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[ran_idx];
			c[ran_idx] = temp;			
		}
	}
	
	Card pick() {
		Card card = c[count]; 
		count++;
		return card;
	}
	
	Card pick(int n) {
		return c[n];
	}
	
	Card[] n_pick(int n) {
		Card[] npick = new Card[n];
		for(int i=0; i<n; i++) {
			npick[i] = pick();
		}
		return npick;
	}
}
