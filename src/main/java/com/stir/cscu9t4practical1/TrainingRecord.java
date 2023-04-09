// An implementation of a Training Record as an ArrayList updated by shermina at 12.22pm
package com.stir.cscu9t4practical1;

import java.util.*;

public class TrainingRecord {
	private List<Entry> tr;

	public TrainingRecord() {
		tr = new ArrayList<Entry>();
	} // constructor

	// add a record to the list
	public void addEntry(Entry e) {
		tr.add(e);
	} // addClass

	// look up the entry of a given day and month
	public String lookupEntry(int d, int m, int y) {
		ListIterator<Entry> iter = tr.listIterator();
		String result = "No entries found";
		while (iter.hasNext()) {
			Entry current = iter.next();
			if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
				result = current.getEntry();
		}
		return result;
	} // lookupEntry

/// look up all the entry of a given day and month
	public String LookupAllEntries(int d, int m, int y) {
		ListIterator<Entry> iter = tr.listIterator();
		String result = "";
		while (iter.hasNext()) {
			Entry current = iter.next();
			if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
				result = result + current.getEntry();
		}
		return result;
	} // LookupAllEntry

///Remove the entry of a given day, month and name
	public String deleteEntry(String n, int d, int m, int y) {
		ListIterator<Entry> iter = tr.listIterator();
		String result = "";
		while (iter.hasNext()) {
			Entry current = iter.next();
			if (n.equals(current.getName()) && current.getDay() == d && current.getMonth() == m && current.getYear() == y);
			{ tr.remove(current);
			result = "Record removed";
			}
			
		}
		return result;
		
		  }// deleteEntry

	public int getNumberOfEntries() {
		return tr.size();
	}

	// Clear all entries
	public void clearAllEntries() {
		tr.clear();
	}

} // TrainingRecord