package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class Process {
	
	ArrayList<Card> clist = new ArrayList<Card>();
	ArrayList<Students> slist = new ArrayList<Students>();
	
	ArrayList<Card> clistAdd(){
		
		clist.add(new Card(1, "CLOVER"));
		clist.add(new Card(2, "CLOVER"));
		clist.add(new Card(3, "CLOVER"));
		clist.add(new Card(4, "CLOVER"));
		clist.add(new Card(5, "CLOVER"));
		
		return clist;
	}
	
	ArrayList<Students> slistAdd(){
		
		slist.add(new Students("홍길동", 100, 100, 99));
		slist.add(new Students("유관순", 90, 100, 99));
		slist.add(new Students("이순신", 80, 100, 99));
		slist.add(new Students("김구", 70, 100, 99));
		slist.add(new Students("강감찬", 50, 100, 99));
		
		return slist;
	}
	
	public HashMap listAdd() {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("Card", clistAdd());
		map.put("Students", slistAdd());
		
		return map;
	}
	
}
