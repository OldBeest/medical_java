package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		String[][] lotto = new String[5][5];
		
		// 당첨 자리 만들기
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
			}
		}
		
		// 번호 맞추기 화면
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				lotto[i][j] = "♥";
			}
		}
		
		System.out.println("                   [뽑기 게임판]");
		System.out.println("\t|\t0\t1\t2\t3\t4");
		System.out.println("------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.print(i + "\t|\t");
			for(int j=0; j<5; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
		// 섞기
		int temp = 0;
		for(int i=0; i<25; i++) {
			int ran_idx = (int)(Math.random() * 25);
			temp = arr[0][0];
			arr[0][0] = arr[(int)(ran_idx / 5)][(int)(ran_idx % 5)];
			arr[(int)(ran_idx / 5)][(int)(ran_idx % 5)] = temp;
		}
		
		// 게임판 출력
		System.out.println("                   [당점 게임판]");
		System.out.println("\t|\t0\t1\t2\t3\t4");
		System.out.println("------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.print(i + "\t|\t");
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int cnt = 0;
		while(true) {
			// 좌표 입력
			System.out.println("가로 좌표를 입력하세요.");
			int h = scan.nextInt();
			if(h > 4 || h < 0) {
				System.out.println("잘못된 좌표입니다. 다시 입력해주세요");
				continue;
			}
			System.out.println("세로 좌표를 입력하세요.");
			int v = scan.nextInt();
			if(v > 4 || v < 0) {
				System.out.println("잘못된 좌표입니다. 다시 입력해주세요");
				continue;
			}
			
			// string 비교 : equals
			if(!lotto[v][h].equals("♥")) {
				System.out.println("이미 확인된 좌표 입니다. 다시 입력해주세요.");
				continue;
			}
			
			if(arr[v][h] == 1) {
				lotto[v][h] = "당첨";
				cnt ++;
			}
			else {
				lotto[v][h] = "꽝";			
			}
			// 결과창 출력
			System.out.println("                   [뽑기 게임판]");
			System.out.println("\t|\t0\t1\t2\t3\t4");
			System.out.println("------------------------------------");
			for(int i=0; i<5; i++) {
				System.out.print(i + "\t|\t");
				for(int j=0; j<5; j++) {
					System.out.print(lotto[i][j] + "\t");
				}
				System.out.println();
			}
			if(cnt >= 5) {
				System.out.println("당첨판을 모두 맞췄습니다!");
				break;
			}
			
		}

	}

}
