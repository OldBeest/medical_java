package p0624;

public class C0624_07 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int[] result = new int[4];
		
		Element e = new Element();
		
//		int add = e.cal1(a, b);
//		int sub = e.cal2(a, b);
//		int mul = e.cal3(a, b);
//		int div = e.cal4(a, b);
		e.allcal(a, b, result);
		
		System.out.println("더하기 : " + result[0]);
		System.out.println("빼기 : " + result[1]);
		System.out.println("곱하기 : " + result[2]);
		System.out.println("나누기 : " + result[3]);
		
	}

}
