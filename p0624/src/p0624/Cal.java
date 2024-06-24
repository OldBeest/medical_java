package p0624;

public class Cal {
	
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	
	int add(int[] num) { // overloading
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
}
