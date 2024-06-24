package p0624;

public class C0624_13 {

	public static void main(String[] args) {
		
	Stu_pro sp = new Stu_pro();
	Stu_sco[] sc = new Stu_sco[10];
	
	loop_main:
	while(true) {
		int choice = sp.main_screen();
		
		switch(choice) {
			case 1:
				sp.input_data(sc);
				break;
			case 2:
				sp.print_alldata(sc);
				break;
			case 3:
				sp.mod_data(sc);
				break;
			case 4:
				sp.find_data(sc);
				break;
			case 5:
				sp.give_rank(sc);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop_main;
		}

	}
	}

}
