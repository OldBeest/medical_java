package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) // 배열명.length : 배열의 크기
			array[i] = i * 2 + 1;
		
		System.out.println(Arrays.toString(array));
		
		for(int val : array) {
			System.out.println(val);
		}
//		// 배열 선언
//		int[] score = new int[5];
//		// 초기화
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// 선언 & 초기화
//		int[] sc = {1, 2, 3, 4, 5};
//		
//		int[] sc2 = new int[] {1, 2, 3, 4, 5};
//		
//		int[] s = new int[5];
//		for(int i=0; i<5; i++) {
//			s[i] = i + 1;
//		}
		
	}

}
