package study_0711;

public class Female extends Person {

	public String favColor;

	public Female(String name, int iDnum, String favColor) {
		super(name, iDnum);
		this.favColor = favColor;
	}
	
	void femaleInfo() {
		super.sayHello();
	}
	
	void favorite() {
		System.out.println("제가 좋아하는 컬러는 " + favColor + "색 입니다.");
	}
	
}
