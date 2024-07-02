package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Stu_process1 {
	
	Scanner scan = new Scanner(System.in);
	
	String stuNo = "", name = "", choice = "";
	int kor = 0, eng = 0, math = 0, total = 0, rank = 0;
	double avg = 0.0;
	
	ArrayList<Students> list = new ArrayList<Students>();
	
	void input_data(ArrayList<Students> list) {
		if(list.size() != 0) {
			
			int[] num_list = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				num_list[i] = Integer.parseInt(list.get(i).getStuNo().substring(1));				
			}
			Arrays.sort(num_list);
			System.out.println(num_list);
			Students.count = num_list[list.size() - 1] + 1;
		}
		
		
		System.out.println("이름을 입력하세요.(x : 종료)");
		name = scan.next();
		if(name.equalsIgnoreCase("x")) {
			System.out.println("입력화면 종료합니다.");
			return;
		}
		
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = scan.nextInt();
		
		list.add(new Students(name, kor, eng, math));
		
		System.out.println(name + " 학생의 성적이 입력되었습니다.");
	}
	
	void print_upper() {
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------");
	}
	
	void print_data(ArrayList<Students> list) {
		
		for(Students s : list) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
	}
	
	void read_data(ArrayList<Students> list) throws Exception{
		// 파일에서 성적 정보 가져오기
		
		FileReader fr = new FileReader("C:/save/abc.txt");
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
	}
	
	void save_data(ArrayList<Students> list) throws Exception{
		System.out.println("파일을 저장하시겠습니까?(y)");
		choice = scan.next();
		if(choice.equals("y")) {
			
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
	}
}
