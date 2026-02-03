package javacollectionsandstreams.exceptions.problemstatement;

class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) { super(msg); }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) { super(msg); }
}

class UserService {

    void registerUser(String username) throws UserAlreadyExistsException {
        if ("admin".equals(username))
            throw new UserAlreadyExistsException("User already exists");
        System.out.println("User registered: " + username);
    }

    void checkUserExistence(String username) throws UserNotFoundException {
        if (!"admin".equals(username))
            throw new UserNotFoundException("User not found");
        System.out.println("User exists");
    }
}

public class UserServiceApp {
    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            us.checkUserExistence("guest");
            us.registerUser("admin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
