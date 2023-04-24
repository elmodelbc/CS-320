
public class Contact {
	
	private String contact_Id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contact_Id, String firstName, String lastName, String phone, String address) {
		
		setContactId(contact_Id);
		
		setFirstName(firstName);
		
		setLastName(lastName);
		
		setPhone(phone);
		
		setAddress(address);
		
	}
	
	public String getContactId() { return this.contact_Id; }
	
	public String getFirstName() { return this.firstName; }
	
	public String getLastName() {return this.lastName; }
	
	public String getPhone() { return this.phone; }
	
	public String getAddress() { return this.address; }
	
	public void delContactId() { this.contact_Id = null; }
	
	public void delFirstName() { this.firstName = null; }
	
	public void delLastName() { this.lastName = null; }
	
	public void delPhone() { this.phone = null; }
	
	public void delAddress() { this.address = null; }
	
	public void setContactId(String string) {
		
		if (string == null || string.length() > 10) {
			
			throw new IllegalArgumentException("Contact ID must be 10 numbers or less and unique.");
			
		}
		
		 this.contact_Id = string;
	}
	
	public void setFirstName(String string) {
		
		if (string == null || string.length() > 10) {
			
			throw new IllegalArgumentException("First Name must be 10 characters or less.");
			
		}

		this.firstName = string;
	}
	
	public void setLastName(String string) {
		
		if (string == null || string.length() > 10) {
			
			throw new IllegalArgumentException("Last Name must be 10 characters or less.");
			
		}
		
		this.lastName = string;
	}
	
	public void setPhone(String string) {
		
		if (string == null || string.length() < 10 || string.length() > 10) {
			
			throw new IllegalArgumentException("Phone Number must be 10 numbers.");
			
		}

		this.phone = string;
	}
	
	public void setAddress(String string) {
		
		if (string == null || string.length() > 30) {
			
			throw new IllegalArgumentException("Address must be 30 characters or less.");
			
		}

		this.address = string;
	}

}
