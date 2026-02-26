package designpatterns;
class OldPrinter { void oldPrint(){ System.out.println("Old Print"); } }
interface NewPrinter { void print(); }

class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter = new OldPrinter();
    public void print(){ oldPrinter.oldPrint(); }
}
public class Adapter {
    public static void main(String[] args){
        NewPrinter printer = new PrinterAdapter();
        printer.print();
    }
}
