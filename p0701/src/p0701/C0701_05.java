package p0701;

public class C0701_05 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		//thread 실행
		t1.start();
		t2.start();
	}

}
