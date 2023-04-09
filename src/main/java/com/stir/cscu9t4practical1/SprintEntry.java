package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SprintEntry extends Entry {

	private int repetitions;

	private int recovery;

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rept, int rec) {

		super(n, d, m, y, h, min, s, dist);
		this.repetitions = rept;
		this.recovery = rec;


	}// constructor for SprintEntry.

	public int getRepetitions() {

		return repetitions;
	} // getRepetitions

	public void setRepetitions(int rept) {

		this.repetitions = rept;
	}// setRepetitions

	public int getRecovery() {

		return recovery;
	}// getRecovery

	public void setRecovery(int rec) {

		this.recovery = rec;
	}// setRecovery

	public String getEntry() {
		String result = getName() + " ran " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec()
				+ " on " + getDay() + "/" + getMonth() + "/" + getYear() + "repetitions:"+  getRepetitions() + "recovery of speed" + getRecovery()
				+ "\n";   
		return result;
	}// getEntry

}