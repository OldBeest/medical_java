package p0617;

import java.util.Scanner;

public class C0617_16 {
	
	public static void main(String[] args) {
		
//		int sum = 0;
		
		for(int i=2; i<10; i++) {
			if(i %2 != 0) { 
				System.out.println(i + "단");
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			}
			System.out.println();
		}
			
		
//		int i = 0; // for문 내의 변수를 활용하기 위해 밖에서 미리 선언, for문 내에서는 int가 빠짐(미리 선언했기 때문에) 
//		for(i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println((i - 1) + "까지의 합 :" +  sum);
		
//		for(int i=1; i<=100; i++) {
//			sum += i;
////			System.out.printf("i : %d, sum : %d\n", i, sum);			
//			if(sum > 150) {
//				System.out.printf("i : %d, sum : %d\n", i, sum);
//				break;
//			}
//		}
//		
//		int sum1 = 0;
//		int cnt = 1;
//		while(sum1 < 150) {
//			sum1 += cnt;
//			cnt++;
//		}
//		System.out.printf("i : %d, sum : %d\n", cnt - 1, sum1);
		
//		for(int i=2; i<10; i++) {
//			System.out.println(i + "단");
//			for(int j=1; j<10; j++) {
//				System.out.printf("%d x %d = %d\t", i, j, i * j);
//			}
//			System.out.println("");
//		}
//		System.out.println("");
//		for(int i=1; i<10; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.printf("%d x %d = %d\t", j, i, i * j);
//			}
//			System.out.println("");
//		}
//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		for(int i=0; i<10; i++) {
//			int input_num = scan.nextInt();
//			sum += input_num;
//			System.out.println(sum);
//		}
//		
//		for(int i = 1; i <= 100; i++) { // 2단계씩 하려면 증감식에 i += 2를 사용한다.
//			if(i % 2 == 1) {
//				sum += i;
////				System.out.printf("i : %d, sum : %d\n", i, sum);
//			}
//		}
//		System.out.println("홀수 합 : " + sum);
//		
//		int sum1 = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				sum1 += i;
////				System.out.printf("i : %d, sum : %d\n", i, sum1);
//			}
//		}
//		System.out.println("짝수 합 : " + sum1);
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.printf("i : %d, sum : %d\n", i, sum);
//		}
//		System.out.println(sum);
	}
}
