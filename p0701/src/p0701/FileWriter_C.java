package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriter_C {

	public static void main(String[] args) {
		
		String str = "S0003,이순신,90,90,90,270,90.0,0\r\n";
		str += "S0004,김구,80,80,80,240,80.0,0\r\n";
		str += "S0005,강감찬,60,60,60,180,60.0,0\r\n";
		
		try {
			FileWriter fw = new FileWriter("c:/save/abc.txt", true); // 2번재 인자 boolean append : true -> 이어쓰기
			BufferedWriter bw = new BufferedWriter(fw); // 한번에 저장
			
			bw.write(str);
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일에 내용을 저장했습니다.");
		
	}

}
