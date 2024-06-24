package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}
		
		Cal c = new Cal();
		
		int result = c.add(num[0], num[1], num[2]);
		System.out.println("합계 : " + result);

		int result2 = c.add(num);
		System.out.println("합계 2 : " + result2);
		
		// 두 수를 입력받아, 두 수를 더한 값을 출력.
		
//		System.out.println("숫자를 입력하세요.");
//		int a = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int b = scan.nextInt();
//		
//		System.out.println("두 수의 합 : " + (a + b));
//		
//		System.out.println("-------------------------");
//		
//		// 세 개의 수를 입력받아 모두 더한 값을 출력.
//		int sum = 0;
//		int[] arr = new int[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("숫자를 입력하세요.");
//			arr[i] = scan.nextInt();
//			sum += arr[i];
//		}
//		System.out.println("세 수의 합 : " + sum);
//		
	}//main
	
	int add(int a, int b) {
		return a + b;
	}
}//class
