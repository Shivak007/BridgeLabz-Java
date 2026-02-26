package designpatterns;

interface Item { void accept(Visitor v); }
class Book implements Item {
    public void accept(Visitor v){ v.visit(this); }
}
interface Visitor { void visit(Book b); }
class PriceCalculatorVisitor implements Visitor {
    public void visit(Book b){ System.out.println("Book Price Calculated"); }
}
public class VisitorExample {
    public static void main(String[] args){
        Item item=new Book();
        item.accept(new PriceCalculatorVisitor());
    }
}
