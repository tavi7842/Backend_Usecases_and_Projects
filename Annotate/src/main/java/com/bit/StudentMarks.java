package com.bit;

import javax.persistence.Embeddable;

@Embeddable
public class StudentMarks {
	private int marks;
	private int percentage;
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	

}
