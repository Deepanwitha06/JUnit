
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    // UC1: Valid first name
    @Test
    public void testValidFirstName() {
        assertTrue(user.validateFirstName("Navya"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(user.validateFirstName("na"));
    }

    // UC2: Valid last name
    @Test
    public void testValidLastName() {
        assertTrue(user.validateLastName("Raj"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(user.validateLastName("ra"));
    }

    // UC3: Valid email
    @Test
    public void testValidEmail() {
        assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(user.validateEmail("abc.xyz.com"));
    }

    // UC4: Valid mobile number
    @Test
    public void testValidMobile() {
        assertTrue(user.validateMobile("91 9919819801"));
    }

    @Test
    public void testInvalidMobile() {
        assertFalse(user.validateMobile("9919819801"));
    }

    // UC5–UC8: Valid password
    @Test
    public void testValidPassword() {
        assertTrue(user.validatePassword("Navya@123"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(user.validatePassword("navya123"));
    }

    // UC9: Validate complete user details
    @Test
    public void testValidUser() {
        assertTrue(user.validateUser(
                "Deepanwitha",
                "Chennamsetti",
                "deepanwitha@example.com",
                "91 9876543210",
                "Demo@123"
        ));
    }

    @Test
    public void testInvalidUser() {
        assertFalse(user.validateUser(
                "deep",
                "Chennamsetti",
                "invalidemail",
                "9876543210",
                "demo123"
        ));
    }
}
