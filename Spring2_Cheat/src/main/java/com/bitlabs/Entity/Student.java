package com.bitlabs.Entity;

public class Student {
	
	private Cheating cheat;

	public void setCheat(Cheating cheat) {
		this.cheat = cheat;
	}
	
	public void display() {
		cheat.cheat();
	}

	
	
}
