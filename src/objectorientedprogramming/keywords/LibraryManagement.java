package objectorientedprogramming.keywords;

class Book{
    private static String libraryName = "Anna Centenary Library";

    private String title,author;
    private final int isbn;

    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }

    public void  displayDetails(){
        if(this instanceof Book) {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }else{
            System.out.println("Invalid Book object");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args){
        Book.displayLibraryName();

        Book b1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 12345);
        Book b2 = new Book("The Guide", "R.K. Narayan", 67890);

        b1.displayDetails();
        System.out.println("-------------------");
        b2.displayDetails();

    }
}
