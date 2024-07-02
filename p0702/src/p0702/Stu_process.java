package p0702;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Stu_process {
	
	Scanner scan = new Scanner(System.in);
	String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	String stuNo, name;
	int kor, eng, math, total, rank, choice;
	double avg;
	
	int screen(ArrayList<Students> list) {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("현재 입력된 학생 수 : " + list.size());
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 학생 검색");
		System.out.println("6. 등수 처리");
		System.out.println("7. 학생 성적 정렬");
		System.out.println("8. 학생 성적 불러오기");
		System.out.println("9. 학생 성적 저장하기");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		
		System.out.println("원하는 번호를 선택하세요.");
		choice = scan.nextInt();
		scan.nextLine(); // 엔터키 처리
		
		return choice;
	}//screen
	
	void stu_input(ArrayList<Students> list) {
		while(true) {
			
			if(list.size() != 0) {
				
				int[] num_list = new int[list.size()];
				for(int i=0; i<list.size(); i++) {
					num_list[i] = Integer.parseInt(list.get(i).getStuNo().substring(1));				
				}
				Arrays.sort(num_list);
				Students.count = num_list[list.size() - 1] + 1;
			}
			
			System.out.printf("%d 번째 학생의 이름을 입력하세요 (0.이전 페이지 이동)\n", list.size() + 1);
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				break;
			}
			System.out.printf("%s 점수를 입력하세요\n", title[2]);
			kor = scan.nextInt();
			System.out.printf("%s 점수를 입력하세요\n", title[3]);
			eng = scan.nextInt();
			System.out.printf("%s 점수를 입력하세요\n", title[4]);
			math = scan.nextInt();
			
			list.add(new Students(name, kor, eng, math));
			
			System.out.printf("%s 학생 점수를 저장합니다.\n", name);
		}//while
	}//stu_input
	
	void stu_print(ArrayList<Students> list) {
		System.out.println("\t\t[학생 성적 출력]");
		for(int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		if(list.size() == 0) {
			System.out.println("출력할 학생성적이 없습니다.");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			Students s = list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
	}//stu_print
	
	int stu_subSearch(ArrayList<Students> list) {
		System.out.println("[학생 검색]");
		System.out.println("학생 이름을 입력하세요.");
		String search = scan.next();
		
		int temp_no = -1;
		for(int i=0; i<list.size(); i++) {
			Students s = list.get(i);
			
			if(s.getName().equals(search)) {
				temp_no = i; // 학생 정보의 인덱스 위치
				System.out.printf("%s 학생이 검색되었습니다.\n", search);
				return temp_no;
			}

		}
		return temp_no;
	}
	
	void stu_update(ArrayList<Students> list) {
		
		int temp_no = stu_subSearch(list);
		
		if(temp_no == -1) {
			System.out.println("찾는 학생이 없습니다. 다시 검색해주세요.");
			return;
		}
		
		System.out.println("[성적 수정]");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		
		Students s = list.get(temp_no);
		
		switch(choice) {
		case 1:
			subject_update(s, s.getKor(), choice);
			break;
		case 2:
			subject_update(s, s.getEng(), choice);				
			break;
		case 3:
			subject_update(s, s.getMath(), choice);				
			break;
		}//switch

	}//stu_update
	
	void subject_update(Students s, int score, int idx) {
		System.out.printf("[%s 점수 수정]\n", title[choice + 1]);
		System.out.printf("현재 %s 점수 : %d\n", title[choice + 1], score);
		System.out.printf("변경 %s 점수를 입력하세요\n", title[choice + 1]);
		score = scan.nextInt();
		switch(choice) {
		case 1:
			s.setTotal(score + s.getEng() + s.getMath());
			break;
		case 2:
			s.setTotal(s.getKor() + score + s.getMath());
			break;
		case 3:
			s.setTotal(s.getKor() + s.getEng() + score);

			break;
		}
		s.setAvg(s.getTotal() / 3.0);
	}//subject_update
	
	void stu_delete(ArrayList<Students> list) {
		int temp_no = stu_subSearch(list);
		
		if(temp_no == -1) {
			System.out.println("찾는 학생이 없습니다. 다시 검색해주세요.");
			return;
		}
		System.out.println("정말 삭제하시겠습니까?(1. 삭제 0. 취소)");
		choice = scan.nextInt();
		if(choice != 1) {
			System.out.println("취소 합니다.");
			return;
		}
		System.out.printf("%s 학생 성적을 삭제합니다.\n", list.get(temp_no).getName());
		list.remove(temp_no);
	}//stu_delete
	
	void stu_search(ArrayList<Students> list) {
		System.out.println("[학생 검색]");
		System.out.println("--------------------------");
		System.out.println("1. 학생 이름 검색");
		System.out.println("2. 합계 점수 검색");
		System.out.println("3. 평균 점수 검색");
		System.out.println("--------------------------");
		
		System.out.println("원하는 번호를 선택하세요.");
		choice = scan.nextInt();
		scan.nextLine();
		
		ArrayList<Students> search_list = new ArrayList<Students>();
		
		switch(choice) {
		case 1:
			System.out.println("학생이름을 입력하세요.");
			String search_name = scan.nextLine();
						
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getName().contains(search_name)) {
					search_list.add(list.get(i));
				}
			}
			break;
		case 2:
			System.out.println("몇 점이상의 합계점수를 검색하시겠습니까?");
			int search_total = scan.nextInt();
						
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTotal() > search_total) {
					search_list.add(list.get(i));
				}
			}
			break;
		case 3:
			System.out.println("몇 점이상의 평균 점수를 검색하시겠습니까?");
			double search_avg = scan.nextInt();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAvg() > search_avg) {
					search_list.add(list.get(i));
				}
			}
			break;
		}//switch
		stu_print(search_list);
	}//stu_search
	
	void stu_rank(ArrayList<Students> list) {
		System.out.println("[등수 처리]");
		
		for(int i=0; i<list.size(); i++) {
			int count = 1;
			for(int j=0; j<list.size(); j++) {
				if(list.get(i).getAvg() < list.get(j).getAvg()) {
					count ++;
				}
			}
			list.get(i).setRank(count);
		}
		System.out.println("등수 처리가 완료되었습니다.");
	}//stu_rank
	
	void stu_sort(ArrayList<Students> list) {
		System.out.println("[학생 성적 정렬]");
		System.out.println("1. 이름 순차정렬");
		System.out.println("2. 이름 역순정렬");
		System.out.println("3. 합계 순차정렬");
		System.out.println("4. 합계 역순정렬");
		System.out.println("5. 학번 순차정렬");
		System.out.println("원하는 번호를 선택하세요.");
		
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			list.sort(new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			break;
			
		case 2:
			list.sort(new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;
			
		case 3:
			list.sort(new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return o1.getTotal() - o2.getTotal();
				}
			});
			break;
			
		case 4:
			list.sort(new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return o2.getTotal() - o1.getTotal();
				}
			});
			break;
			
		case 5:
			list.sort(new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return o1.getStuNo().compareTo(o2.getStuNo());
				}
			});
			break;
		}
	}//stu_sort
	
	void stu_read(ArrayList<Students> list) throws Exception{
		// 파일에서 성적 정보 가져오기
		FileReader fr = new FileReader("C:/save/stu_score.txt");
		BufferedReader br = new BufferedReader(fr);
			
		while(true) {
			
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			String[] arr = str.split(",");
			
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			
			list.add(new Students(stuNo, name, kor, eng, math, total, avg, rank));
		}
		br.close();
		fr.close();
	}//stu_read
	
	void stu_save(ArrayList<Students> list) throws Exception{
		System.out.println("파일을 저장하시겠습니까?(y)");
		String menu = scan.next();
		if(menu.equals("y") || menu.equals("Y")) {
			
			FileWriter fr = new FileWriter("c:/save/stu_score.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			
			String str = "";
			for(Students s : list) {
				str += String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
			}
			
			bw.write(str);
			System.out.println("파일 저장이 완료되었습니다.");
			bw.close();
			fr.close();
		}
	}//stu_save
}//class
