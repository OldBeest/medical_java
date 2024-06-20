package p0620;

public class C0620_07 {

	public static void main(String[] args) {
		int hour = 10;
		int minute = 10;
		int second = 10;
		
		int[] h = new int[10];
		int[] m = new int[10];
		int[] s = new int[10];
		
		//객체를 담을 배열 선언, 객체 선언 X
		Time[] tt = new Time[10];
		
		// 객체 선언
		tt[0] = new Time();
		tt[1] = new Time();
		tt[1].hour = 10;
		tt[1].minute = 10;
		tt[1].second = 10;
		//tt[2]는 객체 선언이 되어있지 않음. 
		tt[1].hour = 12;
		System.out.println(tt[1].hour);
		
		// 객체 선언
		Time t = new Time();
		t.hour = 10;
		t.minute = 10;
		t.second = 10;
		

	}

}
