package p0628;

public class Card {
	
//	enum Kind {SPADE, DIAMOND, HEART, CLOVER};

	private int number;
	private String kind;
	
	Card(){
		
	}
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	public int get_number() {
		return number;
	}
	public String get_kind() {
		return kind;
	}
	
	public void set_number(int number) {
		this.number = number;
	}
	public void set_number(String kind) {
		this.kind = kind;
	}
	
	@Override //@Override<-- annotation
	public String toString() {
		
		return String.format("number : %d, shape : %s", number, kind);
	}

}
