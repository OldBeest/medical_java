package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char ch = 'a';
		System.out.println((char)(ch-32));
		
		char ch2 = 'A';
		System.out.println((char)(ch2 + 32));
		
		char ch3 = '3';
		char ch4 = '2';
		System.out.println(ch3 + ch4); // 3 : 51, 2: 50 >> 51 - 50
		
		//숫자로된 문자 타입을 정수타입을 변경하는 방법 : '0'문자 0을 빼줌.
		System.out.println((ch3 - '0') + (ch4 - '0'));
		
//		int a = 1000000;
//		int b = 1000000;
//		System.out.println((long)a * b); // 연산 전에 오버플로우 방지를 위해 미리 형 변환을 해준다.
		
//		char ch1  = 'A'; // 65
//		char ch2 = 'B'; // 66
//		System.out.println(ch1 + ch2);
		
//		System.out.println("숫자를 입력하세요.");
//		String str = scan.nextLine();
//		int n = Integer.parseInt(str);
//		System.out.println("숫자를 입력하세요.");
//		String str2 = scan.nextLine();
//		int n2 = Integer.parseInt(str2);
//		
//		System.out.println("두 수의 합 : " + (n + n2));
		
//		int n = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int n2 = scan.nextInt();
//		
//		System.out.println("두 수의 합 : " + (n + n2));
	}

}
