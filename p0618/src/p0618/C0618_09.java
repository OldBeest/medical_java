package p0618;

import java.util.Scanner;

public class C0618_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] binary = {"0000", "0001", "0010", "0011",
								"0100", "0101", "0110", "0111",
								"1000", "1001", "1010", "1011",
								"1100", "1101", "1110", "1111"};
		
		System.out.println("문자를 입력하세요.");
		String input = scan.next();
		String result = "";
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				result += binary[input.charAt(i) - '0'] + " ";
			}else {				
				result += binary[input.charAt(i) - 'A' + 10] + " "; // A를 기준으로 1,2,3... 순서를 만들어주고 10을 더해줌
			}
		}
		System.out.println("입력 문자 : " + input);
		System.out.println("이진 코드 : " + result);				
	}

}
