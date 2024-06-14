package p0614;

import java.util.Scanner;

public class C0614_09 {
	
	public static void main(String[] args) {
		
		int sca = 0;
		Scanner scan = new Scanner(System.in);
		
//		int num1 = Integer.parseInt(scan.next());
		int num1 = scan.nextInt();
//		int num2 = Integer.parseInt(scan.next());
		int num2 = scan.nextInt();
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.println("나누기 : " + ((float)num1 / (float)num2));
	}
}
