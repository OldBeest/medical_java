package p0628;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import p0628.Card.Kind;

public class C0628_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요.");
		String str = scan.next();
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		list.add(new Card(1, Kind.SPADE));
		list.add(new Card(1, Kind.DIAMOND));
//		list.add(new Card(3, "SPADE"));
//		list.add(new Card(7, "HEART"));
		list.add(new Card(5, Kind.CLOVER));
		list.add(new Card(2, Kind.DIAMOND));
		
//		list.sort(new Comparator<Card>() {
//			@Override
//			public int compare(Card o1, Card o2) {
//				return o1.number - o2.number; // 결과가 양수면 자리를 바꿈 -> 큰 숫자가 뒤로 감 -> 순차정렬
////				return o2.number - o1.number; // 결과가 양수면 자리를 바꿈 -> 작은 숫자가 뒤로 감 -> 역순정렬
//			}
//			
//		});
		list.sort(new Comparator<Card>() {
			// 크기를 비교하는 함수 정의
			@Override
			public int compare(Card o1, Card o2) {
				return o1.get_kind().compareTo(o2.get_kind()); // 사전순으로 순차정렬
//				return o2.kind.compareTo(o1.kind); // 사전순으로 역순정렬
			}
			
		});
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
