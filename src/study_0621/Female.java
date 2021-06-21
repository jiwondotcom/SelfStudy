package study_0621;

class Female extends Person {
	
	String animal;
	String hobby;
	
	public Female (String name,
				int frontSsn,
				String animal,
				String hobby) {
		super(name, frontSsn);
		this.animal = animal;
		this.hobby = hobby;
	}
	
	void femaleInfo() {
		super.sayHi();
	}
	
	void animal() {
		System.out.println("제가 좋아하는 동물은 " + this.animal + "입니다.");
	}
	
	void hobby() {
		System.out.println("저의 취미는 " + this.hobby + "입니다.");
	}
	
}

