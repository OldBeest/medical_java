package p0618;

import java.util.Scanner;
import java.util.Arrays;
public class C0618_05 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		
		System.out.println(score); // 주소 값 출력
//		System.out.println(Arrays.toString(score)); // 배열의 모든 데이터 확인할 수 있는 메소드
		for(int i=0; i<5; i++) {
			System.out.println("숫자를 입력하세요.");
			score[i] = scan.nextInt();
		}
		
		
			
//		// int score[] = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		System.out.println(score[3]);
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(score[i]);
//		}
//		
//		for(int i=0; i<5; i++) {
//			String num = scan.next();
//			if(i == 2)
//				System.out.println(num);
//		}
		
	}
}
