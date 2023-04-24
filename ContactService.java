
public class ContactService {
	
	public Contact contact;
	
	public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
		
		if (contactId == null || firstName == null || lastName == null || phone == null || address == null) {
			
			throw new IllegalArgumentException("Unable to create task.");
			
		}
		
		contact = new Contact(contactId, firstName, lastName, phone, address);
		
	}
	
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		
		if (contact.getContactId() == contactId ) {
			
			throw new IllegalArgumentException("Contact ID must remain unchanged.");
			
		}
		
		String contactIdN = contactId;
		
		
		if (contact.getFirstName() == firstName || firstName == null || firstName.length() > 10) {
			
			throw new IllegalArgumentException("First Name must be 10 characters or less and different from original.");
			
		}
		
		String firstNameN = firstName;
		
		if (contact.getLastName() == lastName || lastName == null || lastName.length() > 10) {
			
			throw new IllegalArgumentException("Last Name must be 10 characters or less and different from original.");
			
		}
		
		String lastNameN = lastName;
		
		if (contact.getPhone().matches(phone) || phone == null || phone.length() < 10 || phone.length() > 10) {
			
			throw new IllegalArgumentException("Phone Number must be 10 numbers and different from original.");
			
		}
		
		
		String phoneN = phone;
		
		if (contact.getAddress() == address || address.length() > 30) {
			
			throw new IllegalArgumentException("Address must be 30 characters or less and different from original.");
			
		}
		
		String addressN = address;
		
		contact = new Contact(contactIdN, firstNameN, lastNameN, phoneN, addressN);
		
	}
	
	public void deleteContact(String id) {
		
		if (contact.getContactId() != id) {
			
			throw new IllegalArgumentException("Contact ID must be valid.");
			
		}
		
		this.contact = null;
		
		
	}
	

}
