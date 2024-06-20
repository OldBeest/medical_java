package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_08 {
	
	int num = 0; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명으로 사용
	static int n = 0; // 클래스 변수 - 객체선언없이 사용 클래스명.변수명으로 사용

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stu_score[] sc = new Stu_score[10]; // 배열 선언
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int s_count = 0; // 입력된 학생 수
		
		loop_main:
		while(true) {
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
			scan.nextLine(); // 엔터키 처리
			
			switch(choice) {
			case 1:
				loop_input:
				while(true) {
					System.out.println("[학생 성적 입력]");

					// 학번 자동생성
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S" + sdf.format(date) + String.format("%03d", s_count + 1);
					// 학번 저장
					sc[s_count] = new Stu_score();
					sc[s_count].stuNo = stuNo1;
					
					System.out.println("이름을 입력 하세요.(0. 이전 페이지 이동)");
					sc[s_count].name = scan.nextLine();
					if(sc[s_count].name.equals("0")) {
						System.out.println("이전 페이지로 돌아갑니다.");
						break;
					}
					
					System.out.println("국어 점수를 입력하세요.");
					sc[s_count].kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					sc[s_count].eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					sc[s_count].math = scan.nextInt();
					scan.nextLine(); // 엔터키 처리
					sc[s_count].total = sc[s_count].kor + sc[s_count].eng + sc[s_count].math;
					sc[s_count].avg = sc[s_count].total / 3.0;
					sc[s_count].rank = 0;
					
					System.out.printf("%s 학생 정보 입력이 완료되었습니다.\n", sc[s_count].name);
					
					s_count++;
					
				}//loop_input
				break;
				
			case 2:
				System.out.println("\t\t[학생 성적 출력]");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				for(int i=0; i<s_count; i++) {
					System.out.printf("%s\t", sc[i].stuNo);
					System.out.printf("%s\t", sc[i].name);
					System.out.printf("%d\t", sc[i].kor);
					System.out.printf("%d\t", sc[i].eng);
					System.out.printf("%d\t", sc[i].math);
					System.out.printf("%d\t", sc[i].total);
					System.out.printf("%.2f\t", sc[i].avg);
					System.out.printf("%d\t", sc[i].rank);
					System.out.println();
				}
				
				break;
				
			case 3:
				System.out.println("학생 이름을 입력하세요.");
				String search = scan.nextLine();
				
				for(int i=0; i<s_count; i++) {
					if(sc[i].name.equals(search)) {
						for(int j=0; j<title.length; j++) {
							System.out.printf("%s\t", title[j]);
						}
						System.out.println();
						System.out.println("--------------------------------------------");
						System.out.printf("%s\t", sc[i].stuNo);
						System.out.printf("%s\t", sc[i].name);
						System.out.printf("%d\t", sc[i].kor);
						System.out.printf("%d\t", sc[i].eng);
						System.out.printf("%d\t", sc[i].math);
						System.out.printf("%d\t", sc[i].total);
						System.out.printf("%.2f\t", sc[i].avg);
						System.out.printf("%d\t", sc[i].rank);
						System.out.println();
					}
				}
				
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop_main;
			}//switch
			
		}//loop_main
		
		
		
	}

}
