package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer("aaa", "1111", 2000, 0);
		
		//장바구니
//		Product[] p = new Product[10];
		// 구매
		Product t = new Tv(); // 부모의 참조변수로 자손의 객체를 다룸 : 다형성
		Product t2 = new Tv();
		System.out.println(t.pName);
		
		b.buy(t);
		b.buy(t2);
		
		Product c = new Computer();
		b.buy(c);
		
		Product a  = new Audio();
		b.buy(a);
		
		Product r = new Refrigerator();
		b.buy(r);
		b.buy(new Refrigerator());

		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Refrigerator());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		//b.list로 배열을 불러옴
		b.summary();
//		for(Product item : b.cart) {
//			if(item == null) {
//				break;
//			}
//			System.out.printf("%s, %d\n", item.pName, item.price);
//		}
	}

}
