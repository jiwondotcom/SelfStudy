package study_0711;

import java.util.Calendar;

public class Person {
		
	String name;
	int IDnum;
	

	public Person(String name, int iDnum) {
		this.name = name;
		IDnum = iDnum;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getIDnum() {
		return IDnum;
	}
	public void setIDnum(int iDnum) {
		IDnum = iDnum;
	}


		public void sayHello() {
			int age = Calendar.getInstance().get(Calendar.YEAR) - IDnum;
			System.out.println("안녕하세요. 저는 " + name + "입니다. " + age + "세 입니다.");
		}
		
		
	public static void main (String[] args) {
		Male m = new Male ("짱구", 2015, "부천");
		Female f = new Female ("짱아", 2020, "보라");
	
		m.maleInfo();
		m.living();
		System.out.println("==============================");
		f.femaleInfo();
		f.favorite();
	
	
	}
}

