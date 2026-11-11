
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    EmailValidator validator = new EmailValidator();

    @Test
    public void testValidEmail() {
        assertTrue(validator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testAnotherValidEmail() {
        assertTrue(validator.validateEmail("deepanwitha@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(validator.validateEmail("abc.xyz.com"));
    }

    @Test
    public void testEmailWithoutUsername() {
        assertFalse(validator.validateEmail("@gmail.com"));
    }

    @Test
    public void testEmailWithoutDomain() {
        assertFalse(validator.validateEmail("abc@gmail"));
    }

    @Test
    public void testNullEmail() {
        assertFalse(validator.validateEmail(null));
    }
}
