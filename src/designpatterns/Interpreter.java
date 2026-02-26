package designpatterns;
interface Expression { int interpret(); }
class AddExpression implements Expression {
    int a,b; AddExpression(int a,int b){this.a=a;this.b=b;}
    public int interpret(){ return a+b; }
}
public class Interpreter {
    public static void main(String[] args){
        System.out.println(new AddExpression(5,3).interpret());
    }
}
