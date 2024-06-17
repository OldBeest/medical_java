package p0617;
import java.util.Arrays;
public class C0617_test {

	public static void main(String[] args) {
//		int arr[][] = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};
//		for(int j=0; j<2; j++)
//			for(int i=0; i<5; i++) {
//				System.out.println(arr[j][i]);
				
//		char array[][] = new char[][] {{'a', 'b'}, {'c', 'd', 'e'}, {'f', 'g', 'h', 'i'}};
//		for (int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				System.out.println(array[i][j]);
//				
//
//			}
//		}
//		String array[][] = new String[][] {{"동해", "물과"}, {"백두산이", "마르고", "닳도록"}, {"하느님이", "보우하사", "우리나라", "만세"}};
//		for (int i=0; i<array.length; i++) {
//			System.out.println(Arrays.toString(array[i]));
//			for(int j=0; j<array[i].length; j++) {
//				System.out.println(array[i][j]);
//				
//				
//			}
//		}
//		for(String[] arr : array) {
//			for(String str : arr) {
//				System.out.println(str);
//			}
//		}
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(strArray);
		for(String str : strArray)
			System.out.println(str);
		
		Fish_Bread fish_b = new Fish_Bread();
		
		fish_b.m = 5;
		System.out.println(fish_b.m);
		fish_b.print();
	}
}
class Fish_Bread{
	int m = 3;
	void print() {
		System.out.println("붕어빵을 굽습니다.");
	}
}
