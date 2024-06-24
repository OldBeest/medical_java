package p0624;

import java.util.Scanner;

public class C0624_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 99;
		score[2] = 91;
		
		System.out.println("현재 국어점수 : " + score[0]);
		System.out.println("현재 영어점수 : " + score[1]);
		System.out.println("현재 수학점수 : " + score[2]);
		
		Calculator cal = new Calculator();
		
		cal.changeScore(score); // 객체 주소를 매개변수로 넘겼기 때문에, 함수실행만으로 값이 변경가능
		
		System.out.println("변경된 국어 점수 : " + score[0]);
		System.out.println("변경된 영어 점수 : " + score[1]);
		System.out.println("변경된 수학 점수 : " + score[2]);
		
	}

}
