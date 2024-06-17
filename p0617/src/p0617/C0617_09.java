package p0617;

public class C0617_09 {
	
	public static void main(String[] args) {
		// 문자열 선언방법
		String str = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		
		int num = 5;
		int num2 = 5;
		// 기본 타입 8개 - boolean, char, byte, short, int, long, float, double
		// 비교연산자를 통해서 확인 가능
		System.out.println("--------------");
		if(num == num2) {
			System.out.println("같은 숫자 입니다.");
		}else {
			System.out.println("다른 숫자 입니다.");
		}
		
		System.out.println("--------------");
		System.out.println("str : " + str);
		System.out.println("new str(str3) : " + str3);
		
		if(str == str2) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		System.out.println("--------------");
		//문자열 참조 변수 비교는 == 비교가 안됨, equals라는 method를 사용해야함.
		System.out.println(str == str2); // true 
		System.out.println(str == str3); // false 
		
		System.out.println("--equals 사용------------");
		if(str.equals(str3)) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		System.out.println("--== 사용------------");
		if(str3 == "안녕") {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
	}
}
