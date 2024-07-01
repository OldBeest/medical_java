package p0701;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	
	public static void main(String[] args) throws Exception{
		
			// 1byte씩 저장
			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n";
			str += "S0002,유관순,50,50,50,150,50.0,0\r\n";
			
			byte[] bytes = str.getBytes(); // 문자열을 1byte씩 나눠 배열에 저장
			
			for(byte b : bytes) { // 단순 for문
					fos.write(b);					
			}
		//try-catch
//		try {
//			// 1byte씩 저장
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S0001, 홍길동, 100, 100, 100, 300, 100.0, 0\r\n";
//			str += "S0002, 유관순, 50, 50, 50, 150, 50.0, 0\r\n";
//			
//			byte[] bytes = str.getBytes(); // 문자열을 1byte씩 나눠 배열에 저장
//			
//			for(byte b : bytes) { // 단순 for문
//				fos.write(b);					
//			}	
////			for(int i=0; i<bytes.length; i++) {
////					fos.write(bytes[i]);
////			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
//		String str = "c:/save1";
//		File folder = new File(str);
//		File file = new File(str + "/15.txt");
//		
//		try {
//			// mkdir() : 상위폴더 경로가 없으면 에러, mkdirs() : 상위폴더 경로가 없으면 생성
//			if(!(folder.exists())) { // 경로 존재(파일 또는 폴더) 확인
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs(); // 폴더 생성
//				
//			}
//			file.createNewFile();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일이 생성되었습니다.");
	}
}
