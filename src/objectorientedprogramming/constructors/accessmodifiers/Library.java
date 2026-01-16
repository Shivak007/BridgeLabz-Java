package objectorientedprogramming.constructors.accessmodifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    private String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title +
                ", Author: " + getAuthor() + ", Format: " + format);
    }
}

public class Library {
    public static void main(String[] args) {
        EBook ebook = new EBook("654-12345", "Java Basics", "James Gosling", "PDF");
        ebook.displayDetails();
    }
}