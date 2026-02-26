package designpatterns;

class Memento { String state; Memento(String s){ state=s; } }
class Editor {
    String text;
    void setText(String t){ text=t; }
    Memento save(){ return new Memento(text); }
    void restore(Memento m){ text=m.state; }
}
public class MementoExample {
    public static void main(String[] args){
        Editor e=new Editor();
        e.setText("Draft");
        Memento m=e.save();
        e.setText("Final");
        e.restore(m);
        System.out.println(e.text);
    }
}