package study_0621;

import java.util.Calendar;

//1.Person 이라는 클래스를 정의해봅시다.
//①이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//②인사하는 메소드를 정의해봅시다. - “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
//2.Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//①각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//②각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//③Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//④Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
//3.main()메소드를 정의해봅시다.
//①Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//②생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.

public class Person {
	String name;
	int frontSsn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getfrontSsn() {
		return frontSsn;
	}
	public void setfrontSsn(int frontSsn) {
		this.frontSsn = frontSsn;
	}
	
	
	public Person (String name, int frontSsn) {
		this.name = name;
		this.frontSsn = frontSsn;
	}
	
	public void sayHi() {
		int age = Calendar.getInstance().get(Calendar.YEAR) - frontSsn;
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + this.name + "입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");

	}

	public static void main(String[] args) {
	
		Male m = new Male("짱구", 2015, "BUCHEON", "BLUE");
		Female f = new Female("지원", 1994, "DOG", "GAME");
		
		m.maleInfo();
		m.living();
		m.favColor();
		System.out.println("================================");
		f.femaleInfo();
		f.animal();
		f.hobby();
		
}
	}
