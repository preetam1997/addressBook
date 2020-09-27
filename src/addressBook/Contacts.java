package addressBook;

public class Contacts {
	public String firstName;
	public String lastName;
	public String Address;
	public String City;
	public String State;
	public String zip;
	public String phoneNumber;
	public String email;
	
	public Contacts(String firstName,String lastName,String Address,String City, String State,String zip,String phoneNumber,String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.Address = Address;
		this.City = City;
		this.State = State;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
}
