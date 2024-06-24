package p0624;

import java.util.Scanner;

public class Calculator {	
	static	Scanner scan = new Scanner(System.in);
	
//	int korChange(int kor) {
//		
//		System.out.println("수정할 국어 점수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		kor = scan.nextInt();
//		
//		return kor;
//	}
//	int engChange(int eng) {
//		
//		System.out.println("수정할 영어 점수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		eng = scan.nextInt();
//		
//		return eng;
//	}
//	int mathChange(int math) {
//		
//		System.out.println("수정할 영어 점수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		math = scan.nextInt();
//		
//		return math;
//	}
	
	void changeScore(int[] arr) {
		
		System.out.println("수정할 국어점수를 입력하세요.");
		arr[0] = scan.nextInt();
		System.out.println("수정할 영어점수를 입력하세요.");
		arr[1] = scan.nextInt();
		System.out.println("수정할 수학점수를 입력하세요.");
		arr[2] = scan.nextInt();
		
	}
	
//	int result = 0;
//	
//	int cal(int[] arr, String opr) {
//		
//		switch(opr) {
//			case "+":
//				result = arr[0] + arr[1];
//				break;
//			case "-":
//				result = arr[0] - arr[1];
//				break;
//			case "*":
//				result = arr[0] * arr[1];
//				break;
//			case "/":
//				result = arr[0] / arr[1];
//				break;
//		}
//		return result;
//	}
}
