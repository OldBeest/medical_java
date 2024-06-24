package p0624;

import java.util.Scanner;

public class Stu_pro {
	
	Scanner scan = new Scanner(System.in);
	int s_count = 0; // 학생정보 담을 인덱스 번호 초기화
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	
	int main_screen() {
		System.out.println("[ 성적 처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 종료");
		
		System.out.println("원하는 메뉴 번호를 입력하세요.");
		int choice = scan.nextInt();
		scan.nextLine();
		
		return choice; 
	}
	
	void input_data(Stu_sco[] sc) {
		while(true) {
			s_count = Stu_sco.count;
			
			System.out.println("[ 학생 성적 입력 ]");
			System.out.println("이름을 입력하세요.(0. 이전화면)");
			name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("이전 화면으로 돌아갑니다.");
				break;		
			}
			System.out.println("국어 성적을 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요.");
			math = scan.nextInt();
			
			scan.nextLine();
			
			sc[s_count] = new Stu_sco(name, kor, eng, math);
			
			System.out.println();
			
		}
	}
	
	void print_alldata(Stu_sco[] sc) {
		s_count = Stu_sco.count;
		
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
			System.out.printf("%d\t\n", sc[i].rank);
		}
		System.out.println();
	}
	
	void print_sub() {
		for(int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);			
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}
	
	void print_onedata(Stu_sco sc) {		
			System.out.printf("%s\t", sc.stuNo);
			System.out.printf("%s\t", sc.name);
			System.out.printf("%d\t", sc.kor);
			System.out.printf("%d\t", sc.eng);
			System.out.printf("%d\t", sc.math);
			System.out.printf("%d\t", sc.total);
			System.out.printf("%.2f\t", sc.avg);
			System.out.printf("%d\t\n", sc.rank);
	}
	
	void give_rank(Stu_sco[] sc) {
		s_count = Stu_sco.count;
		
		for(int i=0; i<s_count; i++) {
			int count = 1;
			for(int j=0; j<s_count; j++) {
				if(sc[i].total < sc[j].total) {
					count++;
				}
				sc[i].rank = count;
			}
		}
		System.out.println("등수 처리가 완료되었습니다.");
	}
	
	void find_data(Stu_sco[] sc) {
		s_count = Stu_sco.count;
		
		System.out.println("1. 이름으로 검색");
		System.out.println("2. 총점으로 검색");
		System.out.println("원하는 메뉴의 번호를 선택하세요.");
		int choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice) {
			case 1:
				boolean find_flag = false;
				System.out.println("이름을 입력하세요.");
				String search = scan.nextLine();
				for(int i=0; i<s_count; i++)
					if(sc[i].name.equals(search)) {
						System.out.printf("%s 학생을 찾았습니다.\n", search);
						print_sub();
						print_onedata(sc[i]);
						find_flag = true;
						break;
					}
				if(!find_flag) {
					System.out.printf("%s 학생을 찾지못했습니다.\n", search);
				}
				break;
				
			case 2:
				System.out.println("기준 점수를 입력하세요.");
				int cut_score = scan.nextInt();
				System.out.println("1. 이상");
				System.out.println("2. 미만");
				System.out.println("원하는 메뉴 번호를 선택하세요.");
				
				int cut_choice = scan.nextInt();
				scan.nextLine();
				switch(cut_choice) {
					case 1:
						print_sub();
						for(int i=0; i<s_count; i++) {
							if(sc[i].total >= cut_score) {
								print_onedata(sc[i]);
							}
						}
						break;
					case 2:
						print_sub();
						for(int i=0; i<s_count; i++) {
							if(sc[i].total < cut_score) {
								print_onedata(sc[i]);
							}
						}
						break;
				}//switch(cut_choice)
				break;
		}//switch
	}
	
	void mod_data(Stu_sco[] sc) {
		boolean find_flag = false;
		System.out.println("이름을 입력하세요.");
		String search = scan.nextLine();
		for(int i=0; i<s_count; i++)
			if(sc[i].name.equals(search)) {
				System.out.printf("%s 학생을 찾았습니다.\n", search);
				print_sub();
				print_onedata(sc[i]);
				find_flag = true;
				
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("수정을 원하는 과목의 번호를 입력하세요.");
				
				int mod_choice = scan.nextInt();
				
				switch(mod_choice) {
					case 1:
						System.out.printf("현재 %s 점수 : %d\n", title[mod_choice + 1], sc[i].kor);
						System.out.println("수정 후 점수를 입력하세요.");
						int new_kor = scan.nextInt();
						sc[i].kor = new_kor;
						sc[i].total = sc[i].kor + sc[i].eng + sc[i].math;
						sc[i].avg = sc[i].total / 3.0;
						break;
					case 2:
						System.out.printf("현재 %s 점수 : %d\n", title[mod_choice + 1], sc[i].eng);
						System.out.println("수정 후 점수를 입력하세요.");
						int new_eng = scan.nextInt();
						sc[i].eng = new_eng;
						sc[i].total = sc[i].kor + sc[i].eng + sc[i].math;
						sc[i].avg = sc[i].total / 3.0;
						break;
					case 3:
						System.out.printf("현재 %s 점수 : %d\n", title[mod_choice + 1], sc[i].math);
						System.out.println("수정 후 점수를 입력하세요.");
						int new_math = scan.nextInt();
						sc[i].math = new_math;
						sc[i].total = sc[i].kor + sc[i].eng + sc[i].math;
						sc[i].avg = sc[i].total / 3.0;
						break;
				}
			}
		if(!find_flag) {
			System.out.printf("%s 학생을 찾지못했습니다.\n", search);
		}
	}
}
