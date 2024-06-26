package p0626;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_main {

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Students> list = new ArrayList<Students>(); // 배열 선언
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("유관순", 80, 90, 99));
		list.add(new Students("이순신", 89, 99, 91));
		list.add(new Students("김구", 86, 89, 81));
		list.add(new Students("김유신", 50, 70, 81));
		list.add(new Students("홍길자", 90, 99, 98));
		list.add(new Students("홍길순", 80, 85, 99));
		Stu_process sp = new Stu_process();

		loop_main:
		while(true) {	
			int choice = sp.screen(list);
			
			switch(choice) {
			// 학생 성적 입력 부분
			case 1:
				sp.stu_input(list);
				break;
			// 학생 성적 출력 부분
			case 2:
				sp.stu_print(list);
				break;
			// 학생 성적 수정 부분
			case 3:
				sp.stu_update(list);
				break;
				// 학생 성적 삭제 부분
			case 4:
				sp.stu_delete(list);
				break;
				// 학생 검색 부분
			case 5:
				sp.stu_search(list);
				break;
				// 학생 출력 부분
			case 6:
				sp.stu_rank(list);
				break;
				// 학생 출력 부분
			case 7:

				break;

			// 프로그램 종료 부분
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop_main;
			}//switch
		}

	}
}
