package com.Bridgelabz;
import java.util.*;

import org.omg.CORBA.ContextList;
public class AddressBook {
	Scanner sc = new Scanner(System.in);
	ArrayList<ContactPerson> contactArrayList = new ArrayList<ContactPerson>();

	public void addContact() {

		ContactPerson contact = new ContactPerson();

		System.out.println("Enter the First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address: ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City : ");
		contact.setCity(sc.next());
		System.out.println("Enter the State : ");
		contact.setState(sc.next());
		System.out.println("Enter the Zip code : ");
		contact.setZipCode(sc.nextInt());
		System.out.println("Enter the Mobile Number : ");
		contact.setMobileNo(sc.nextInt());
		System.out.println("Enter the Email ID : ");
		contact.setEmailID(sc.next());

		ContextList.add(contact);
	}

	public void displayContact() {

		for (int i = 0; i < ContextList.size(); i++) {
			ContactPerson contact = contactArrayList.get(i);
			System.out.println(contact.toString());
		}

	}

	public void editContact() {

		System.out.println("Enter the First Name of Contact to Edit : ");
		String FirstName = (sc.next());
		boolean IsAvaible = false;

		for (ContactPerson contact : contactArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter the First Name : ");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name : ");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address : ");
				contact.setAddress(sc.next());
				System.out.println("Enter the City : ");
				contact.setCity(sc.next());
				System.out.println("Enter the State : ");
				contact.setState(sc.next());
				System.out.println("Enter the Zipcode : ");
				contact.setZipCode(sc.nextInt());
				System.out.println("Enter the Mobile Number : ");
				contact.setMobileNo(sc.nextInt());
				System.out.println("Enter the Email Id : ");
				contact.setEmailID(sc.next());
			}
		}

		if (IsAvaible == false) {
			System.out.println("CONTACT NOT AVAIBLE");
		}
	}
}