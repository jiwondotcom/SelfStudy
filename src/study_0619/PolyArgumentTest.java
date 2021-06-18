package study_0619;

class Product {
	int price;
	int bonusPoint;
	Product(int price) {
		this.price = price;
		
		bonusPoint = (int)(price / 10.0); 
		// 보너스 포인트는 제품가격의 10%
	}
}

class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);
		// Tv의 가격을 100만원으로 설정
	}
	
	public String toString() { // object 클래스의 toString()을 오버라이딩
		return "Tv";
	
	}
}

class Computer extends Product {
	Computer() {
		super(200); // Computer의 가격을 200만원으로 설정
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer { // 물건을 구매할 고객
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 포인트
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price; // 소유한 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스포인트를 추가한다.
	
		System.out.println(p + " 구매 완료");
	}
}



class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 잔액 : " + b.money + "만원");
		System.out.println("현재 보너스포인트 : " + b.bonusPoint + "점");
	}

}
