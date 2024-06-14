package p0614;

import java.util.Scanner;

public class C0614_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요.");
		String ch1 = scan.next();
		char input  = ch1.charAt(0); // 문자열에서 0번째 문자 하나를 가져옴
		System.out.println(input);
		int output = input + 32;
		System.out.println((char)(output));
		System.out.println(ch1.toLowerCase()); // 문자열 메소드 사
		System.out.printf("변환 전 문자 : %c\n변환 후 문자 : %c\n", input, output);  		
	}
}
