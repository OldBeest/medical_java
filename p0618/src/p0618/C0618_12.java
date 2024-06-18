package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] score = new int[3][3];
		String[] title = {"이름", "국어", "영어", "수학"};
		String[] name = new String[3]; 
		
		for(int i=0; i<3; i++) {
			System.out.println(title[0] + "을 입력하세요");
			name[i] = scan.next();
			for(int j=0; j<3; j++) {
				System.out.println(title[j+1] + "점수를 입력하세요");
				score[i][j] = scan.nextInt();		
			}
		}
		
		for(int i=0; i<title.length; i++)
			System.out.printf(title[i] + "\t");
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");	
			}
			System.out.println();
		}	
		scan.close();
	}
}
