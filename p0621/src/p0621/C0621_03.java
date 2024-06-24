package p0621;

public class C0621_03 {

	public static void main(String[] args) {

		Cal cal = new Cal();
		
		int result = cal.add(10, 5);
		System.out.println("result : " + result);
		
//		C0621_03 c = new C0621_03();
//		
//		int result = c.add(10, 5);
//		System.out.println(result);
		
		
	}
	
	// 메소드 선언
	// 리턴타입과 리턴 결과 값은 타입이 같아야 함.
	int add(int a, int b) {
		
		int result = a + b;
		
		return result;
	}
	// void는 리턴 값이 없음.
	void add2(int a, int b) {
		System.out.println(a + b);
		
		//return; 반환 값이 없기 때문에 return; 만 씀
	}
}
