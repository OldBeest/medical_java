package p0614;

public class C0614_10 {
	
	public static void main(String[] args) {
		// 전위형 증감연산자
//		int i = 5;
//		int j = 0;
//		j = ++i; // i에서 먼저 1을 증가 시킨 후 j에 대입.
//		System.out.println(j);
		
		int i = 5;
		int j = 0;
		j = i++; // i 값을 j에 대입한 후 i를 증가시킨다.
		System.out.println("j : " + j);
		System.out.println("i : " + i);
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 == bool2);
		System.out.println(bool1 != bool2); // != : 두 변수가 다른가 ?
		System.out.println("not bool1 : " + !bool1);
	}
}
