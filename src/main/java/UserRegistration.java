
public class UserRegistration {

    // UC1: Validate first name
    public boolean validateFirstName(String firstName) {
        return firstName != null &&
                firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // UC2: Validate last name
    public boolean validateLastName(String lastName) {
        return lastName != null &&
                lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // UC3: Validate email
    public boolean validateEmail(String email) {
        return email != null &&
                email.matches("^[A-Za-z0-9._+-]+@[A-Za-z0-9]+(\\.[A-Za-z]{2,})+$");
    }


    // UC4: Validate mobile number
    public boolean validateMobile(String mobile) {
        return mobile != null &&
                mobile.matches("^[0-9]{1,3} [0-9]{10}$");
    }

    // UC5–UC8: Validate password
    public boolean validatePassword(String password) {
        return password != null &&
                password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
    }

    // UC9: Validate all user details
    public boolean validateUser(String firstName, String lastName,
                                String email, String mobile, String password) {
        return validateFirstName(firstName)
                && validateLastName(lastName)
                && validateEmail(email)
                && validateMobile(mobile)
                && validatePassword(password);
    }

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        String firstName = "Deepanwitha";
        String lastName = "Chennamsetti";
        String email = "your_email@gmail.com";
        String mobile = "91 XXXXXXXXXX";
        String password = "Deepan@123";

        if (user.validateUser(firstName, lastName, email, mobile, password)) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed!");
        }
    }
}
