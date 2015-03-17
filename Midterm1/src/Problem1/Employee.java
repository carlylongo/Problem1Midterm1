package Problem1;

import java.util.Date;
import java.util.ArrayList;

public class Employee extends Person{
	protected String office;
	protected float salary;
	protected MyDate dateHired;
	@Override
	public String toString() {
		return (this.getClass().getName() + " " + name);
	}

}
class MyDate {
	private int year;
	private int month;
	private int day;
	@Override
	public String toString() {
		return (this.getClass().getName());
	}

}


class Faculty extends Employee{
	private ArrayList<Date> officeHours;
	private int rank;
	@Override
	public String toString() {
		return (this.getClass().getName() + " " + name);
	}

}

class Staff extends Employee{
	private String title;
	@Override
	public String toString() {
		return (this.getClass().getName() + " " + name);
	}
}

