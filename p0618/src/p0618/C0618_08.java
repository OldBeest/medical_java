package p0618;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int temp = 0;
		int idx = 0;
		for(int j=0; j<300; j++) {
			idx = (int)(Math.random() * ball.length);
			temp = ball[0];
			ball[0] = ball[idx];
			ball[idx] = temp;
		}
		
		int[] my_num = new int[6];
		

		System.out.print("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		int n = 0;
		while(n < 6){
			System.out.printf("%d 번째 숫자 입력 : ", n + 1);
			int num = scan.nextInt();
			if(num < 1 || num > 45) {
				System.out.println("숫자가 잘못 입력되었습니다. 1~45까지의 숫자만 입력해주세요.");
				continue;
			}else {
				my_num[n] = num;
				n++;
			}
		}

		
		System.out.print("나의 번호 : ");
 		for(int i=0; i<my_num.length; i++) {
			System.out.print(my_num[i] + " ");
		}
 		System.out.println();
 		
		
 		int[] win_arr = new int[6];
		int count = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(my_num[i] == ball[j]) {
					win_arr[count] = ball[j];
					count++;
					break;
				}
			}
		}
		System.out.println("당첨 개수 : " + count);
		System.out.print("당첨 번호 : ");
		for(int i=0; i<count; i++) {
				System.out.printf(win_arr[i] + " ");				
		}
		System.out.println();
		switch(count) {
			case 0:
			case 1:
			case 2:{
				System.out.println("당첨 개수 : " + count + " 개 " + "꽝!");
				break;				
			}
			default :{
				System.out.printf("당첨 개수 : " + count + " 개 " + "당첨 금액 : %,d 원", (long)Math.pow(10, (2 * count - 2)));
				break;
			}
		}
				
	}

}
