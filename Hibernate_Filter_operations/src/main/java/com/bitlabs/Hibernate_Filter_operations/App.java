package com.bitlabs.Hibernate_Filter_operations;

import java.util.Scanner;

import com.bitlabs.Daolayer.StudentDao;
import com.bitlabs.Daolayer.Student_Interface;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int option = 0;
		Scanner s = new Scanner(System.in);
		Student_Interface sif = new StudentDao();
		do {
			System.out.println("Enter 1 for inserting student information");
			System.out.println("Enter 2 for selecting student by marks in Descending order");
			System.out.println("Enter 3 for selecting student by marks in Ascending order");
			System.out.println("Enter 4 for selecting student by rating in Descending order");
			System.out.println("Enter 5 for selecting student by marks by range");
			System.out.println("Enter 6 for count of Students based on city");
			System.out.println("Enter 7 for Updating student name");
			System.out.println("Enter 8 for searching Students based on id");
			System.out.println("Enter 9 for deleting info of Students based on id");
			System.out.println("Enter 10 for getting all info related to Students");
			System.out.println("Enter 0 for Exit");
			option = s.nextInt();
			switch (option) {
			case 1:
				sif.insert();
				break;
			case 2:
				sif.descend();
				break;
			case 3:
				sif.ascend();
				break;
			case 4:
				sif.displayByRating();
				;
				break;
			case 5:
				sif.range();
				break;
			case 6:
				sif.count();
				break;
			case 7:
				sif.updateById(1);;
				break;
			case 8:
				sif.searchById(1);
				break;
			case 9:
				sif.deleteById(10);;
				break;
			case 10:
				sif.getAllData();
				break;
			}
		} while (option != 0);

		System.out.println("Thank you");
	}
}
