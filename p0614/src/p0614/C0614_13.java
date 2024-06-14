package p0614;

import java.util.Scanner;

public class C0614_13 {
	public static void main(String[] args) {
		
//		float pi = 3.141592f;
//		float shortpi = (int)(pi * 1000) / 1000f; // 1000f로 나눠줘야함. 소수점을 날려버림.
//		System.out.println(shortpi);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.(소수점 5번째자리 까지)");		
		double input = scan.nextDouble();
		double s_input = (int)(input * 100) / 100d;
		System.out.println(s_input);		
		
//		double s_input2 = Math.ceil(input * 1000) / 1000d; // 소수점 3번째 자리까지 올림
//		double s_input2 = Math.round(input * 1000) / 1000d; // 소수점 3번째 자리까지 반올림
		double s_input2 = Math.floor(input * 1000) / 1000d; // 소수점 3번째 자리까지 내림 Math.floor대신 int로 해도 가능
		System.out.println(s_input2);		
		
		
		System.out.println("숫자를 입력하세요.");
		float num = scan.nextFloat();
		float num1 = (int)(num * 100) / 100f;
		System.out.println(num1);
		
	
	}
}