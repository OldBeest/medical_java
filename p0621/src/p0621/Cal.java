package p0621;

public class Cal {
	
	int add(int a, int b) {
		int result = sub(a, b);
		System.out.println("minus : " + result);
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	
	
}
