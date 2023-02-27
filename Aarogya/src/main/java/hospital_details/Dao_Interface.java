package hospital_details;

public interface Dao_Interface {
	
	public void inserting_Patient_Details(Patient_Details p);
	public void listing_Patient_Details();
	public void printing_Based_On_Id(int id);
	public void printing_Based_On_City(String city);
	public void printing_Based_On_Age(int age1,int age2);
	public void update_Recovery_Status(int id);
	public void delete_Patient_Details(int id);

}
