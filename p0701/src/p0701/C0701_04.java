package p0701;

public class C0701_04 {

	public static void main(String[] args) {
		
		for(int i=0; i<300; i++) {
			System.out.println(i + " : " + "-");
		}

		for(int i=0; i<300; i++) {
			System.out.println(i + " : " + "|");
		}
		
		C0701_04 c = new C0701_04();
		
		System.out.println(c.max(20, 10));
	}
	
//	int min(int x, (int a, int b) -> a > b ? a : b) {
//		
//	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
}
