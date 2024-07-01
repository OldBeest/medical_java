package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		
		Process p = new Process();
		
//		ArrayList<Card> clist = p.clistAdd();
//		ArrayList<Students> slist = p.slistAdd();
//		
//		for(int i =0; i<p.clist.size(); i++) {
//			System.out.println(clist.get(i).getKind() + ", " +  clist.get(i).getNumber());
//		}
//		System.out.println();
//		for(int i =0; i<p.slist.size(); i++) {
//			Students s = slist.get(i);
////			System.out.printf("%s - 국어 : %d, 영어 : %d, 수학 : %d\n", s.getName(), s.getKor(), s.getEng(), s.getMath());
//			System.out.println(s);
//		}
//		
		HashMap<String, Object> m = p.listAdd();
		
		ArrayList<Card> c_list = (ArrayList<Card>) m.get("Card");
		for(int i=0; i<c_list.size(); i++) {
			System.out.println(c_list.get(i));			
			System.out.println(c_list.get(i).getKind());			
		}
		ArrayList<Students> s_list = (ArrayList<Students>) m.get("Students");
		for(int i=0; i<s_list.size(); i++) {
			System.out.println(s_list.get(i));			
			System.out.println(s_list.get(i).getName());			
		}
		
	}

}
