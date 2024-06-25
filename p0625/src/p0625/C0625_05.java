package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		Time t = new Time();
		
//		t.hour = 45;
//		t.day = 50;
		
		t.setHour(12);
		System.out.println("현재 시간 : " + t.getHour() + "시");
//		System.out.println("현재 날짜 : " + t.day + "일");
	}

}
