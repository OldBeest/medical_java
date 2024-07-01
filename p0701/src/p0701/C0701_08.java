package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0701_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList<Students>();
		
		//입력
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
				
		list.add(new Students(name, kor, eng, math));
		
		System.out.println("list에 학생성적이 저장되었습니다.");
		
		// 1.txt 파일에 저장
		
		try {
			FileWriter fw = new FileWriter("c:/save/1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(Students s: list) {
//				String str = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());				
				bw.write("" + s); // ""를 앞에 붙여서 객체를 toString을 활용하게 만듬
				bw.close();
				fw.close();
				System.out.println("파일 저장이 완료되었습니다.");
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//출력
		for(Students s : list) {
//			System.out.printf("%s , %d, %.2f\n", s.getName(), s.getTotal(), s.getAvg());
			System.out.println(s);
		}
		
		
//		ArrayList<Students> list = new ArrayList<Students>();
//		list.add(new Students("홍길동", 100, 100, 100));
//		list.add(new Students("유관순", 90, 90, 90));
//		list.add(new Students("이순신", 70, 70, 70));
//		
//		for(Students s : list) {
//			System.out.printf("%s , %d, %.2f\n", s.getName(), s.getTotal(), s.getAvg());
//		}
		
//		for(int i=0; i<list.size(); i++) {
//			Students s = (Students) list.get(i);
//			System.out.printf("%s , %d, %.2f\n", s.getName(), s.getTotal(), s.getAvg());
//		}
		
		
	}

}
