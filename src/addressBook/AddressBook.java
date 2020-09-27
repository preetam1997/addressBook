package addressBook;

import java.util.LinkedList;
import java.util.Scanner;


public class AddressBook {
	private LinkedList<Contacts>  contactList;
	Scanner myObj = new Scanner(System.in);
	
	public AddressBook() {
		
		contactList = new LinkedList<>();
		
	}
	
	public void addAdress() {
		
		System.out.println("Enter First Name");
		String firstName = myObj.nextLine();
		System.out.println("Enter Last Name");
		String lastName = myObj.nextLine();
		System.out.println("Enter Address");
		String Address = myObj.nextLine();
		System.out.println("Enter City");
		String City = myObj.nextLine(); 
		System.out.println("Enter State");
		String State = myObj.nextLine();
		System.out.println("Enter zip Code");
		String zip = myObj.nextLine();
		System.out.println("Enter Phone Number");
		String phoneNumber = myObj.nextLine();
		System.out.println("Enter Email Address");
		String email = myObj.nextLine();
		
		Contacts contacts = new Contacts(firstName,lastName,Address,City,State,zip,phoneNumber,email);
		contactList.add(contacts);
		
		
	}
	
	public void delete() {
		
		System.out.println("Enter First Name");
		String firstName = myObj.nextLine();
		System.out.println("Enter Last Name");
		String lastName = myObj.nextLine();
		
		
		for(int i=0;i<contactList.size();i++) {
			
			if((contactList.get(i).firstName.equals(firstName) ) && (contactList.get(i).lastName.equals(lastName) )) {
				
				contactList.remove(i);				
				System.out.println("Contact Deleted");
			}
		}
		
		
		
	}
	
	
	public void displayAllContacts() {
		
		for(int i = 0;i<contactList.size();i++) {
			
			Contacts e = contactList.get(i);
			
			System.out.println(e.firstName);
			System.out.println(e.lastName);
			System.out.println(e.Address);
			System.out.println(e.City);
			System.out.println(e.State);
			System.out.println(e.zip);
			System.out.println(e.phoneNumber);
			System.out.println(e.email);
			
			
		}
		
	}
	
	public void editUsingName() {
		
		System.out.println("Enter First Name");
		String firstName = myObj.nextLine();
		System.out.println("Enter Last Name");
		String lastName = myObj.nextLine();
		
		
		for(int i=0;i<contactList.size();i++) {
			
			if((contactList.get(i).firstName.equals(firstName) ) && (contactList.get(i).lastName.equals(lastName) )) {
				
				System.out.println("Enter New First Name");
				contactList.get(i).firstName = myObj.nextLine();
				System.out.println("Enter New Last Name");
				contactList.get(i).lastName = myObj.nextLine();
				System.out.println("Enter New Address");
				contactList.get(i).Address = myObj.nextLine();
				System.out.println("Enter New City");
				contactList.get(i).City = myObj.nextLine(); 
				System.out.println("Enter New State");
				contactList.get(i).State = myObj.nextLine();
				System.out.println("Enter New zip Code");
				contactList.get(i).zip = myObj.nextLine();
				System.out.println("Enter New Phone Number");
				contactList.get(i).phoneNumber = myObj.nextLine();
				System.out.println("Enter New Email Address");
				contactList.get(i).email = myObj.nextLine();
				
			}
			else
				System.out.println("Entry Not Found");
			
		}
		
		
		
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to AddressBook Assignment");
		
		AddressBook address = new AddressBook();
		address.addAdress();
		System.out.println("============================================");
		address.displayAllContacts();
		System.out.println("============================================");
		address.editUsingName();
		System.out.println("============================================");
		address.displayAllContacts();
		System.out.println("============================================");
		address.delete();
		
		
		
	}
	
	
	
}
