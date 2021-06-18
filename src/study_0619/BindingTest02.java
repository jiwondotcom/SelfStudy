package study_0619;

class BindingTest02 {

	public static void main(String[] args) {

		Parent02 p2 = new Child02();
		Child02 c2 = new Child02();
		
		System.out.println("p.x = " + p2.x);
		p2.method();
		
		System.out.println("c.x = " + c2.x);
		c2.method();
		
		
	}

}


class Parent02 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child02 extends Parent02 {}