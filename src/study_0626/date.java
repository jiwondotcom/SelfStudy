package study_0626;

import java.text.SimpleDateFormat;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String currentDate = new SimpleDateFormat("YYYY-MM-dd").format(new java.util.Date());
		System.out.println(currentDate);
	}

}
