package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry {
	private String terrain;
	private String tempo;

	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String tera, String temp) {

		super(n, d, m, y, h, min, s, dist);
		this.terrain = tera;
		this.tempo = temp;
		
		

	}// constructor for CycleEntry.

	public String getTerrain() {

		return terrain;
	} // getterrain

	public void setTerrain(String tera) {

		this.terrain = tera;
	}// setterrain

	public String getTempo() {

		return tempo;
	}// gettempo

	public void setTempo(String temp) {

		this.tempo = temp;
	}// settempo

	public String getEntry() {
		String result = getName() + " ran " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec()
				+ " for" + getTerrain() + ":" + getTempo() + ":" + "on" + getDay() + "/" + getMonth() + "/" + getYear()+"with" + getTerrain()+":" +"and" +getTempo()+":"
				+ "\n";
		return result;
	}// getEntry
}