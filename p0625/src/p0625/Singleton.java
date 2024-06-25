package p0625;

public class Singleton {
	
	private int hour;
	
	//클래스 변수 - 객체선언 없이,  클래스명.변수명
	private static Singleton s = new Singleton();
	
	private Singleton(){
		
	}
	
	//클래스 메소드 - 객체선언 없이, 클래스명.메소드명
	public static Singleton getInstance() {
		return s;
	}
}
