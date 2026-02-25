package reflection.intermediate;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Shiva Kumar")
class Book {}

public class RetrieveAnnotation {
    public static void main(String[] args) {

        if (Book.class.isAnnotationPresent(Author.class)) {
            Author author = Book.class.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}