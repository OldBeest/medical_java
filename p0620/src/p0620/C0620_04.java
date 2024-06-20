package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		
		String color = "white";
		boolean power = false;
		int channel = 0;
		
		// 타입 변수명 = 0
		int a = 0;
		// 객체 선언
		// 클래스타입 참조변수명 = new 클래스타입()
		
		Tv tv1;// 객체를 다루기 위한 참조변수가 선언
		tv1 = new Tv(); // 객체 생성 후, 생성된 객체의 주소를 참조변수에 저장시켜줌.
		
		Tv tv2 = new Tv();
		
		int[] num; // 배열을 다루기 위한 참조변수가 선언
		num = new int[5]; // 배열 생성 후, 생성된 배열의 주소를 참조변수에 저장시켜줌.
		
		while(true) {
			System.out.println("1. TV 켜기");
			System.out.println("2. TV 끄기");
			System.out.println("------------------");
			System.out.println("TV 상태를 선택하세요.");
			int choice = scan.nextInt();
		}
	}

}
