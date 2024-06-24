package p0621;

import java.util.Arrays;

public class C0621_06 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1 + i;
		}
		
		System.out.println(Arrays.toString(arr));
		int[] arr2 = null;
		System.out.println(Arrays.toString(arr2));
		arr2 = arr;
		System.out.println(Arrays.toString(arr2));
		System.out.println("--------------------");
		arr2[0] = 1000;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
