package p0626;

import java.util.ArrayList;
import java.util.Arrays;

public class C0626_03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("유관순", 89, 87, 99));
		list.add(new Students("이순신", 90, 90, 92));
		
		list.remove(1); // 인덱스 위치로 제거
		
//		System.out.println(list.size());
//		Students s = (Students)list.get(0);
//		System.out.println(s.stuNo);
		
		for(int i=0; i<list.size(); i++) {
			Students s = (Students) list.get(i);
			System.out.printf("%s, %s, %d, %d, %d, %d, %.2f, %d\n", s.stuNo, s.name, s.kor, s.eng, s.math, s.total, s.avg, s.rank);
		}
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		arr[2] = 0;
//		
//		System.out.println(Arrays.toString(arr));
	}

}
