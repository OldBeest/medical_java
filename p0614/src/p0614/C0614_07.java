package p0614;

public class C0614_07 {
	
	public static void main(String[] args) {
		System.out.println(10.0 / 3); // 3.3333333333333335 : 5부터는 정확하지 않은 소수
		System.out.println(10.0f / 3); // 3.3333333
		System.out.printf("%.2f\n", 10.0 / 3); // 3.33, printf 함수는 줄바꿈이 없음. 소수점 제한 가능
		
		int x = 0x1a; // 16진수 : 26
		System.out.println("x : " + x);
		System.out.printf("%X\n", x); // 16진수 표현
		
		long a = 10L;
		System.out.printf("%d\n", a);
		
		int b = 20;
		System.out.printf("%d\n", b);
		
		int age = 10;
		int year = 2014;
		
		System.out.printf("나이 : %d세, 년도 : %d년\n", age, year);
		System.out.println("나이 : " + age + "세, 년도 : " + year + "년 " );
		
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%05d]\n", 10);
	}
}
