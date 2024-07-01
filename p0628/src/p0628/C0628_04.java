package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고 싶은 문자열을 입력하세요.");
		
		String search = scan.next();
		
		
		int count = 0;
		String str = "abcdeakabcdefgaabcabcsjkdfkabckjabcaa";
		
		while(true) {
			
			int num = 0;
			num = str.indexOf(search);
			
			if(num == -1) { // 해당하는 문자열을 못찾았을 때
				break; 
			}else {
				count++;
				str = str.substring(num + search.length());
			}
		}
		System.out.printf("찾는 문자열 %s의 개수 : %d", search, count);
	}
}
