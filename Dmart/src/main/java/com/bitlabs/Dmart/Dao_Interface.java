package com.bitlabs.Dmart;

public interface Dao_Interface {
	
	public void insert(Product_Info p);
	public void viewProducts();
	public void searchProduct(int pid);
	public void updateProduct(int pid);
	public void deleteRecord(int pid);

}
