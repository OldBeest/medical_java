package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		Stu_score stu;
//		stu.kor = 100; error 
		Stu_score s = new Stu_score();
//		Stu_score s2 = new Stu_score("S0001", "홍길동", 100, 99, 90);
//		System.out.println("합계 : " + s2.total);
//		System.out.println("평균 : " + s2.avg);
		
		s.kor = 100;
		System.out.println("s.kor : " + s.kor);
		
		int result = 1;
		
		for(int i=5; i>0; i--) {
			result *= i;
		}
		
		System.out.println("5 Factorial : " + result);
		
		add(); // static method : 객체선언없이 클래스명.메소드명, 같은 클래스 내에서는 클래스명 생략 가능
		
		C0624_08 c = new C0624_08();
		
		c.change(); // instance method : 객체선언 후 참조변수명.메소드명
	}
	
	//overloading : 메소드명이 같아도, 매개변수 형태가 다르면 다른 메소드가 됨. 같은 메소드로 다양한 형태의 자료형을 처리할 수 있음.
	void change() {
		System.out.println(0);	
	}
	void change(int a) {
		System.out.println(a);		
	}
	void change(int a, int b) {
		System.out.println(a + b);			
	}
	static void add() {	
	}
}
