package com.bitlabs.SeleniumAutoWire;

public class Heart {
	private String name;
	private String hearts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHearts() {
		return hearts;
	}

	public void setHearts(String hearts) {
		this.hearts = hearts;
	}

	public void pumping() {
		System.out.println("Your heart is pumping");
	}

}
