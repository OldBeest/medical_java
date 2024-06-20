package p0620;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C0620_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int STU = 10;
		
		String[] stuNo = new String[STU]; // 학번
		String[] name = new String[STU]; // 이름
		int[][] score =  new int[STU][4]; // 국어 영어 수학 합계
		double[] avg = new double[STU]; // 평균
		int[] rank = new int[STU]; // 등수
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int s_count = 0; // 입력된 학생 수
		
		while(true) {
			//화면 부분
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 학생 검색");
			System.out.println("5. 등수 처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			
			System.out.println("원하는 번호를 선택하세요.");
			int choice = scan.nextInt();
			int cnt = 0; // 학생을 찾았는지 확인하는 변수
			scan.nextLine(); // 엔터키 처리
			
			switch(choice) {
			
			// 성적 입력
			case 1:
				while(true) {
					System.out.println("[학생 성적 입력]");
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S" + sdf.format(date) + String.format("%03d", s_count + 1);
					stuNo[s_count] = stuNo1;
					System.out.println("학생 번호 : " + stuNo1);
					
					// 이름
					System.out.println("이름을 입력하세요.(0. 취소)");
					name[s_count] = scan.nextLine();
					
					if(name[s_count].equals("0")) {
						System.out.println("이전 화면으로 돌아갑니다.");
						break;
					}
					// 국어 영어 수학 점수
					System.out.println("국어 점수를 입력하세요.");
					score[s_count][0] = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					score[s_count][1] = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					
					// 합계
					score[s_count][3] = score[s_count][0] + score[s_count][1] + score[s_count][2];
					// 평균
					avg[s_count] = score[s_count][3] / 3.0;
					
					// 입력 완료
					System.out.printf("%s 학생 성적이 저장되었습니다.\n", name[s_count]);
					System.out.println();
					
					s_count++;
					
				} // while
				
				break;
			
			// 성적 출력
			case 2:
				System.out.println("[학생 성적 출력]");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("--------------------------");
				for(int i=0; i<s_count; i++) {
					System.out.printf("%s\t", stuNo[i]);
					System.out.printf("%s\t", name[i]);
					for(int j=0; j<4; j++) {
						System.out.printf("%d\t", score[i][j]);
					}
					System.out.printf("%.2f\t", avg[i]);
					System.out.printf("%d\t", rank[i]);
					System.out.println();
				}
				
				break;

			// 성적 수정
			case 3:
				System.out.println("[학생 성적 수정]");
				System.out.println("학생 이름을 입력하세요.");
				String t_fix_name = scan.nextLine();
				for(int i=0; i<s_count; i++) {
					if(name[i].equals(t_fix_name)){
						System.out.printf("%s\t", stuNo[i]);
						System.out.printf("%s\t", name[i]);
						for(int j=0; j<4; j++) {
							System.out.printf("%d\t", score[i][j]);
						}
						System.out.printf("%.2f\t", avg[i]);
						System.out.printf("%d\t", rank[i]);
						System.out.println();
						cnt = 1;
						while(true) {
							System.out.println("1. 국어 점수");
							System.out.println("2. 영어 점수");
							System.out.println("3. 수학 점수");
							System.out.println("0. 이전 화면");
							System.out.println("수정을 원하는 과목 번호를 선택하세요.");
							choice = scan.nextInt();
							
							if(choice == 0) {
								System.out.println("이전 화면으로 돌아갑니다.");
								break;
							}
							if(choice > 0 && choice < 4) {
								System.out.printf("현재 %s 점수 : %d\n", title[choice + 1], score[i][choice - 1]);
								System.out.println("수정 후 점수를 입력하세요.");
								int new_score = scan.nextInt();
								score[i][choice-1] = new_score;
								System.out.printf("수정 후 %s 점수 : %d\n", title[choice + 1], score[i][choice - 1]);
								
								score[i][3] = score[i][0] + score[i][1] + score[i][2];
								avg[i] = score[i][3] / 3.0;
								
								System.out.println("수정이 완료되었습니다.");							
							}
						}
					}
				}
				if(cnt == 0) {
					System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
				}
				
				break;
				
			// 학생 검색
			case 4:
				System.out.println("[학생 검색]");
				System.out.println("--------------------------");
				System.out.println("1. 학생 이름 검색");
				System.out.println("2. 합계 점수 검색");
				System.out.println("3. 평균 점수 검색");
				System.out.println("--------------------------");
				
				System.out.println("원하는 번호를 선택하세요.");
				choice = scan.nextInt();
				
				
				switch(choice) {
				case 1:
					System.out.println("학생 이름을 입력하세요.");
					String t_name = scan.nextLine();
					
					
					for(int i=0; i<title.length; i++) {
						System.out.printf("%s\t", title[i]);
					}
					System.out.println();
					System.out.println("--------------------------");
					
					
					for(int i=0; i<s_count; i++) {
//						if(name[i].equals(t_name)) { // 일치하는 경우
						if(name[i].contains(t_name)) { // 포함하는 경우 전부
							System.out.printf("%s\t", stuNo[i]);
							System.out.printf("%s\t", name[i]);
							for(int j=0; j<4; j++) {
								System.out.printf("%d\t", score[i][j]);
							}
							System.out.printf("%.2f\t", avg[i]);
							System.out.printf("%d\t", rank[i]);
							System.out.println();
							cnt = 1;
						}
						
					}
					
					if(cnt == 0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
					}
					
					break;
					
				case 2:
					System.out.println("합계 점수를 입력하세요.");
					int t_score = scan.nextInt();
					
					
					for(int i=0; i<title.length; i++) {
						System.out.printf("%s\t", title[i]);
					}
					System.out.println();
					System.out.println("--------------------------");
					
					
					for(int i=0; i<s_count; i++) {
//						if(name[i].equals(t_name)) { // 일치하는 경우
						if(score[i][3] > t_score) { // 포함하는 경우 전부
							System.out.printf("%s\t", stuNo[i]);
							System.out.printf("%s\t", name[i]);
							for(int j=0; j<4; j++) {
								System.out.printf("%d\t", score[i][j]);
							}
							System.out.printf("%.2f\t", avg[i]);
							System.out.printf("%d\t", rank[i]);
							System.out.println();
							cnt = 1;
						}
						
					}
					
					if(cnt == 0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
					}
					
					break;
					
				case 3:
					System.out.println("평균 점수를 입력하세요.");
					double avg_score = scan.nextDouble();
					
					
					for(int i=0; i<title.length; i++) {
						System.out.printf("%s\t", title[i]);
					}
					System.out.println();
					System.out.println("--------------------------");
					
					
					for(int i=0; i<s_count; i++) {
//						if(name[i].equals(t_name)) { // 일치하는 경우
						if(avg[i] > avg_score) { // 포함하는 경우 전부
							System.out.printf("%s\t", stuNo[i]);
							System.out.printf("%s\t", name[i]);
							for(int j=0; j<4; j++) {
								System.out.printf("%d\t", score[i][j]);
							}
							System.out.printf("%.2f\t", avg[i]);
							System.out.printf("%d\t", rank[i]);
							System.out.println();
							cnt = 1;
						}
						
					}
					
					if(cnt == 0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
					}
					
					break;
				}
				
				break;
				
			// 등수 처리
			case 5:
				System.out.println("[ 등수 처리 ]");
				for(int i=0; i<s_count; i++) {
					int count = 1;
					for(int j=0; j<s_count; j++) {
						if(score[i][3] < score[j][3]) {
							count ++;
						}
					}
					rank[i] = count;
				}
				System.out.println("등수 처리가 완료되었습니다.");
				break;
				
				//프로그램 종료
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			}//switch 
			
																																																																																												
		}//while
			
		}//main

}//class
