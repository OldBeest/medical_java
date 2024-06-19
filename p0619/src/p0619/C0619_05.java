package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<25; i++) {
			arr[i / 5][i % 5] = i + 1;
		}
		int temp = 0; 
		for(int i=0; i<100; i++) {
			int ran_idx = (int)(Math.random() * 25);
			temp = arr[0][0];
			arr[0][0] = arr[ran_idx / 5][ran_idx % 5];
			arr[(int)ran_idx / 5][ran_idx % 5] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				 System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
