import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContactSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    public void testCannotAddDuplicateContactId() {
        ContactService service = new ContactService();
        Contact contact1 = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");
        Contact contact2 = new Contact("12345", "John", "Smith", "0987654321", "456 Oak Street");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    public void testDeleteContactSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.deleteContact("12345");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("12345");
        });
    }

    @Test
    public void testDeleteContactThatDoesNotExist() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("99999");
        });
    }

    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateFirstName("12345", "Carlos");

        assertEquals("Carlos", service.getContact("12345").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateLastName("12345", "Silva");

        assertEquals("Silva", service.getContact("12345").getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updatePhone("12345", "0987654321");

        assertEquals("0987654321", service.getContact("12345").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateAddress("12345", "456 Oak Street");

        assertEquals("456 Oak Street", service.getContact("12345").getAddress());
    }

    @Test
    public void testUpdateContactThatDoesNotExist() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("99999", "Carlos");
        });
    }
}