package p0614;

import java.util.Scanner;
public class C0614_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
	
//		int a = 10;
//		
//		if(a == 10) {
//			System.out.println("10이랑 같넹");			
//		}
//		else {			
//			System.out.println("10이랑 안같넹");			
//		}
		
		if(a > 0) {
			System.out.println("양수");
		}
		else if(a < 0){
			System.out.println("음수");			
		}
		else {			
			System.out.println("0");			
		}
	}
}
