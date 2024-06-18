package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];
		int[] my_arr = new int[6];
		
		for(int i=1; i<=45; i++) {
			ball[i-1] = i;
		}
		
		// 랜덤으로 섞기
		int no = 0; // 랜덤 번호
		int t_value = 0; // 값을 저장
		for(int i = 0; i<300; i++) {
			no = (int)(Math.random() * 45);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		for(int i=0; i<my_arr.length; i++) {
			System.out.printf("%d 번재 숫자 입력 : ", i + 1);
			my_arr[i] = scan.nextInt();
		}
		
		System.out.print("입력한 숫자 : ");
		for(int i=0; i<my_arr.length; i++) {
			System.out.print(my_arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("랜덤 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
		
//		System.out.println(Arrays.toString(ball));
//		System.out.println(Arrays.toString(my_arr));
		
//		int[] array = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			array[i] = scan.nextInt();
//		}
//		System.out.println(array[2]);
//		System.out.println(array[3]);
	}

}
