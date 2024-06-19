package p0619;

import java.util.Scanner;

public class C0619_02 {

	public static void main(String[] args) {

		
		int[][] arr = new int[5][5];
		int[] arr1 = new int[25];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i + 1; 
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = arr1[i * 5 + j];
			
		}
		
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ran_idx = (int)(Math.random() * 25);
			temp = arr[0][0];
			arr[0][0] = arr[(int)ran_idx / 5][(int)ran_idx % 5];
			arr[(int)ran_idx / 5][(int)ran_idx % 5] = temp;	
		}
		
//		int temp1 = 0;
//		for(int i=0; i<300; i++) {
//			int no1 = (int)(Math.random() * 5);
//			int no2 = (int)(Math.random() * 5);
//			temp = arr[0][0];
//			arr[0][0] = arr[no1][no2];
//			arr[no1][no1] = temp1;	
//		}
		
//		int temp = 0;
//		for(int i=0; i<300; i++) {
//			int ran_idx = (int)(Math.random() * 25);
//			temp = arr1[0];
//			arr1[0] = arr1[ran_idx];
//			arr1[ran_idx] = temp;
//		}
//		

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf(arr[i][j] + "\t");				
			}
			System.out.println();
		}
		
			
		
		
		//		// 1 - 45 array
//		
//		int[] ball = new int[45];
//		
//		for(int i=0; i<45; i++) {
//			ball[i] = i + 1;
//		}
//		
//		int temp = 0;
//		for(int i=0; i<45; i++) {
//			int ran_idx = (int)(Math.random() * 45);
//			temp = ball[0];
//			ball[0] = ball[ran_idx];
//			ball[ran_idx] = temp;
//		}
//		
//		for(int i=0; i<45; i++) {
//			System.out.printf(ball[i] + "\t");
//			if(i % 5 ==4) {
//				System.out.println();
//			}
//		}

	}

}
