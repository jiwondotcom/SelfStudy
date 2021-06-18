package study_0618;

class TimeTest {
	
	public static void main(String[] args) {
	
		Time t = new Time(13,20,30);
		System.out.println(t);
		
		t.setHour(t.getHour() + 1);
		System.out.println(t);

	}
}	
