package studio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	/**
	 * constructor
	 * @param m
	 * @param d
	 * @param y
	 * @param h
	 */
	public Date(int m,int d,int y,boolean h) {
		this.month=m;
		this.day=d;
		this.year=y;
		this.holiday=h;
	}
	
    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}

	public static void main(String[] args) {
		Date d1=new Date(3,4,2009,true);
		Date d2=new Date(3,5,2009,false);
		Date d3=new Date(1,2,1999,true);
		Date d4=new Date(2,25,1888,true);
		Date d5=new Date(5,22,1777,false);
		
		System.out.println(d1.holiday);
		System.out.println(d2.day);
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

}
