import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("id", "firstName", "lastName", "1234567890", "address");
		assertTrue(contact.getContactId().equals("id"));
		assertTrue(contact.getFirstName().equals("firstName"));
		assertTrue(contact.getLastName().equals("lastName"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("address"));
	}
	
	@Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("idididididid", "firstName", "lastName", "1234567890", "address");
		});
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "firstName", "lastName", "1234567890", "address");
		});
	}
	
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstNamefirst", "lastName", "1234567890", "address");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", null, "lastName", "1234567890", "address");
		});
	}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", "lastNamelast", "1234567890", "address");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", null, "1234567890", "address");
		});
	}
	
	@Test
	void testContactPhoneNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", "lastName", "12345678901", "address");
		});
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", "lastName", null, "address");
		});
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", "lastName", "1234567890", "addressaddressaddressaddressaddress");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "firstName", "lastName", "1234567890", null);
		});
	}
		
}
