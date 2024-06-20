package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println((a+1) + (b+1));
		System.out.println((a+1) - (b+1));
		System.out.println((a+1) * (b+1));
		System.out.println((a+1) / (b+1));
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t2 ch : " + t2.channel); //0
		t2 = t1; // shallow copy
		t1.channel = 7;
		System.out.println("t2 ch : " + t2.channel); //7 (t1과 같은 주소를 사용하기 때문에 값이 바뀐다. -> shallow copy)
				
//		Tv t = new Tv();
//		t.channel = 7;
//		t.channelUp();
//		System.out.println(t.channel);
//		t.channelDown();
//		t.channelDown();
//		System.out.println(t.channel);
	}

}
