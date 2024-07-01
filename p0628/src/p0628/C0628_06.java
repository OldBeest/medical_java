package p0628;

import java.util.ArrayList;
import java.util.Vector;

public class C0628_06 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		ArrayList<Students> list = new ArrayList<Students>();
		
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("유관순", 99, 99, 99));
		list.add(new Students("이순신", 80, 80, 89));
		list.add(new Students("강감찬", 70, 70, 99));
		list.add(new Students("홍길동", 100, 100, 100));
		list.remove(1);
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		ArrayList<Card> list = new ArrayList<Card>(); // <>Generic
//		
//		list.add(new Card(1, "Spade"));
//		list.add(new Card(2, "Spade"));
//		list.add(new Card(2, "Diamond"));
//		list.add(new Card(3, "Heart"));
//		list.add(new Card(4, "Clover"));
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.printf("number : %d, shape : %s\n", list.get(i).number, list.get(i).kind);
//		}
	
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("홍길동");
//		list.add("유관순");
//		list.add("이순신");
//		list.add("김구");
//		list.add("강감찬");
//		list.remove(1); // 인덱스를 가지고 유관순 삭제
//		list.remove("김구"); // 객체형태로 삭제
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		// List : 순서가 있음, 중복을 허용
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		//add : 추가, remove : 삭제
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.remove(1);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}
