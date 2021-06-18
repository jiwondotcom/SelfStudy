package study_0619;

class BindingTest03 {
	public static void main(String[] args) {

		Parent03 p3 = new Child03();
		Child03 c3 = new Child03();
		
		System.out.println("p.x = " + p3.x);
		p3.method();
	
		
		System.out.println("c.x = " + c3.x);
		c3.method();
	
	}

}


class Parent03 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child03 extends Parent03 {
	int x = 200;
	void method() {
		System.out.println("x = " + x); 
		// this.x 와 같다.
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}



