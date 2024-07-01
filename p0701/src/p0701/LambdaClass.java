package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.forEach(i -> System.out.println(i)); //lambda
		
		 // 2의 배수, 3의 배수 제거 - removeIf() : 매개변수가 올 수 있음. -  람다식만 매개변수로 사용 가능
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list);
		// 모든 요소에 적용
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap();
		
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((str, str2) -> System.out.printf("{%s, %s}\n", str, str2));
		
//		map.forEach(data_list()); // 변수만 올 수 있음. 람다식은 변수 취급 ?
	}
	
	void list_print(int i) {
		System.out.println(i);
	}
	
	public static void data_list() {
		
	}
}
