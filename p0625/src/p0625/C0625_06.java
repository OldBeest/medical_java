package p0625;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0625_06 {

	public static void main(String[] args) {
		
//	Singleton s = new Singleton();
	Singleton s = Singleton.getInstance(); // 하나의 객체만 사용 가능, 공통된 정보를 사용할 때.
	
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(sdf.format(d));
	
//	Calendar = new Calandar(); // Singleton 구조이기 때문에 getInstance를 활용한다
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(sdf.format(cal.getTime()));
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int date = cal.get(Calendar.DATE);
	
	System.out.printf("%d-%d-%d", year, month, date);
	
 	}

}
