package p0701;

public class Test2 {

	public static void main(String[] args) {
		
		
	Test t = new Test();
	
	t.kind = "A";
	t.number = 10;
	
	int a = t.get_number();
	t.set_number(7);
	System.out.println(a);
	System.out.println(t.number);
	}

}
