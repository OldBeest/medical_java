package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 발생될 것 같은 경우
			System.out.println(3);
			System.out.println(0/0); //error
			System.out.println(4);			
			
		}catch(Exception e) {
			// 예외가 발생했을 때
			System.out.println(5);
			e.printStackTrace(); // 에러부분 출력 -> 프로그램이 종료되지 않음.
		}
		System.out.println(6);
	}

}
