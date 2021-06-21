package study_0621;

class Male extends Person {
	
	String local;
	String favColor;
	
	public Male (String name,
				int frontSsn,
				String local,
				String favColor) {
		super(name, frontSsn);
		this.local = local;
		this.favColor = favColor;
	}
	
	void maleInfo() {
		super.sayHi();
	}
	
	void living() {
		System.out.println("제가 사는 지역은 " + this.local + "입니다.");
	}
	
	void favColor() {
		System.out.println("제가 좋아하는 컬러는 " + this.favColor + "입니다.");
	}
	
}

