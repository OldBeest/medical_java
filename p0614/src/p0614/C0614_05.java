package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 127;
		// byte b2 = 128;
		b = (byte) (b + 10);
		
		System.out.println(b);
		
		int num = 2147483647;
		num = num + 1;
		System.out.println(num);
		
		
		char ch = 'A';
		char ch3 = ' ';
		String str = "AA"; // " "로 선언해줘야 함.
		String str2 = "";
		String str3 = null;
		
		String s1 = "A" + "B";
		System.out.println(s1);
		System.out.println("" + 7 + 7 + 7);
		
	}

}
