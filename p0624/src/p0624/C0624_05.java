package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}
		System.out.println("연산기호를 입력하세요.");
		String opr = scan.next();
		
		
		Calculator cal = new Calculator();
		
//		int result = cal.cal(arr, opr);
//		System.out.println("결과 값 : " + result);
		
//		switch(opr) {
//		case "+":
//			System.out.println("두 수의 합 : " + (x1 + x2));
//			break;
//		case "-":
//			System.out.println("두 수의 차 : " + (x1 - x2));
//			break;
//		case "*":
//			System.out.println("두 수의 곱하기 : " + (x1 * x2));
//			break;
//		case "/":
//			System.out.println("두 수의 나누기 : " + (x1 / (double)x2));
//			break;
//		}
	}

}
