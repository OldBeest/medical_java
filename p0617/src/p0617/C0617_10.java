package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 60점 이상이면 합격, 60점 미만이면 불합격을 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		if(score <= 100 && score >= 0) {
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("올바른 점수가 아닙니다.");
		}
		
//		if(score <= 100 && score >= 0) {
//			if (score >= 60) {
//				System.out.println("합격");
//			}
//			else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("올바른 점수가 아닙니다.");
//		}
		
	}

}
