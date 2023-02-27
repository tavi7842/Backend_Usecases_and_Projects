package hospital_details;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {

		Dao_Interface da = new DaoImpl();
		// Patient_Details p = new Patient_Details();
		Patient_Details p[] = new Patient_Details[3];
		Scanner s = new Scanner(System.in);

		char ch = 0;

		try {
			FileReader fr = new FileReader("Book1.csv");
			BufferedReader br = new BufferedReader(fr);
			do {
				System.out.println("\n 1.Inserting Patient Info" + "\n 2.List all Patients Info"
						+ "\n 3.Search based on ID" + "\n 4.Search based on City" + "\n 5.Search based on Age"
						+ "\n 6.Update Recovery Status" + "\n 7.Delete the Patient Record");
				System.out.println("Choose correct Option");
				int i = s.nextInt();
				switch (i) {
				case 1:
					String str;
					while ((str = br.readLine()) != null) {
						int k = 0;
						p[k] = new Patient_Details();
						String arr[] = str.split(",");
						p[k].setName(arr[0]);
						if (arr[1].length() <= 2) {
							p[k].setAge(Integer.parseInt(arr[1]));
						} else {
							System.out.println("Invalid Age");
							break;
						}
						p[k].setGender(arr[2]);

						if (arr[3].length() == 12) {
							p[k].setAd_num(Long.parseLong(arr[3]));
						} else {
							System.out.println("invalid addhar card number");
							break;
						}
						if (arr[4].length() == 10) {
							p[k].setC_num(Long.parseLong(arr[4]));
						} else {
							System.out.println("contact number invalid");
							break;
						}
						p[k].setCity(arr[5]);
						p[k].setAddress(arr[6]);
						p[k].setD_o_a(arr[7]);
						p[k].setG_name(arr[8]);
						p[k].setG_address(arr[9]);
						p[k].setGc_num(Long.parseLong(arr[10]));
						p[k].setRecovered(arr[11]);
						da.inserting_Patient_Details(p[k]);
						break;
					}
				case 2:
					da.listing_Patient_Details();
					break;
				case 3:
					System.out.println("Enter the id of patient");
					int pid = s.nextInt();
					da.printing_Based_On_Id(pid);
					break;
				case 4:
					System.out.println("Enter the city of patient");
					String pcity = s.next();
					da.printing_Based_On_City(pcity);
					break;
				case 5:
					System.out.println("Enter the Start age of patient");
					int age1 = s.nextInt();
					System.out.println("Enter the end age of patient");
					int age2 = s.nextInt();
					da.printing_Based_On_Age(age1, age2);
					break;
				case 6:
					System.out.println("Enter the id of patient to be updated");
					int pid1 = s.nextInt();
					da.update_Recovery_Status(pid1);
					break;
				case 7:
					System.out.println("Enter the id of patient to be deleted");
					int pid2 = s.nextInt();
					da.delete_Patient_Details(pid2);
					break;
				}
				System.out.println("Do wish to continue to menu(y/n)?");
				ch = s.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
			System.out.println("Thank you");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
