package com.bitlabs.Entity;

public class Ambiguity {
	
	private int id;
	private int id1;
	
	
	public Ambiguity(int id, int id1) {
		super();
		this.id = id;
		this.id1 = id1;
		System.out.println("Int Constructor");
	}
	public Ambiguity(String id, String id1) {
		super();
		this.id = Integer.parseInt(id);
		this.id1 = Integer.parseInt(id1);
		System.out.println("String Constructor");
	}
	@Override
	public String toString() {
		return "Ambiguity [id=" + id + ", id1=" + id1 + "]";
	}
	
	public void show() {
		System.out.println("Sum  "+(id+id1));
	}
	

}
