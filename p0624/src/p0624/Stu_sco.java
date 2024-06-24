package p0624;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Stu_sco {
	
	static int count = 0; //학생 성적정보가 입력된 횟수
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	Stu_sco(){
		
	}
	
	Stu_sco(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total / 3.0;
	}
	
	//initialization block
	{
		count ++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S" + sdf.format(d) + String.format("%03d", count);
	}
	
}
