package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		String stuNo = "", name = "";
		int kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		double avg = 0.0;
		
		ArrayList<Students> list = new ArrayList<Students>();
		
//		List<Students> list = new ArrayList<Students>(); // 부모 객체를 활용해도 됨.
		

		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
				String line = br.readLine();
				if((line == null)) {
					break;
				}
				String[] arr = line.split(","); // ,를 기준으로 분리해서 배열에 집어넣음 
				
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
		
		Students.count = list.size() + 1;
		while(true) {
			// 입력 부분 : 학번 - 자동부여, 이름,국어,영어,수학 입력
			System.out.println("이름을 입력하세요.(x : 종료)");
			name = scan.next();
			if(name.equalsIgnoreCase("x")) {
				System.out.println("입력화면 종료합니다.");
				break;
			}
			
			System.out.println("국어 점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			math = scan.nextInt();
			
			list.add(new Students(name, kor, eng, math));
			
		}
		
		//파일 저장
		String str = "";
		for (Students s: list) {
			str += String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		FileWriter fw = new FileWriter("C:/save/abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		
		System.out.println("파일 저장을 완료했습니다.");
		
		fw.close();
		
		for(Students s : list) {
			System.out.printf("학번 : %s, 이름 : %s, 합계 : %d, 평균 : %.2f, 등수 : %d\n",s.getStuNo(), s.getName(), s.getTotal(), s.getAvg(), s.getRank());
		}
		
//		try {
//			FileReader fr = new FileReader("c:/save/abc.txt");
//			BufferedReader br = new BufferedReader(fr);
//			
//			while(true) {
//				try {
//					String line = br.readLine();
//					if((line == null)) {
//						break;
//					}
//					String[] arr = line.split(","); // ,를 기준으로 분리해서 배열에 집어넣음 
//					
//					stuNo = arr[0];
//					name = arr[1];
//					kor = Integer.parseInt(arr[2]);
//					eng = Integer.parseInt(arr[3]);
//					math = Integer.parseInt(arr[4]);
//					total = Integer.parseInt(arr[5]);
//					avg = Double.parseDouble(arr[6]);
//					rank = Integer.parseInt(arr[7]);
//					
//					list.add(new Students(stuNo, name, kor, eng, math, total, avg, rank));
//					
//				}catch(IOException e){
//					e.printStackTrace();
//				}
//			}
//			
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		for(Students s : list) {
//			System.out.printf("학번 : %s, 이름 : %s, 합계 : %d, 평균 : %.2f, 등수 : %d\n",s.getStuNo(), s.getName(), s.getTotal(), s.getAvg(), s.getRank());
//		}
		
	}

}
