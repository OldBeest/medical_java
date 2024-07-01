package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C0628_08 {

	public static void main(String[] args) {
		
		Process p = new Process();
		
		HashMap<String, Object> map = p.read_con();
		
		Object obj = map.get("list");
		ArrayList list = (ArrayList) obj;
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator it = ((ArrayList) map.get("list2")).iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		Set obj3 = (Set) map.get("set");
		Iterator it2 = obj3.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		//set은 순서없이 들어감
		
//		HashMap map = new HashMap();
//		map.put("aaa",1111);
//		map.put("bbb",1234);
//		map.put("aaa",1111);
//		map.put("aaa",1212); // 동일한 키를 반복할 경우 마지막의 데이터가 입력된다.
//		
//		String str = "bbb";
//		if(map.containsKey(str)) {
//			System.out.println("동일한 데이터가 있습니다.");
//		}else {
//			System.out.println("일치하는 데이터가 없습니다.");
//		}
//		
//		// map에는 iterator가 없음.
//		Iterator it = map.entrySet().iterator(); //set 형태로 만들어준 후 iterator로 만들워줘야함.
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		HashSet set = new HashSet();
//		
////		set.add("abc");
////		set.add("abc");
//		set.add(new Person("홍길동", 1));
//		set.add(new Person("유관순", 2));
//		set.add(new Person("이순신", 3));
//		set.add(new Person("강감찬", 4));
//		set.add(new Person("김구", 5));
//		
//		System.out.println(set);
//		
//		Iterator it = set.iterator(); // iterator는 한번 반복하면 다시 반복할 수 없다. -> 새로 선언을 다시해줘야 함.
//		while(it.hasNext()) { // hasNext() : 객체가 있는지 확인
//			Person p = (Person) it.next();
//			System.out.println(p.name);
//		}
//		
//		ArrayList list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		Iterator it2 = list.iterator();
//		while(it2.hasNext()) {
//			System.out.println(it2.next());
//		}
		
//		Set<Card> set = new HashSet<Card>();
//		set.add(new Card(1, "SPADE"));
//		set.add(new Card(2, "DIAMOND"));
//		set.add(new Card(3, "HEART"));
//		set.add(new Card(4, "CLOVER"));
//		set.add(new Card(1, "SPADE"));
//		set.add(new Card(6, "SPADE"));
//		
//		System.out.println(set);
		
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1"); // 추가 x
//		set.add("3");
//		set.add("1"); // 추가 x
//		set.add("1"); // 추가 x
//		set.add("4");
		
		
		//		Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
//		
//		Set set = new HashSet();
//		
//		for(int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set);
		
	}

}//class

class Person{
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("%s : %d", name, age);
	}
}



