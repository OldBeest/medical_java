package p0701;

public class Card {
	
	private String password;
	private int number;
	private String kind;
		
	Card(){	
	}
	
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setNumber(int number) {
		if(number > 13 || number < 1) {
			return;
		}
		this.number = number;
	}
	
	public String getPassword(String id) {
		if(!(id.equals("admin"))) {
			return "";		
		}
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return this.kind + ", " + this.number;
	}
	
}
