package javacollectionsandstreams.regexandjunit.junit.passwordvalidator;
public class PasswordValidator {
    public boolean validate(String p) {
        return p.matches("(?=.*[A-Z])(?=.*\\d).{8,}");
    }
}
