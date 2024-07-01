package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		
		//String
		String str = "123";
		System.out.println(str.hashCode());
		str = str + "12";
		System.out.println(str.hashCode());
		System.out.println(str);
		
		//StringBuffer
		StringBuffer sb = new StringBuffer("123");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//sb = sb + "12"; //error
		sb = sb.append("12");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		int a = 10;
		int b = 5;
		int c = 100;
		Math.max(Math.max(a, b), c); // 3개를 비교할 때
	}

}
