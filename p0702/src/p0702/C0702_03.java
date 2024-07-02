package p0702;

import java.util.Arrays;

public class C0702_03 {

	public static void main(String[] args) {
		
		String[] strArr1 = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006", "S0007"};
		String[] strArr2 = {"S0001", "S0003", "S0005", "S00010", "S00021", "S00025", "S00026"};
		
		int[] arr = {1, 5, 21, 30, 2, 11, 303};
		
		Arrays.sort(arr); //순차정렬
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[arr.length - 1] + 1);
	}

}
