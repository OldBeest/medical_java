package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			int ran_num = (int)(Math.random() * 100) + 1;
			sum += ran_num;
			System.out.printf("i : %d, num : %d, sum : %d\n", i, ran_num, sum);			
		}
		System.out.println(sum);
	}

}
