package objectorientedprogramming.encapsulation;

abstract class LibraryItem {
    protected int id;
    protected String title;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem {
    public Book(int id, String title) {
        super(id, title);
    }

    public int getLoanDuration() {
        return 14;
    }
}

class DVD extends LibraryItem {
    public DVD(int id, String title) {
        super(id, title);
    }

    public int getLoanDuration() {
        return 5;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem b = new Book(1, "Java");
        LibraryItem d = new DVD(2, "Movie");
        System.out.println("Book: " + b.getLoanDuration());
        System.out.println("DVD: " + d.getLoanDuration());
    }
}

