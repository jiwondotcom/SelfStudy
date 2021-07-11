package study_0711;

public class Male extends Person{
	
	public String local;

	public Male(String name, int iDnum, String local) {
		super(name, iDnum);
		this.local = local;
	}

	void maleInfo() {
		super.sayHello();
	}

	void living() {
		System.out.println("제가 사는 지역은 " + local + "입니다.");
	}
	
}
