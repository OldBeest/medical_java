package p0702;

import java.util.ArrayList;
import java.util.Scanner;

public class C0702_02 {

	public static void main(String[] args) throws Exception{
		
		Stu_process sp = new Stu_process();
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Students> list = new ArrayList<Students>();
		
		int choice = 0;
		
		loop_main:
		while(true) {

			choice = sp.screen(list);
			
			switch(choice) {
			case 1:
				sp.stu_input(list);
				break;
				
			case 2:
				sp.stu_print(list);
				break;
			
			case 3:
				sp.stu_update(list);
				break;
				
			case 4:
				sp.stu_delete(list);
				break;
				
			case 5:
				sp.stu_search(list);
				break;
				
			case 6:
				sp.stu_rank(list);
				break;
				
			case 7:
				sp.stu_sort(list);
				break;
			
			case 8:
				sp.stu_read(list);
				break;
			
			case 9:
				sp.stu_save(list);
				break;
				
			default :
				System.out.println("프로그램을 종료합니다.");
				break loop_main;
			}
			
		}
		
	}

}
