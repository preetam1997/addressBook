package addressBook;

import java.util.LinkedList;
import java.util.Scanner;


public class AddressBook {
	private LinkedList<Contacts>  contactList;
	
	public AddressBook() {
		
		contactList = new LinkedList<>();
		
	}
	
	public LinkedList<Contacts> addAdress() {
		Scanner myObj = new Scanner(System.in);
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
		myObj.close();
		Contacts contacts = new Contacts(firstName,lastName,Address,City,State,zip,phoneNumber,email);
		contactList.add(contacts);
		
		return null;
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

	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to AddressBook Assignment");
		
		AddressBook address = new AddressBook();
		address.addAdress();
		address.displayAllContacts();
		
	}
	
	
	
}
