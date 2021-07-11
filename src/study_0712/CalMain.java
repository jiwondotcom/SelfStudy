package study_0712;


public class CalMain {
	public static void main(String[] args) {

Calculator c = new CalAbstract();
		
		System.out.println(c.add(33, 8));
		System.out.println(c.substract(46, 52));
		System.out.println(c.multiply(49, 53));
		System.out.println(c.divide(45, 4));
		
	}

}
