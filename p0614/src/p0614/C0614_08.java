package p0614;

import java.util.Scanner;
public class C0614_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input
		java.util.Scanner scan2 = new java.util.Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		// 문자열 입력
		// next() : " " 공백을 기준으로 공백 이전까지 문자열을 출력
		// nextLine() : 엔터키 이전까지 모든 문자열 받아서 출력
		
//		System.out.println("3번째 문자를 입력하세요.");
//		String str3 = scan.nextLine();
//		System.out.println("입력한 문자 3 : " + str3);
//		
//		System.out.println("문자를 입력하세요.");
//		String str = scan.next();
//		System.out.println("입력한 문자 : " + str);
//		
//		System.out.println("2번째 문자를 입력하세요.");
//		String str2 = scan.next(); // 입력 부분이 pass
//		System.out.println("입력한 문자 2 : " + str2); // 전에 입력했던 공백 이후의 문자열이 출력됨
//		
		// 숫자 입력
		System.out.println("숫자를 입력하세요.");
		// int  num = scan.nextInt();
		String num = scan.nextLine();
		System.out.println("숫자2를 입력하세요.");
		String num2 = scan.nextLine();
		
		// 기본형 타입 같은 경우, 형변환
		// String은 참조형 타입
		
		int number = Integer.parseInt(num); // 참조형 문자열 타입을 정수형 타입으로 변경
		int number2 = Integer.parseInt(num2);

		System.out.println("입력한 숫자 : " + (number + number2));
		
		System.out.printf("입력한 숫자는 %d와 %d 입니다.\n", number, number2);
		
		
		
	}

}
