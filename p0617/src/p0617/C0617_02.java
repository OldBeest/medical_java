package p0617;

public class C0617_02 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		//print, printf : 줄 바꿈이 없음, println : 줄 바꿈
		System.out.print(a / (double)b);
		System.out.println(10 / 3.0); // double은 접미사를 생략할 수 있다.
		System.out.printf("%.2f\n", 10 / 3.0); // \t : tab, \n : enter
		System.out.println("aaa");
		System.out.printf("%x\n", 15); // %x : 16진수 소문자, %X : 16진수 대문자
		System.out.printf("%o\n", 15);// 8진수
		System.out.printf("%s\n", Integer.toBinaryString(15)); // 2진수 표현 : 함수를 사용
	}
}
