package p0625;

class Time {
	private int hour;
	private int minute;
	private int second;
	private int day;
	
	//getter
	public int getHour() {
		return hour;
	}
	//setter
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("잘못된 데이터를 입력하였습니다.");
			return;
		}
		this.hour = hour;
	}
}
