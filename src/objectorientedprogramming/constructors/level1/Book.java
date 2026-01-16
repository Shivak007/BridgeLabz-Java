package objectorientedprogramming.constructors.level1;

class Book{
    private String author;
    private String title;
    private double price;

    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Book title: " + title);
        System.out.println("Written by: " + author);
        System.out.println("Price: ₹%.2f" + price);
    }
}
