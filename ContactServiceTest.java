import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	@Test
	void testAddContact() {
		
		ContactService contactService = new ContactService();
		
		contactService.addContact("12345678", "Ash", "Williams", "5554443333", "123 Elm St Camilla GA 31567");
		
		assertTrue(contactService.contact.getContactId().equals("12345678"));
		assertTrue(contactService.contact.getFirstName().equals("Ash"));
		assertTrue(contactService.contact.getLastName().equals("Williams"));
		assertTrue(contactService.contact.getPhone().equals("5554443333"));
		assertTrue(contactService.contact.getAddress().equals("123 Elm St Camilla GA 31567"));
		
	}
	
	@Test
	void testContactAdd() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		
			ContactService contactService = new ContactService();
		
			contactService.addContact(null, "Ash", "Williams", "5554443333", "123 Elm St Camilla GA 31567");
			
		});
		
	}
	
	@Test
	void testContactUpdate() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		
			ContactService contactService = new ContactService();
				
			contactService.addContact("12345678", "Ash", "Williams", "5554443333", "123 Elm St Camilla GA 31567");
		
			contactService.updateContact("12345678", "Alex", "Smith", "5553334444", "123 Oak St Edison GA 31566");
			
		});
			
	}
	
	@Test
	void testContactDelete() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		
			ContactService contactService = new ContactService();
			
			contactService.addContact("12345678", "Ash", "Williams", "5554443333", "123 Elm St Camilla GA 31567");
			
			contactService.deleteContact("1234567");
			
		});
						
	}

}
