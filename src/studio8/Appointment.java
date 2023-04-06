package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date d;
	private Time t;
	public Appointment(Date d,Time t) {
		this.d=d;
		this.t=t;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(t);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(t, other.t);
	}
	public static void main(String[] args) {
		Date d1=new Date(3,4,2009,true);
		Date d2=new Date(3,5,2009,false);
		Time t1=new Time(3,4,true);
		Time t2=new Time(1,2,false);
		Appointment a1=new Appointment(d1,t1);
		Appointment a2=new Appointment(d1,t2);
		Appointment a3=new Appointment(d2,t1);
		System.out.println(a1.equals(a3));//true
		System.out.println(a1.equals(a2));
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		calendar.add(a3);
		System.out.println(a1.getD());
	}
	public Date getD() {
		return d;
	}
	public Time getT() {
		return t;
	}
	

}
