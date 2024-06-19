package p0619;

import java.util.Scanner;

public class C0619_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. ball 배열 1-45까지 번호 입력
		int[] ball = new int[45];
		for(int i=0; i<45; i++) {
			ball[i] = i + 1;
		}
		
		// 2. ball 배열 섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ran_idx = (int)(Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[ran_idx];
			ball[ran_idx] = temp;
		}
		// 3. ball 배열 출력
//		for(int i=0; i<45; i++) {
//			System.out.printf(ball[i] +  "\t");
//			if(i % 5 == 4) {
//				System.out.println();				
//			}
//		}
		// 4. my_ball 입력
		int[] my_ball = new int[6];
		
		for(int i=0; i<6; i++) {
			System.out.printf("%d 번째 로또번호를 입력하세요.", i + 1);
			my_ball[i] = scan.nextInt();
		}
		
		System.out.print("입력 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%4d ",my_ball[i]);
		}
		System.out.println();
		
		// 5. ball 배열 출력
		System.out.print("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%4d ",ball[i]);
		}
		System.out.println();
		
		int[] win = new int[6];
		int cnt = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(my_ball[j] == ball[i]) {
					win[cnt] = ball[i];
					cnt++;
					break;
				}
			}
		}
		System.out.println("당첨 개수 : " + cnt + "개");
		
		System.out.print("당첨 번호 : ");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%4d", win[i]);
		}
		System.out.println();
		
		if(cnt ==0) {
			System.out.println("없음");
		}
		
//		int[][] arr = new int[5][5];
//		for(int i=1; i<=5; i++) 
//			for(int j=1; j<=5; j++) {
//				arr[i - 1][j - 1] = (i - 1) * 5 + j;
//			}
//		for(int i =0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.printf(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
	scan.close();
	}
	
}
