package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	
	static int count = 0;
	
	
	Students(){
		
	}
	
	Students(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}
	
	//초기화 블럭
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S" + sdf.format(d) + String.format("%03d", ++count);
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// getter
	String getStuNo() {
		return stuNo;
	}
	// setter
	void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
}
