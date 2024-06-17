package p0617;

public class C0617_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ctrl + space : 자동 완성
		System.out.println(7 + 7 + ""); // 14 : string
		System.out.println("" + 7 + 7); // 77 : string
		
		char ch = 'a';
		System.out.println(ch);
		
		int num = 'a';
		System.out.println(num); // 97    ASCII code value -  a : 97, A : 65, 0 : 48
		
		int num2 = 98;
		ch = (char)num2; // type mismatch
		System.out.println(ch); // b
		
		// casting (형 변환) : 크기(용량)가 작은 쪽에서 큰 쪽으로 변환할 때는 생략이 가능하지만, 큰 쪽에서 작은 쪽으로 변환할 때는 타입명을 꼭 넣어줘야함. 
	}

}
