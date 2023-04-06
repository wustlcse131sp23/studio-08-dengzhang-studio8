package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean twentyFour;
	/**
	 * constructor
	 * @param h
	 * @param m
	 * @param t
	 */
	public Time(int h,int m,boolean t) {
		this.hour=h;
		this.minute=m;
		this.twentyFour=t;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public boolean isTwentyFour() {
		return twentyFour;
	}
	public void setTwentyFour(boolean twentyFour) {
		this.twentyFour = twentyFour;
	}
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", twentyFour=" + twentyFour + "]";
	}
	public static void main(String[] args) {
		Time t1=new Time(3,4,true);
		Time t2=new Time(1,2,false);
		System.out.println(t1.hour);
    	
    }
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, twentyFour);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && twentyFour == other.twentyFour;
	}

}