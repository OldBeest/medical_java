package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		// int score; 변수는 초기화 없이 사용할 수 없음
		System.out.println(score);
		
		//문자형
		char ch1 = 'a';
		// char ch2 = 'abc'; 불가능
		char ch3 = 'a';
		char ch4 = 'b';
		char ch5 = 'c';
		System.out.println(ch3 + ch4 + ch5);
		String str = new String("abc");
		System.out.println(str);
		String str2 = "abcde"; // 기본 변수 선언하듯이 쓸 수 있음.
		System.out.println(str2);
		
		int max = 100;
		max = 30;
		System.out.println(max);
		
		final int MIN = 20; // 상수 선언, 상수명은 대문자로 사용
		// MIN = 10; 값은 변경할 수 없음
		System.out.println(MIN);
	}

}
