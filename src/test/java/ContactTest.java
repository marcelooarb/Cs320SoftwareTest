import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreatedSuccessfully() {
        Contact contact = new Contact("12345", "Marcelo", "Barbosa", "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("Marcelo", contact.getFirstName());
        assertEquals("Barbosa", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Marcelo", "Barbosa", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testContactIdCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Marcelo", "Barbosa", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Barbosa", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "MarceloLong", "Barbosa", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", null, "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "BarbosaLong", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testPhoneCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "Barbosa", null, "123 Main Street");
        });
    }

    @Test
    public void testPhoneMustBeExactlyTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "Barbosa", "12345", "123 Main Street");
        });
    }

    @Test
    public void testPhoneMustOnlyContainDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "Barbosa", "12345abcde", "123 Main Street");
        });
    }

    @Test
    public void testAddressCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "Barbosa", "1234567890", null);
        });
    }

    @Test
    public void testAddressCannotBeLongerThanThirtyCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marcelo", "Barbosa", "1234567890",
                    "This address is longer than thirty characters");
        });
    }
}