package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 입력한 두 수의 더하기, 빼기, 곱하기, 나누기 계산 결과 값을 출력하세요.
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		Cal2 cal = new Cal2();
		
		System.out.println(cal.plus(a, b));
		System.out.println(cal.minus(a, b));
		System.out.println(cal.multi(a, b));
		System.out.println(cal.divide(a, b));
	}

}
