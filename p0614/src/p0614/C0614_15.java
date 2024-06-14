package p0614;

public class C0614_15 {

	public static void main(String[] args) {
		
		System.out.println(0.1d == 0.1f); //false
		
		double num = 0.1d;
		System.out.println("double 타입(0.1d) : " + num);
		double d = (double)0.1f;
		System.out.println("float 타입(0.1f) : " + d); // float자리(8번째)자리까지는 정확히 표현되고, 그 이후숫자는 임의의 쓰레기 값으로 됨(유효 값이 아님).
		
		System.out.println((float)0.1d == 0.1f); // double을 float형으로 바꿔주면(소수점 7번째 자리까지만 가져옴), true
	}

}
