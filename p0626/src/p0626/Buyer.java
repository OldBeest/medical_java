package p0626;

import java.util.ArrayList;

public class Buyer {
	
	String userId;
	String userPw;
	int money;
	int bonusPoint;
	Product[] cart = new Product[10];
	ArrayList list = new ArrayList(); // 객체배열 선언
//	int count = 0;
	
	Buyer(){
		
	}
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	// 구매 메소드 - 부모의 참조변수
	void buy(Product p) {
		if(money < p.price) {
			System.out.printf("잔액이 부족합니다.(보유 금액 : %d)\n", money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // collection 객체배열 추가 - add();
//		cart[count++] = p;
		System.out.printf("%s 제품을 구매했습니다.(보유 금액 : %d)\n", p.pName, money);
	}
		
	void summary() {
		System.out.println("[ 구매내역 ]");
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			Product p = (Product)list.get(i); // down-casting : object -> product
			System.out.printf("%s, %d\n", p.pName, p.price);
			sum += p.price;
		}
		System.out.println("총 구매 개수 : " + list.size());
		System.out.println("총 구매 금액 : " + sum);
	}
//	}
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
}
