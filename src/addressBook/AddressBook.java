package addressBook;

public class AddressBook {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to AddressBook Assignment");
		Contacts contacts = new Contacts("Kakarot", "kumar", "Earth", "Bhagalpur", "Bihar", "813214", "123123", "sasd@sadasd.,asd");
		System.out.println(contacts.firstName);
		System.out.println(contacts.lastName);
		System.out.println(contacts.Address);
		System.out.println(contacts.City);
		System.out.println(contacts.State);
		System.out.println(contacts.zip);
		System.out.println(contacts.phoneNumber);
		System.out.println(contacts.email);
	}
}
