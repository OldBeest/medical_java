package p0617;

import java.util.Scanner;

public class C0617_12 {
	public static void main(String[] args) {
		// 점수를 입력받아, 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int score = scan.nextInt();
		String grade = "";
		if(score >= 0 && score <= 100) {
			switch((score / 10)) {
				case 10 :{
					grade = "A+";
					break;
				}
				case 9 :
				{
					grade = "A";
					break;
				}
				case 8 :
				{
					grade = "B";
					break;
				}
				case 7 :
				{
					grade = "C";
					break;
				}
				case 6 :
				{
					grade = "D";
					break;
				}
				default :
				{
					grade = "F";
					break;
				}
			}
			if(grade != "F" && score % 10 >= 7) {
				grade += "+";
				System.out.println(grade);
			}
			else if(grade !="F" && grade !="A+" && score % 10 <= 2) {
				grade += "-";
				System.out.println(grade);
			}else {
				System.out.println(grade);
			}
			
		}else {
			System.out.println("올바른 점수가 아닙니다.");
		}
	}
}
