package objectorientedprogramming.oopfundamentals.level1;

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book("Java Fundamentals", "James Gosling", 499.99);
        b1.displayDetails();
    }
}