package p0617;

import java.util.Scanner;

public class C0617_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println("연산 기호를 입력하세요.");
		System.out.println("1 : + , 2 : - , 3 : x , 4 : / ");
		
		int opr = scan.nextInt();
		
		switch(opr) {
			case 1:{
				System.out.printf("두 수의 합은 %d 입니다.\n", (num1 + num2));
				break;
			}
			case 2:{
				System.out.printf("두 수의 차는 %d 입니다.\n", (num1 - num2));
				break;
			}
			case 3:{
				System.out.printf("두 수의 곱은 %d 입니다.\n", (num1 * num2));
				break;
			}
			case 4:{
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
					if(num1 % num2 == 0) {
						System.out.printf("두 수의 나누기는 %d 입니다.\n", (num1 / num2));											
					}
					else {						
						System.out.printf("두 수의 나누기는 %.2f 입니다.\n", (num1 / (float)num2));											
					}
				}
				break;
			}
			default :{
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
