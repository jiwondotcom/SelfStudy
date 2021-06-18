package study_0618;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time (int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour < 0) {
			return;
		} if (hour > 23) {
			hour %= 24; // a = a % b
		} 
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if (minute < 0) {
			return;
		} if (minute > 59) {
			for (int i = minute; i > 60; i -= 60) {
				setHour(this.hour+1);
				minute -= 60;
	} 
		}
			this.minute = minute;
	}
		
	

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (second < 0) {
			return;
		} if (second > 59) {
			for (int i = second; i > 60; i -= 60) {
				setMinute(this.minute + 1);
				second -= 60;
		} 
	}
			this.second = second;
		}
		
	
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}

	

