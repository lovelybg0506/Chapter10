package part01.sec01.exam09;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {

	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {

	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10]; // 구입한 제품을 저장하기위한 배열
	int i = 0; // 전역변수 (클래스에 선언하는 이유 : buy라는 메소드안에 지역변수로 선언하게되면 그 메소드를 한번 실행하고 끝났을때 메소드가 임시적으로
				// 없어지기때문 , 그래서 i 가 누적되지않는다.)

	public void buy(Product p) {
//		int i = 0; 
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");

			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;

		System.out.println(p + "을/를 구매 했습니다.");

	}

	public void summary() {
		int sum = 0;
		String itemList = " ";
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
				sum += item[i].price;
			itemList += item[i] + ",";
		}

		System.out.println("구매하신 물품의  총 금액은 " + sum + "만원 입니다.");
		System.out.println("구매하신 제품은 " + itemList + "입니다.");

	}

}

public class PolyArgumentTest2_09 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}

}
