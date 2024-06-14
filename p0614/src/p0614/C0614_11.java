package p0614;

public class C0614_11 {
	public static void main(String[] args) {
		byte a = 1;
		int n = 350;
		int c = (a + n);
		System.out.println(c);
		
		char ch1 = 'A'; // A : 65 , a : 97
		char ch2 = 'B'; // B : 66, b : 98
		
		System.out.println(ch1 + ch2);
		
		System.out.println((char)(ch1 + 32));
		
		byte by1 = 10;
		byte by2 = 20;
		byte by3 = (byte)(by1 +by2);
		System.out.println(by3);
		
		int num1 = 1000000;
		int num2 = 2000000;
		long total = (long)num1 * num2; // 두 수중에 하나만 더 큰 타입으로 변환해준다.
		System.out.println("long : " + total);
		
		long num3 = 1000000L;
		long num4 = num1 * num3;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num1 / num5 * 1000000);
		System.out.println(num1 * num5 / 1000000); // num1 * num5 에서 오버플로우가 발생
		
		char c1 = 'a';
		//char c2 = c1 + 1; // 에러
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		char c3 = c1++;
		System.out.println(c3);

		char c4 = ++c1;
		System.out.println(c4);
		
		int i = 'B' - 'A';
		System.out.println(i);
		
		int j = '2' - '0'; // 문자 0을 빼주면 integer.parseint()없이 간결하게 int로 변환할 수 있다. ascii코드로 이미 숫자로 변환되어 있음.
		System.out.println(j);
		
		int k = '8' - '0';
		System.out.println(k);
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f; 
		System.out.println(shortPi); // 소수점 3째짜리까지 표시하고 싶을 때
	}
}
