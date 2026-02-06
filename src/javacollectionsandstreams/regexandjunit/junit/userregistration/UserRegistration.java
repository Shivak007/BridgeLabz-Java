package javacollectionsandstreams.regexandjunit.junit.userregistration;

public class UserRegistration {
    public void registerUser(String u, String e, String p) {
        if (u.isEmpty() || !e.contains("@") || p.length() < 8)
            throw new IllegalArgumentException();
    }
}
