package p0617;

import java.util.Scanner;

public class C0617_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요.");
		String str = scan.next(); // next() : 스페이스(사이 띄우기) 이전 까지, nextline() : 스페이스 모두 포함 엔터 입력 전까지
		char ch = str.charAt(0); // chatAt() : 문자열을 n 번째 문자를 반환 (괄호 안에는 index가 들어감)
		
//		char ch = 'g';
		// 영문자인지 확인
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("영문자 입니다.");
		}
		else {
			 System.out.println("영문자가 아닙니다.");
		}
		// 숫자인지 확인
		if(ch >= '0' && ch <= '9') {
			System.out.println("숫자 입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
	}
}
