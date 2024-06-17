package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		if(a > 0) {
			System.out.println("양수입니다.");
		}else if(a == 0){
			System.out.println("0 입니다.");
		}else {
			System.out.println("음수 입니다.");
		}
		
		// 조건절 내용이 1줄일 경우 중괄호 생략이 가능.
		if(a > 0)
			System.out.println("양수입니다.");
		else if(a == 0)
			System.out.println("0 입니다.");
		else
			System.out.println("음수 입니다.");
//		//숫자를 입력받아, 양수, 음수, 0라고 출력 되도록 구현
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		
//		String result = (num > 0) ? "양수" : ((num == 0) ? "0" : "음수");
//		
//		System.out.println(result);
		
//		System.out.println("숫자를 입력하세요.");
//		int x = scan.nextInt();
//		int absX = x >= 0 ? x : -x;
//		System.out.println(absX);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		String str = scan.nextLine();
//		System.out.println("입력한 문자의 길이 : " + str.length());
	}

}
