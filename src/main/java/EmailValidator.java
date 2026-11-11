
public class EmailValidator {

    public boolean validateEmail(String email) {
        return email != null &&
                email.matches("^[A-Za-z0-9._+-]+@[A-Za-z0-9]+(\\.[A-Za-z]{2,})+$");
    }

    public static void main(String[] args) {

        EmailValidator validator = new EmailValidator();

        String email = "abc.xyz@bl.co.in";

        if (validator.validateEmail(email)) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
    }
}
