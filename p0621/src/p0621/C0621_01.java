package p0621;

public class C0621_01 {
	
	int i = 0;
	static int j = 0;
	
	void add(){
		int i = 0;
	}
	
	void add2() {
		int i = 0;
	}

	public static void main(String[] args) {
		
		C0621_01 c = new C0621_01();
		c.i = 10;
		C0621_01.j = 10;
		j = 20; // 클래스변수는 같은 클래스 내에서는 클래스명을 생략할 수 있음.
		
		int j = 100; // 지역변수(메서드 내)
		System.out.println(j); // 100
		
		Time[] t = new Time[3]; // 배열 선언
		
		// 배열 내 객체 선언
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();
		
		// 클래스명.변수명
		Time.day = 21;
		// 참조변수명.변수명
		t[0].hour = 10;
		t[0].minute = 11;
		t[0].second = 12;
		
		Time.day = 25;
		t[1].hour = 20;
		t[1].minute = 11;
		t[1].second = 12;
		
		
		System.out.printf("일시 : %d일 시간 : %d시 %d분 %d초\n", Time.day, t[0].hour, t[0].minute, t[0].second);
		System.out.printf("일시 : %d일 시간 : %d시 %d분 %d초\n", Time.day, t[1].hour, t[1].minute, t[1].second);
		
		Time tt = new Time(); // 객체 선언
		
		// i : 지역변수(for문이 끝나면 사라지기 때문에, 다시 정의해서 사용할 수 있음.)
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
	}

}
