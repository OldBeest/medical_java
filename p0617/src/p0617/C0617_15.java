package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int ran_num = (int)(Math.random() * 10) + 1;
			System.out.println("숫자 하나를 입력하세요.");
			int my_num = scan.nextInt();
			if (ran_num == my_num) {
				System.out.println("당첨!");
				break;
			}
			else {
				System.out.println("틀렸습니다." + "당첨 번호는 " + ran_num + "입니다.");
			}
		}
		
//		int ran_num = (int)(Math.random() * 100) + 1;
//		System.out.println(ran_num);
//		
//		int ran3 = (int)(Math.random() * 3) + 1;
//		System.out.println(ran3);
//		
//		int rotto_num = (int)(Math.random() * 45) + 1;
//		System.out.println(rotto_num);
		
		//		Math.random(); // 0.0 ~ 0.9999999....(0 <= x && x < 1)
//		Math.round(0); // return type : int
//		Math.max(10.5, 5); // input type에 따라 return type도 바뀜
//		System.out.println(Math.random()); // return type: double
//		
//		int num = (int)(Math.random() * 10) + 1; // 1부터 10까지 랜덤한 정수
//		System.out.println(num);
//		
//		int num2 = (int)(Math.random() * 100) + 1; // 1 ~ 100
//		System.out.println(num2);
//		
//		int num3 = (int)(Math.random() * 5); // 0 ~ 4
//		System.out.println(num3);
//
//		int num4 = (int)(Math.random() * 20); // 0 ~ 19
//		System.out.println(num4);
//		
//		int num5 = (int)(Math.random() * 9) + 2; // 0 ~ 8까지 하고, 2를 더해줌
//		System.out.println(num5);
	}

}
