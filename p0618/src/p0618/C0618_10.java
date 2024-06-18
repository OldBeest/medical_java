package p0618;

import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ran_num = (int)(Math.random() * 100) + 1;
		int[] my_arr = new int[10];
		boolean correct_flag = false;
		System.out.println("랜덤 숫자 " + ran_num);
		
		for(int i=0; i<10; i++) {
			while(!correct_flag) {
				System.out.println("임의의 숫자를 입력하세요");
				int my_num = scan.nextInt();
				if(my_num <1 || my_num >100) {
					System.out.println("잘못된 숫자를 입력했습니다. 다시 입력하세요.");
				}else {
					my_arr[i] = my_num;
					if(my_num > ran_num) {
						System.out.println("입력한 수보다 작습니다." + my_num);
						break;
					}else if(my_num < ran_num){
						System.out.println("입력한 수보다 큽니다." + my_num);
						break;
					}
					else {					
						System.out.println("정답!" + my_num);
						correct_flag = true; 
					}
				}
			}
			if(correct_flag) {
				System.out.println((i + 1) +"번째로 맞추셨네요");
				break;
			}			
		}
		if(!correct_flag) {
			System.out.println("10번의 기회를 모두 사용했지만 아쉽게도 못맞췄네요. 정답은 " + ran_num + "이었습니다.");
			int[] gap_arr = new int[10];
			
			for(int i=0; i<10; i++) {
				gap_arr[i] = Math.abs(my_arr[i] - ran_num);
				}
			System.out.print("근사 값의 차 : ");
			for(int i=0; i<10; i++)
				System.out.print(gap_arr[i] + " ");
			System.out.println();
			
			int[] gap_origin = gap_arr.clone(); // 배열 복사
			
			for(int val :gap_arr) {
				for(int j=0; j<9; j++) {
					if(gap_arr[j] > gap_arr[j + 1]) {
						int temp = gap_arr[j];
						gap_arr[j] = gap_arr[j + 1];
						gap_arr[j + 1] = temp;
					}
				
			}
				
			}
			System.out.print("정렬된 근사 값의 차 : ");
			for(int i=0; i<10; i++)
				System.out.print(gap_arr[i] + " ");
			System.out.println();
			
			System.out.print("근사 값 : ");
			for(int i = 0; i<10; i++) {
				if(gap_arr[0] == gap_origin[i]) {
					System.out.print(my_arr[i] + " ");
				}
			}
			
			
			
		
		
//		int[] input = new int[10];
//		int i = 0;
//		int num = 0;
//		while(i<10) {
//			System.out.println("숫자를 입력하세여");
//			num = scan.nextInt();
//			
//			if(num < 1 || num > 100) {
//				System.out.println("1부터 100까지 숫자를 입력해야 합니다. 다시 입력하세요");
//				continue;
//			}
//			
//			input[i] = num;
//			i++;
//			
//			if(num > ran_num) {
//				System.out.println("입력한 숫자보다 작은 수를 입력하세요.");
//			}
//			else if(num < ran_num) {
//				System.out.println("입력한 숫자보다 큰 수를 입력하세요.");
//			}
//			else {
//				System.out.println("정답입니다.");
//				break;
//			}
//		}
//		
//		System.out.println("랜덤 번호 : " + ran_num);
//		System.out.print("입력 번호 : ");
//		for(int j=0; j<i; j++) {
//			System.out.print(input[j] + " ");
//		}
//		System.out.println();
		}
	}
}
