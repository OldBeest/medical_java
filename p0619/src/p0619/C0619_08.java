package p0619;

import java.util.Scanner;

public class C0619_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int students = 3;
		String[] stuno = new String[students];
		String[] name = new String[students];
		int[][] score = new int[students][4];
		double[] avg = new double[students];
		int[] rank = new int[students];
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "\t등수"};
		
		loop1:
		while(true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("0. 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			scan.nextLine(); // enter 키 처리 dummy 입력
	
			switch(choice) {
			case 1:{
				System.out.println("성적 입력");
				int i = 0;
				while(i < students) {
					System.out.println((i + 1) + " 번째 학생의 " + "학번을 입력하세요.(0.취소)");
					String temp = scan.nextLine();
					if(temp.equals("0")) {
						System.out.println("이전 화면으로 이동합니다.");
						break;
					}else {
						stuno[i] = temp;						
					}
					System.out.println((i + 1) + " 번째 학생의 "+ "이름을 입력하세요.");
					name[i] = scan.nextLine();
					for(int j=0; j<3; j++) {
						System.out.println((i + 1) + " 번째 학생의 "+ title[j + 2] + " 점수를 입력하세요.");
						score[i][j] = scan.nextInt();
					}
					scan.nextLine();
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = (double)score[i][3] / 3;
					
					System.out.printf("학번 : %s, 이름 : %s\n", stuno[i], name[i]);
					System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", score[i][0], score[i][1], score[i][2]);
					System.out.printf("합계 : %d, 평균 : %.2f\n", score[i][3], avg[i]);
					i++;
				}
				// 학번 - String, 이름 - String, 점수 - Int, 합계 - int, 평균 - double, 등수 - Int
				break;
			}
			case 2:
			{
				System.out.println("성적 출력");
				System.out.println("-----성적 출력-----");
				for(String subject : title) {
					System.out.print(subject + "\t");
				}
				System.out.println();
				for(int i=0; i<students; i++) {
					System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%6.2f\t%d\n", stuno[i], name[i], score[i][0], score[i][1], score[i][2], score[i][3], avg[i], rank[i]);
				}
				
				break;
			}
			case 0:
			{
				System.out.println("프로그램 종료");
				break loop1;
			}
			}
			
		}
	}

}
