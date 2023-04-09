package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SwimEntry extends Entry {

	private String where;

	public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String whr) {

		super(n, d, m, y, h, min, s, dist);
		this.where = whr;
		
	} // constructor for SwimEntry.

	public String getWhere() {

		return where;
	} // getWhere

	public void setWhere(String whr) {

		this.where = whr;
	}// setWhere

	public String getEntry() {
		String result = getName() + " ran " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec()
				+ " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n" + "in" + getWhere() + ":";
		return result;
	}// getEntry

}