package p0617;

import java.util.Scanner;
public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		String str1 = scan.next();
//		int ch1 = Integer.parseInt(str1);
		char ch1 = str1.charAt(0);
		System.out.println("두 번째 숫자를 입력하세요");
		String str2 = scan.next();
//		int ch2 = Integer.parseInt(str2);
		char ch2 = str2.charAt(0);
//		System.out.println(ch1 + ch2);
		if((ch1 >= '0' && ch1 <= '9') && (ch2 >= '0' && ch2 <= '9')) {
			System.out.println("두 수의 합 : " + ((ch1 - '0') + (ch2 - '0')));
		}
		else {
			System.out.printf("숫자가 아닙니다. %c, %c\n", ch1, ch2);
		} 
	}

}
