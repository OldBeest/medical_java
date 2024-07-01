package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C0701_06 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/abc.txt");
			int read = 0;
			try {
				while(((read = fis.read()) != -1)) { // fis.read() : 파일의 데이터를 읽어옴. read에 데이터 넣어줌. read = -1이면 종료.
					System.out.println(read);
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
				
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Exception 하나만으로 try-catch문을 간소화 할 수 있음.
		try {
			FileInputStream fis = new FileInputStream("c:/save/abc.txt");
			int read = 0;
			while(((read = fis.read()) != -1)) { // fis.read() : 파일의 데이터를 읽어옴. read에 데이터 넣어줌. read = -1이면 종료.
				System.out.println(read);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		byte[] b = new byte[1024];
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/abc.txt");
//			fis.read(b);
//			System.out.println(new String(b));
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
	}//main
}//class

