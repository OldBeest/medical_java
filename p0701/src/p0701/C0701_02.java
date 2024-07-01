package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		
		ArrayList<Card>list = new ArrayList<Card>(); // Card형만 들어오게 Generic 설정
		
		list.add(new Card(1, "CLOVER"));
		list.add(new Card(10, "HEART"));
		list.add(new Card(2, "SPADE"));
		
		for(int i=0; i<list.size(); i++) {
//			Card c = (Card) list.get(i); // Card로 형변환
//			System.out.println(list.get(i).getKind() + ", "+ list.get(i).getNumber());
			System.out.println(list.get(i)); // toString override
		}
		
	}

}