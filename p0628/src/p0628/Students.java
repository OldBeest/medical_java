package p0628;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students implements Comparable<Students>{
	
	public int compareTo(Students s) {
		if(this.total < s.total) {
			return 1;
		}else if(this.total > s.total) {
			return -1;
		}else {
			return 0;
		}
	}

	static int count = 0;
	
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.stuNo = "S" + sdf.format(d) + String.format("%03d", ++count); 
	}
	
	Students(){	
	}
	
	Students(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}
	
	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	String stuNo;
	String name;
	int kor, eng, math, total, rank;
	double avg;
	
	String get_stuNo() {
		return stuNo;
	}
	
	void set_stuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %d, %.2f", stuNo, name, total, avg);
	}
}
