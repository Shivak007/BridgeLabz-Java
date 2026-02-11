package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
}

class BookRecommendation {
    String title;
    double rating;

    BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class BookRecommendationSystem {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Herbert", "Science Fiction", 4.8),
                new Book("Foundation", "Asimov", "Science Fiction", 4.5),
                new Book("Neuromancer", "Gibson", "Science Fiction", 4.2),
                new Book("Random Book", "Author", "Drama", 3.5)
        );

        List<BookRecommendation> page1 =
                books.stream()
                        .filter(b -> b.genre.equals("Science Fiction") && b.rating > 4.0)
                        .map(b -> new BookRecommendation(b.title, b.rating))
                        .sorted(Comparator.comparingDouble((BookRecommendation b) -> b.rating).reversed())
                        .limit(5)
                        .collect(Collectors.toList());

        page1.forEach(b ->
                System.out.println(b.title + " Rating: " + b.rating));
    }
}

