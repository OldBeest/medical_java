package p0628;

import java.util.ArrayList;

public class C0628_09 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
//		list.remove(1); // 2 삭제
//		list.remove(3); // 5 삭제 (2가 먼저 지워졌기 때문에, 4가 아니라 5가 삭제됨)
		
		// 배열 내용을 삭제할 경우 끝에서부터 삭제해야 배열 복사가 발생하지 않음
		for(int i=list.size() - 1; i>=0; i--) {
			list.remove(i);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		if(list.isEmpty()) {
			System.out.println("모든 데이터가 삭제되었습니다.");
		}
	}

}
