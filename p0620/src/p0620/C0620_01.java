package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] score = new String[45];
		for(int i=0; i<score.length; i++) {
			score[i] = i + 1 + ""; // 앞에 숫자를 먼저 연산한 후 문자열 타입으로 변환
		}
		System.out.println(Arrays.toString(score));
		
		String[][] arr = new String[5][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i * 5 + (j +1) + "";
			}
		}
		String temp = "0";
		for(int i=0; i<100; i++) {
			int ran_idx = (int)(Math.random()* 25);
			temp = arr[0][0];
			arr[0][0] = arr[ran_idx / 5][ran_idx % 5];                      
			arr[ran_idx / 5][ran_idx % 5] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int[] input_arr = new int[25];
		int count = 0;
		while(true) {
			System.out.println("1부터 25까지 숫자를 입력하세요.");
			int input = scan.nextInt();
			if(input < 1 || input > 25) {
				System.out.println("입력한 숫자가 잘못되었습니다. 다시 입력하세요.");
				continue;
			}
			int cnt = 0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
//				if(input == Integer.parseInt(arr[i][j])){
					if((input + "").equals(arr[i][j])){
						arr[i][j] = "X";
						cnt = 1;
						count++;
					}
				}
			}
			if(cnt == 0) {
				System.out.printf("%d 는 입력된 숫자입니다. 다시 입력하세요.\n", input);
			}
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			if(count == 25) {
				System.out.println("모든 위치에 X가 표시되었습니다.");
				break;
			}
		}
	}
}
