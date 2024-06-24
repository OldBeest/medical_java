package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	
	// 기본 생성자(Constructor) : 생성자가 하나도 없는 경우 자동으로 만들어줌.
	Stu_score(){
		
		//initialization block
		{
			count ++;
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");
			this.stuNo = "S" + sdf + String.format("%03d", count);
		}
		
	}
	// 매개변수 생성자
	Stu_score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total / 3.0;
	}
	
	static int count = 0;
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
